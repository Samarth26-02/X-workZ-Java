package Assesments9;

public class Board {
    private Capacitor capacitor;
    private int layers;

    public Board(){
       // System.out.println("no-arg constructor");
    }
    public void setCapacitor(Capacitor capacitor){
        this.capacitor=capacitor;
    }
    public void setLayers(int layers){
        this.layers=layers;
    }

    public void boardDetails(){
        System.out.println("Board capacitor:"+capacitor+"Layers:"+layers);
    }
}
