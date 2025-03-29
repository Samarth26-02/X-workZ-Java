package Assesments9;

public class Screw {
    //Declaring two private variables in screw
    private String material;
    private int size;

    public Screw(){
        System.out.println("no-arg constructor");
    }
    public void setMaterial(String material){
        this.material=material;
    }
    public void setSize(int size){
        this.size=size;
    }

    public void screwDetails(){
        System.out.println("Screw material:"+material+"Size:"+size);
    }
}
