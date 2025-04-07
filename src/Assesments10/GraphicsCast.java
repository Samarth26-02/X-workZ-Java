package Assesments10;

public class GraphicsCast {
    public void castGraphics(Graphics graphics) {
        graphics.drawLine();
        graphics.drawCircle();
        graphics.drawRectangle();
        graphics.setColor();
        graphics.render();

        if (graphics instanceof GraphicsDetails) {
            System.out.println("Casting to GraphicsDetails...");
            GraphicsDetails details = (GraphicsDetails) graphics;
            details.setResolution();
        }
    }
}