import java.util.Stack;

/**
 * Write a program that, given a chain of characters, displays it in reverse. Use a stack.
 */

public class ExerciseStack {
    public static void main(String[] args) {
        String string = "Supercalifragilisticexpialidocious";
        Stack<Character> stack = new Stack<>();

        for (int index = 0; index < string.length(); index++) {
            stack.push(string.charAt(index));
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }
}
