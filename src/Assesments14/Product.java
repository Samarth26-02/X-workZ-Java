package Assesments14;

public abstract class Product {
    int productNo;
    String productName;
    double price;
    int quantity;

    Product(int productNo){
        this.productNo=productNo;
    }
    Product(int productNo,String productName){
        this(productNo);
        this.productName=productName;
    }
    Product(int productNo,String productName,double price,int quantity){
        this(productNo,productName);
        this.price=price;
        this.quantity=quantity;
    }
}
