package Assesments9;

public class Panel {
    private String type;
    private int resolution;

    public Panel(){
        System.out.println("no-arg constructor");
    }
    public void setType(String type){
        this.type=type;
    }
    public void setResolution(int resolution){
        this.resolution=resolution;
    }

    public void panelDetails(){
        System.out.println("Panel type:"+type+"Resolution:"+resolution);
    }
}
