package Assesments7;

public class Satellite {
    private SatelliteType type;
    private double cost;
    private double weight;
    private double loadCapacity;

    public SatelliteType getType() {
        return type;
    }

    public void setType(SatelliteType type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
