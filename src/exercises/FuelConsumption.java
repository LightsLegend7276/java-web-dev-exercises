package exercises;

import java.util.Scanner;

public class FuelConsumption {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven this trip? ");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas have you used up on this trip? ");
        double gas = input.nextDouble();
        input.close();

        System.out.println("Your fuel consumption is currently at " + miles / gas + " miles-per-gallon.");
    }

}
