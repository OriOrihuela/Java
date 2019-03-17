import java.util.TreeSet;

/**
 * Given the following String, write on the screen the characters by which it is formed,
 * and only once the repeated characters.
 */

public class Exercise2 {
    public static void main(String[] args) {
        String sentence = "dabale arroz a la zorra el abad";

        TreeSet<Character> characters = new TreeSet<>();

        for (int i = 0; i < sentence.length(); i++)
            characters.add(sentence.charAt(i));

        for (Character letter: characters) {
            System.out.println(letter + " ");
        }
    }
}
