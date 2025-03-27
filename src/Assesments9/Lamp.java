package Assesments9;

public class Lamp {
    private Warranty warranty;
    private String type;

    public Lamp(){
        System.out.println("no-arg constructor");
    }
    public void setWarranty(Warranty warranty){
        this.warranty=warranty;
    }
    public void setType(String type){
        this.type=type;
    }

    public void lampInfo(){
        System.out.println("Lamp type:"+type);
        warranty.lampDetails();
    }
}
