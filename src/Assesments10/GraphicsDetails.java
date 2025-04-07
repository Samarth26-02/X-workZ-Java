package Assesments10;

public class GraphicsDetails extends Graphics{
    @Override
    public void drawLine() {
        System.out.println("Drawing a detailed line");
    }

    @Override
    public void drawCircle() {
        System.out.println("Drawing a detailed circle");
    }

    @Override
    public void drawRectangle() {
        System.out.println("Drawing a detailed rectangle");
    }

    @Override
    public void setColor() {
        System.out.println("Setting detailed color");
    }

    @Override
    public void render() {
        System.out.println("Rendering detailed graphics");
    }

    public void setResolution() {
        System.out.println("Setting display resolution");
    }
}