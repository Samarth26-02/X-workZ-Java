package Assesments4;
class Paper {
    public static   void setPaperSize(String size) {
        System.out.println("Paper Size: " + size);
    }

    public static   void setPaperWeight(int weight) {
        System.out.println("Paper Weight: " + weight + "g");
    }

    public static   void setPaperType(String type) {
        System.out.println("Paper Type: " + type);
    }

    public static  void setPaperQuality(char quality, boolean isRecycled) {
        System.out.println("Quality: " + quality + ", Recycled: " + isRecycled);
    }

    public static  void setManufacturer(String manufacturer, double thickness) {
        System.out.println("Manufacturer: " + manufacturer + ", Thickness: " + thickness + " mm");
    }

    public static  void setPaperCost(double cost, int bulkQuantity, boolean isColored) {
        System.out.println("Cost: $" + cost + ", Bulk Quantity: " + bulkQuantity + ", Colored: " + isColored);
    }

    public static   void setPaperBrand(String brand, char grade, double opacity) {
        System.out.println("Brand: " + brand + ", Grade: " + grade + ", Opacity: " + opacity);
    }
}