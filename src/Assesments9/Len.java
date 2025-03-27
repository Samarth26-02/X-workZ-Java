package Assesments9;

public class Len {
    private String focalLength;
    private String material;

    public Len(){
        System.out.println("no-arg constructor");
    }

    public void setFocalLength(String focalLength){
        this.focalLength=focalLength;
    }
    public void setMaterial(String material){
        this.material=material;
    }

    public void lenDetails(){
        System.out.println("Len focal length:"+focalLength+"Material:"+material);
    }
}
