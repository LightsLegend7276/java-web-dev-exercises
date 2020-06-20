package exercises;

import java.util.Scanner;

public class AreaOfARectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle? ");
        int length = input.nextInt();
        System.out.println("What is the width of the rectangle? ");
        int width = input.nextInt();
        input.close();

        System.out.println("The are of the rectangle is " + length * width + ".");
    }

}
