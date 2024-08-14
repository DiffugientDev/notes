import java.util.*;

public class OccurrencesOfLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the letter
        System.out.print("Enter a letter: ");
        String l_input = sc.next();
        if (l_input.length() != 1) {
            System.out.println("Error: Please enter a single letter.");
            sc.close();
            return;
        }
        char letter = l_input.charAt(0);

        // Consume the newline left-over
        sc.nextLine();

        // Read the phrase
        System.out.print("Enter a word or a phrase: ");
        String word = sc.nextLine();

        sc.close();

        // Count occurrences
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }

        // Output result
        System.out.println("The letter '" + letter + "' occurs " + count + " times in the phrase.");
    }
}
