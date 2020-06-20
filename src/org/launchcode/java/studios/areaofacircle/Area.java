package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String radius = "-";
        int counter = 0;
        while (radius.startsWith("-")) {
            if (counter > 0) {
                System.out.print("Please enter only positive numbers. ");
            }
            System.out.println("Enter a radius: ");
            radius = input.nextLine();
            counter++;
        }
        input.close();
        try {
            Double r = Double.parseDouble(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(r));
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
