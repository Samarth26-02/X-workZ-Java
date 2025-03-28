package Assesments9;

public class Battery {
    private double voltage;
    private String type;

    public Battery(){
        //printing no-argument constructor
        System.out.println("no-arg constructor");
    }
    public void setVoltage(double voltage){
        this.voltage=voltage;
        voltage=5.0;
    }
    public void setType(String type){
        this.type=type;
        type="Lead";
    }

    public void batteryDetails(){
        System.out.println("Battery voltage:"+voltage+"Type:"+type);
    }
}
