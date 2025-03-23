package Assesments4;
class Tubelight {
    public static void setPower(int watts) {
         System.out.println("Tubelight Power: " + watts + "W"); 
    }
    public static   void setBrand(String brand) {
         System.out.println("Brand: " + brand); 
    }
    public static void setType(String type) {
         System.out.println("Tubelight Type: " + type); 
    }
    public static  void setColorTemp(int temperature, boolean isDimmable) {
         System.out.println("Color Temp: " + temperature + "K, Dimmable: " + isDimmable); 
    }
    public static   void setEfficiency(double efficiency, char rating) {
         System.out.println("Efficiency: " + efficiency + ", Rating: " + rating); 
    }
    public static  void setPrice(double price, boolean hasWarranty, int warrantyYears) {
         System.out.println("Price: $" + price + ", Warranty: " + warrantyYears + " years"); 
    }
    public static  void setSupplier(String supplier, char grade, double reliability) {
         System.out.println("Supplier: " + supplier + ", Reliability: " + reliability); 
    }
}