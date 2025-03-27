package Assesments9;

public class Wire {
    private Quality quality;
    private double length;

    public Wire(){
        System.out.println("no-arg constructor");
    }
    public void setQuality(Quality quality){
        this.quality=quality;
    }
    public void setLength(double length){
        this.length=length;
    }

    public void wireDetails(){
        System.out.println("Wire quality:"+quality+"Length:"+length);
    }
}
