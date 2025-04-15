package Assesments14;

public class Electronics extends Product{
    Electronics(int prductNo){
        super(prductNo);
    }
    Electronics(int productNo,String productName){
        super(productNo,productName);
    }
    Electronics(int productNo,String productName,double price,int quantity){
        super(productNo,productName,price,quantity);
    }

    void display(){
        System.out.println("Product No:"+productNo+"Product Name:"+productName+"Price:"+price+"Quantity:"+quantity);
    }
}
