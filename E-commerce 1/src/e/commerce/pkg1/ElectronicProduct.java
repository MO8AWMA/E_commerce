package e.commerce.pkg1;
public class ElectronicProduct extends Product {
private String brand;
private int warrantyperiod;
public ElectronicProduct(int productid,String name,float price,String brand,int warrantyperiod){
    super(productid,name,price);
    this.brand=brand;
    this.warrantyperiod=Math.abs(warrantyperiod);
}
public void setbrand(String brand){
        this.brand=brand;
}
public void setwarrantyperiod(int warrantyperiod){
    this.warrantyperiod=Math.abs(warrantyperiod);
}
public void setName(String name) {
        this.name = name;
    }
public String getbarnd(){
return brand;
}
public int getwarrantyperiod(){
return warrantyperiod;
}
}
