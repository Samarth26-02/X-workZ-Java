class FoodItem {
  public static  void setFoodName(String name) {
        System.out.println("Food Item: " + name);
    }

    public static  void setCalories(int calories) {
        System.out.println("Calories: " + calories + " kcal");
    }

    public static void setPrice(double price) {
        System.out.println("Price: $" + price);
    }

    public static  void setNutrition(int protein, boolean isVegan) {
        System.out.println("Protein: " + protein + "g, Vegan: " + isVegan);
    }

    public static  void setCategory(String category, char grade) {
        System.out.println("Category: " + category + ", Grade: " + grade);
    }

    public static   void setExpirationDate(int days, boolean isPerishable, double storageTemp) {
        System.out.println("Expires in: " + days + " days, Perishable: " + isPerishable + ", Storage Temp: " + storageTemp + "°C");
    }

    public static   void setBrand(String brand, char qualityCode, double rating) {
        System.out.println("Brand: " + brand + ", Quality Code: " + qualityCode + ", Rating: " + rating + " stars");
    }
}