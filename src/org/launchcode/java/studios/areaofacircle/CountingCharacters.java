package org.launchcode.java.studios.areaofacircle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

//    private static final String QUOTE = "If the product of two terms is zero then common sense " +
//            "says at least one of the two terms has to be zero to start with. " +
//            "So if you move all the terms over to one side, you can put the quadratics into a " +
//            "form that can be factored allowing that side of the equation to equal zero. " +
//            "Once you’ve done that, it’s pretty straightforward from there.";

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("studio.txt");
        try (Scanner sc = new Scanner(file)) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter text you would like analyzed: ");
//        String QUOTE = input.nextLine();
//        input.close();
            while (sc.hasNextLine()) {
                String QUOTE = sc.nextLine();
                Map<Character, Integer> charCount = new HashMap<>();
                for (char letter : QUOTE.toLowerCase().toCharArray()) {
                    if (!(letter >= 'a' && letter <= 'z')) {
                        continue;
                    }
                    if (!charCount.containsKey(letter)) {
                        charCount.put(letter, 1);
                    } else {
                        charCount.put(letter, charCount.get(letter) + 1);
                    }
                }
                for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
