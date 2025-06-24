//remote.java

package Assesments9;

public class Remote {
    private Battery battery;
    private String brand;

    public Remote(){
        System.out.println("no-arg constructor");
    }
    public void setBattery(Battery battery){
        this.battery=battery;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    public void remoteDetails(){
        System.out.println("Remote battery:"+battery+"Brand:"+brand);
    }
}
