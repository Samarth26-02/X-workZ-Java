package Assesments9;

import javafx.scene.paint.Material;

public class Button {
    private Material material;
    private int noOfButtons;

    public Button(){
        System.out.println("no-arg constructor");
    }
    public void setMaterial(Material material){
        this.material=material;
    }
    public void setNoOfButtons(int noOfButtons){
        this.noOfButtons=noOfButtons;
    }
    public void buttonDetails(){
        System.out.println("Button material:"+material+"No of buttons:"+noOfButtons);
    }
}
