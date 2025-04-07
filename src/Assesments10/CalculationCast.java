package Assesments10;

public class CalculationCast {
    public void castCalculation(Calculation calculation) {
        calculation.add();
        calculation.subtract();
        calculation.multiply();
        calculation.divide();
        calculation.modulus();

        if (calculation instanceof CalculationDetails) {
            System.out.println("calculation casting");
            CalculationDetails details = (CalculationDetails) calculation;
            details.calculatePower();
        }
    }
}
