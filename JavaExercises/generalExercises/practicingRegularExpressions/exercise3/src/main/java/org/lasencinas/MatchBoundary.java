package org.lasencinas;

public class MatchBoundary {
    public static void main(String[] args) {
        // Prepare regular expression. Use \\b to get \b inside the string literal.
        String regex = "\\bapple\\b";
        String replacementStr = "orange";
        String inputStr = "I have an apple and five pineapples";
        String newStr = inputStr.replaceAll(regex, replacementStr);

        System.out.println("Regular Expression: " + regex);
        System.out.println("Input String: " + inputStr);
        System.out.println("Replacement String: " + replacementStr);
        System.out.println("New String: " + newStr);

        /**
         * Regular Expression: \bapple\b
         * Input String: I have an apple and five pineapples
         * Replacement String: orange
         * New String: I have an orange and five pineapples
         */
    }
}
