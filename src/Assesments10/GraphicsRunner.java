package Assesments10;

public class GraphicsRunner {
    public static void main(String[] args) {
        Graphics graphics = new Graphics();
        graphics.drawLine();
        graphics.drawCircle();
        graphics.drawRectangle();
        graphics.setColor();
        graphics.render();

        System.out.println("----------------------");

        Graphics graphics1 = new GraphicsDetails();
        graphics1.render();
        graphics1.setColor();
        graphics1.drawRectangle();
        graphics1.drawCircle();
        graphics1.drawLine();

        System.out.println("----------------------");

        GraphicsDetails graphicsDetails = new GraphicsDetails();
        graphicsDetails.drawLine();
        graphicsDetails.render();
        graphicsDetails.setColor();
        graphicsDetails.drawRectangle();
        graphicsDetails.drawCircle();
    }
}
