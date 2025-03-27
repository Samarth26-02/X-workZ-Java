package Assesments9;

import java.rmi.Remote;

public class Projector {
    Len lens;
    Lamp lamp;
    Port port;
    Wire wire;
    Board board;
    Button button;
    Panel panel;
    Remote remote;
    Screw screw;

    public Projector(){
        lens=new Len();
        lamp=new Lamp();
        port=new Port();
        wire=new Wire();
        board=new Board();
        button=new Button();
        panel=new Panel();
        //remote=new Remote();
        screw=new Screw();
    }

    public void projectorDetails(){
        System.out.println("Projector is starting....");
    }
}
