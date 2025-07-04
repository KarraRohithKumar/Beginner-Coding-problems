package String_problems;

import java.util.Scanner;

public class No_of_wordsina_sentence {
    public static void main(String[] args) {
        // for finding the number of words
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a sentence : ");
        String sentence = sc.nextLine();
        String space = " ";// creating a space
        int words = 1;// the below condition counts the number of spaces but we have one extra word
                      // than the spaces so we take it as word 1
        for (int i = 0; i < sentence.length(); i++) {
            if (space.charAt(0) == sentence.charAt(i)) {
                words++;
            }
        }
        System.out.println("No_of_words are " + words);
    }
}
