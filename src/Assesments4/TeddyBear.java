package Assesments4;
class TeddyBear {
    public static  void setName(String name) {
         System.out.println("TeddyBear Name: " + name); 
    }
    public static   void setSize(int size) {
         System.out.println("Size: " + size + " inches"); 
    }
    public static  void setColor(String color) {
         System.out.println("Color: " + color); 
    }
    public static   void setMaterial(String material, boolean isWashable) {
         System.out.println("Material: " + material + ", Washable: " + isWashable); 
    }
    public static   void setSoftness(double softness, char grade) {
         System.out.println("Softness: " + softness + ", Grade: " + grade); 
    }
    public static  void setPrice(double price, boolean hasAccessories, int accessoriesCount) {
         System.out.println("Price: $" + price + ", Accessories: " + accessoriesCount); 
    }
    public static  void setBrand(String brand, char qualityCode, double durability) {
         System.out.println("Brand: " + brand + ", Durability: " + durability + " years"); 
    }
}