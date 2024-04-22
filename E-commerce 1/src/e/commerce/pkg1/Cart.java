package e.commerce.pkg1;
public class Cart {
private int customerid;
private int nproducts ;
protected Product [] products;
public Cart(int customerid,int nproducts){
 this.customerid=Math.abs(customerid);
 this.nproducts=nproducts;
 this.products=new Product[nproducts];
}
public void setcustomerid(int customerid){
    this.customerid=Math.abs(customerid);
}
public void setnproducts(int nproducts){
    this.nproducts=nproducts;
}
public void setproducts(Product[] products){
    this.products=products;
}
public Product[] getproducts(){
    return products;
}
public void addproduct(Product p,int index){
    products[index]=p;
}
public void removeproduct(int index){
    products[index]=null;
}
public int getcustomerid(){
return customerid;
}
public int getnproducts(){
return nproducts;
}
public float calculateprice(){
float totalprice=0;    
for(Product product:products){
    if(product!=null){
totalprice+=product.getprice();
}}
return totalprice;
}
public void placeorder(){
    System.out.println("order place successfully");
}
}