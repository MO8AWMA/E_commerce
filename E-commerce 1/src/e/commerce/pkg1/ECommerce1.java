package e.commerce.pkg1;
import java.util.Scanner;
public class ECommerce1 {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
ElectronicProduct e =new ElectronicProduct(1,"smartphone",(float)599.9,"samsung",1);
ClothingProduct c=new ClothingProduct(2,"T-shirt",(float)19.99,"medium","cotton");
BookProduct b = new BookProduct(3,"oop",(float)39.99,"o'reilly","X publications");    
System.out.println("welcome to the E-commerce system");
System.out.println("please enter your id");
int id =input.nextInt();
System.out.println("please enter your name");
String n=input.next();
System.out.println("please enter your address");
String add=input.next();
Customer customer=new Customer(id,n,add);
System.out.println("how many products you want to add");
int size=input.nextInt();
Cart cart =new Cart(id,size);
for(int i=0;i<size;i++){
System.out.print("which product would you like to add? ");
System.out.println("1-Smartphone 2- T-shirt 3-oop");
int choice=input.nextInt();
switch(choice){
    case 1:
cart.addproduct(e, i);
break;
    case 2:
cart.addproduct(c, i);
break;
    case 3:
cart.addproduct(b, i);
break;
}}
System.out.println("your total price is $"+cart.calculateprice());
System.out.println("would you like to place your order? 1-Yes  2-no");
int ans=input.nextInt();
Order order=new Order(id,1,cart.getproducts());
if(ans==1){
  cart.placeorder();
    System.out.println("here's your order's summary: ");
  order.printorderinfo(cart);
}
else if(ans==2){
        System.out.println("do you want to remove any product? 1-yes  2-no");
int answ =input.nextInt();
     if(answ==1){
         int an;
         do{
         System.out.println("enter index you want to remove");
         int index=input.nextInt();
         cart.removeproduct(index-1);        
         order.printorderinfo(cart);
         System.out.println("-----------------------------");
         System.out.println("do you want to remove anything else? 1-yes  2-no");
         an=input.nextInt();
         }while(an==1);
         cart.placeorder();
         order.printorderinfo(cart);
     }
     else{
         System.out.println("order has been canceled");
     }}
}}
