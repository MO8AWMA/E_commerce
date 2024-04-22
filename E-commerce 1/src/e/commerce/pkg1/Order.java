package e.commerce.pkg1;
public class Order {
private int customerid;
private int orderid;
protected Product [] products;
private float totalprice;
public Order(int customerid,int orderid,Product[]products){
     this.customerid=Math.abs(customerid);
     this.orderid=orderid;
     this.products=products;
}
public void setcustumerid(int customerid){
    this.customerid=Math.abs(customerid);
}
public int getcustomerid(){
return customerid;    
}
public void setorderid(int orderid){
this.orderid=orderid;    
}
public int getorderid(){
    return orderid;
}
public void printorderinfo(Cart total){
System.out.println("Order ID: "+orderid);
System.out.println("Customer ID: "+customerid);
System.out.println("Products: ");
for(Product product : products){
if(product!=null){
    System.out.println(product.name+" - $"+product.price);
}}
System.out.println("Total price: "+total.calculateprice());
}
}
