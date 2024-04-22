package e.commerce.pkg1;
public class Customer {
private int customerid;
private String name;
private String address;
public Customer(int customerid,String name,String address){
    this.customerid=Math.abs(customerid);
     this.name=name;
    this.address=address;
}
public void setcustomerid(int customerid){
    this.customerid=Math.abs(customerid);
}
public void setname(String name){
    this.name=name;
}
public void setaddress(String address){
    this.address=address;
    }
public int getcustomerid(){
return customerid;
}
public String getname(){
return name;
}
public String getaddress(){
return address;
}
}

