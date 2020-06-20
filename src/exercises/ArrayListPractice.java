package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        ints.add(24);
        ints.add(78);
        ints.add(49);
        ints.add(29);
        ints.add(32);
        ints.add(385);
        ints.add(473);
        ints.add(834);
        ints.add(384);
        ints.add(477);

        ArrayListPractice.sumEvens(ints);

        List<String> words = new ArrayList<>();
//        words.add("pizza");
//        words.add("Launch");
//        words.add("Code");
//        words.add("Rocks");
//        words.add("coding");
//        words.add("java");
//        words.add("array");
//        words.add("list");
//        words.add("practice");
//        words.add("map");

        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] strArr = str.split(" |, |\\. |\\.");
        words = Arrays.asList(strArr);
        Scanner input = new Scanner(System.in);
        System.out.println("Length of the word: ");
        int length = input.nextInt();
        input.close();

        ArrayListPractice.fiveLetterWords(words, length);
    }

    public static void sumEvens(List<Integer> ints) {
        int sum = 0;
        for (Integer anInt : ints) {
            if (anInt % 2 == 0) {
                sum += anInt;
            }
        }
        System.out.println(sum);
    }

    public static void fiveLetterWords(List<String> list, int length) {
        for (String word : list) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }

}
