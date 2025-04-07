package Assesments10;

public class CalculationDetails extends Calculation {
    @Override
    public void add() {
        System.out.println("Performing detailed addition");
    }

    @Override
    public void subtract() {
        System.out.println("Performing detailed subtraction");
    }

    @Override
    public void multiply() {
        System.out.println("Performing detailed multiplication");
    }

    @Override
    public void divide() {
        System.out.println("Performing detailed division");
    }

    @Override
    public void modulus() {
        System.out.println("Performing detailed modulus operation");
    }

    public void calculatePower() {
        System.out.println("Calculating power operation");
    }
}
