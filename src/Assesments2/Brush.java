package Assesments2;
public class Brush {
    Color color;
    Brush(Color color){
        this.color=color;
    }
    public void clean(){
        System.out.println("running clean in Brush");
    }
    public void scrub(){
        System.out.println("Running scrub in Brush");
    }
}
