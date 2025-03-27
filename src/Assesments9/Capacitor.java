package Assesments9;

public class Capacitor {
    private String capacitance;
    private int price;

    public Capacitor(){
        System.out.println("no-arg constructor");
    }
    public void setCapacitance(String capacitance){
        this.capacitance=capacitance;
        capacitance="7 micro Farad";
    }
    public void setPrice(int price){
        this.price=price;
        price=30;
    }
    public void capacitorDetails(){
        System.out.println("Capacitor capacitance:"+capacitance+"Price:"+price);
    }
}
