public class Result{
    public static void main(String[] args) {
        // Ladder Class
        Ladder.setLadderHeight(10);
        Ladder.setLadderMaterial("Aluminum");
        Ladder.setLadderWeightCapacity(150.5);
        Ladder.setLadderSteps(6, true);
        Ladder.setLadderType("Extendable", 'A');
        Ladder.setLadderPrice(250.99, true, 5);
        Ladder.setLadderBrand("StrongStep", 'B', 10.5);
        
        // FoodItem Class
        FoodItem.setFoodName("Pizza");
        FoodItem.setCalories(300);
        FoodItem.setPrice(12.99);
        FoodItem.setNutrition(15, false);
        FoodItem.setCategory("Fast Food", 'A');
        FoodItem.setExpirationDate(3, true, 4.5);
        FoodItem.setBrand("Domino's", 'A', 4.7);
        
        // Paper Class
        Paper.setPaperSize("A4");
        Paper.setPaperWeight(80);
        Paper.setPaperType("Glossy");
        Paper.setPaperQuality('A', true);
        Paper.setManufacturer("JK Paper", 0.2);
        Paper.setPaperCost(5.50, 500, false);
        Paper.setPaperBrand("HP", 'B', 92.5);
        
        // Beer Class
        Beer.setBeerBrand("Corona");
        Beer.setAlcoholContent(4.5);
        Beer.setVolume(500);
        Beer.setBeerType("Lager", true);
        Beer.setStorageTemperature(2.0, 6.0);
        Beer.setPrice(2.99, 24, false);
        Beer.setBeerSupplier("Heineken Inc.", 'A', 4.8);
        
        // TeddyBear Class
        TeddyBear.setSize(15);
        TeddyBear.setColor("Brown");
        TeddyBear.setMaterial("Cotton",true);
        TeddyBear.setSoftness(20.5,'A');
        TeddyBear.setPrice(199.9,true,3);
        TeddyBear.setBrand("Teddys",'A',3.0);
        TeddyBear.setName("Tom");

        //WhiteBoard Class
        WhiteBoard.setSize("Big");
        WhiteBoard.setPrice(499.9);
        WhiteBoard.setType("White");
        WhiteBoard.setMaterial("Erasable",'A');
        WhiteBoard.setUsage(true,10);
        WhiteBoard.setBrand("Dry Whipe",'A',5.0);
        WhiteBoard.setSupplier("Amazon",'M',4.5);

        //Tubelight Class
        Tubelight.setBrand("Ujwal");
        Tubelight.setPower(10);
        Tubelight.setType("LED");
        Tubelight.setEfficiency(4.5,'B');
        Tubelight.setColorTemp(30,false);
        Tubelight.setPrice(250.9,true,5);
        Tubelight.setSupplier("Flipkart",'A',3.0);
        // Output finished execution
        System.out.println("\nAll methods executed successfully.");
    }
}