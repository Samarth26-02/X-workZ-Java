package Assesments2;
class Beer {
    public static   void setBeerBrand(String brand) {
        System.out.println("Beer Brand: " + brand);
    }

    public static   void setAlcoholContent(double percentage) {
        System.out.println("Alcohol Content: " + percentage + "%");
    }

    public static   void setVolume(int ml) {
        System.out.println("Volume: " + ml + " ml");
    }

    public static  void setBeerType(String type, boolean isImported) {
        System.out.println("Beer Type: " + type + ", Imported: " + isImported);
    }

    public static   void setStorageTemperature(double minTemp, double maxTemp) {
        System.out.println("Storage Temperature: " + minTemp + "°C to " + maxTemp + "°C");
    }

    public static  void setPrice(double price, int quantity, boolean isSeasonal) {
        System.out.println("Price: $" + price + ", Quantity: " + quantity + ", Seasonal: " + isSeasonal);
    }

    public static  void setBeerSupplier(String supplier, char grade, double rating) {
        System.out.println("Supplier: " + supplier + ", Grade: " + grade + ", Rating: " + rating);
    }
}