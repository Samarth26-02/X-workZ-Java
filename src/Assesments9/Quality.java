//this is for constructor example
package Assesments9;

public class Quality {
    private String cover;
    private int price;

    public Quality(){
        System.out.println("no-arg constructor");
    }
    public void setCover(String cover){
        this.cover=cover;
        cover="Fiber";
    }
    public void setPrice(int price){
        this.price=price;
        price=300;
    }
    public void qualityDetails(){
        System.out.println("Quality cover:"+cover+"Pricce:"+price);
    }
}
