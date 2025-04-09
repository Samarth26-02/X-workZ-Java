package Assesments13;

public class GraphicsCard {
    String model;
    int vramGB;
    boolean supportsRayTracing;

    public GraphicsCard(String model, int vramGB, boolean supportsRayTracing) {
        this.model = model;
        this.vramGB = vramGB;
        this.supportsRayTracing = supportsRayTracing;
    }

    public String toString() {
        return "GraphicsCard: " + model + ", VRAM: " + vramGB + "GB, Ray Tracing? " + supportsRayTracing;
    }
}
