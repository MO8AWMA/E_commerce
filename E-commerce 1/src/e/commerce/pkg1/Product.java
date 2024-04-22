package e.commerce.pkg1;
public class Product {
protected int productid;
protected String name;
protected float price;
public Product(int productid,String name,float price){
    this.productid=Math.abs(productid);
    this.name=name;
    this.price=Math.abs(price);
}
public void setproductid(int productid){
    this.productid=Math.abs(productid);
}
public void setname(String name){
    this.name=name;
}
public void setprice(float price){
    this.price=Math.abs(price);
}
public int getproductid(){
    return productid;
}
public String getname(){
    return name;
}
public float getprice(){
    return price;
} 
}

