class Ladder {
  public static  void setLadderHeight(int height) {
        System.out.println("Ladder Height: " + height + " feet");
    }
    
  public static  void setLadderMaterial(String material) {
        System.out.println("Ladder Material: " + material);
    }
    
   public static  void setLadderWeightCapacity(double capacity) {
        System.out.println("Ladder Weight Capacity: " + capacity + " kg");
    }

  public static   void setLadderSteps(int steps, boolean isFoldable) {
        System.out.println("Ladder Steps: " + steps + ", Foldable: " + isFoldable);
    }
    
   public static void setLadderType(String type, char grade) {
        System.out.println("Ladder Type: " + type + ", Grade: " + grade);
    }

   public static void setLadderPrice(double price, boolean hasWarranty, int warrantyYears) {
        System.out.println("Ladder Price: $" + price + ", Warranty: " + hasWarranty + ", Warranty Period: " + warrantyYears + " years");
    }
    
   public static void setLadderBrand(String brand, char qualityCode, double durability) {
        System.out.println("Brand: " + brand + ", Quality Code: " + qualityCode + ", Durability: " + durability + " years");
    }
}