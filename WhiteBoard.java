class WhiteBoard {
    public static  void setSize(String size) {
         System.out.println("WhiteBoard Size: " + size); 
    }
    public static void setType(String type) {
         System.out.println("WhiteBoard Type: " + type); 
    }
    public static  void setPrice(double price) {
         System.out.println("Price: $" + price);
    }
    public static void setMaterial(String material, char grade) {
         System.out.println("Material: " + material + ", Grade: " + grade); 
    }
    public static  void setUsage(boolean isMagnetic, int lifespan) {
         System.out.println("Magnetic: " + isMagnetic + ", Lifespan: " + lifespan + " years"); 
    }
    public static  void setBrand(String brand, char quality, double durability) {
         System.out.println("Brand: " + brand + ", Durability: " + durability + " years"); 
    }
    public static  void setSupplier(String supplier, char code, double rating) {
         System.out.println("Supplier: " + supplier + ", Rating: " + rating); 
    }
}