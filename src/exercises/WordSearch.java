package exercises;

import java.util.Scanner;

public class WordSearch {

    private static final String ALICE = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
            "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
            "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
            "thought Alice 'without pictures or conversation?'";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(ALICE);
        System.out.println("What word would you like to search for within these sentences? ");
        String searchTerm = input.nextLine();
        input.close();
        boolean result = false;
        int index = ALICE.toLowerCase().indexOf(searchTerm.toLowerCase());
        int length = searchTerm.length();
        if (ALICE.toLowerCase().contains(searchTerm.toLowerCase())) {
            result = true;
        }
        System.out.println(result);
        System.out.println("Index: " + index);
        System.out.println("Length: " + length);

        if (result && index == 0) {
            System.out.println(ALICE.substring(length));
        } else {
            System.out.println(ALICE.substring(0, index) + ALICE.substring(index + length));
        }
    }

}
