package Assesments13;

public class Iron {
    String brand;
    boolean isSteamIron;
    int powerWatt;

    public Iron(String brand, boolean isSteamIron, int powerWatt) {
        this.brand = brand;
        this.isSteamIron = isSteamIron;
        this.powerWatt = powerWatt;
    }

    public String toString() {
        return "Iron: " + brand + ", Steam Iron? " + isSteamIron + ", Power: " + powerWatt + "W";
    }
}
