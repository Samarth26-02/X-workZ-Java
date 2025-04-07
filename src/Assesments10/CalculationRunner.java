package Assesments10;

public class CalculationRunner {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.add();
        calculation.subtract();
        calculation.multiply();
        calculation.divide();
        calculation.modulus();

        System.out.println("----------------------");

        Calculation calculation1 = new CalculationDetails();
        calculation1.modulus();
        calculation1.divide();
        calculation1.multiply();
        calculation1.subtract();
        calculation1.add();

        System.out.println("----------------------");

        CalculationDetails calculationDetails = new CalculationDetails();
        calculationDetails.add();
        calculationDetails.modulus();
        calculationDetails.divide();
        calculationDetails.multiply();
        calculationDetails.subtract();
        calculationDetails.calculatePower();

        System.out.println("----------------------");

        CalculationCast cast = new CalculationCast();
        cast.castCalculation(calculation);
        cast.castCalculation(calculation1);
    }
}
