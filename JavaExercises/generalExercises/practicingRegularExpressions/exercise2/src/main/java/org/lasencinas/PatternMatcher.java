package org.lasencinas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        String regex = "[abc]@.";

        String source = "cric@jdojo.com is a valid email address";
        PatternMatcher.findPattern(regex, source);

        source = "kelly@jdojo.com is invalid";
        PatternMatcher.findPattern(regex, source);

        source = "a@band@yea@u";
        PatternMatcher.findPattern(regex, source);

        source = "There is an @ sign here";
        PatternMatcher.findPattern(regex, source);
    }

    public static void findPattern(String regex, String source) {
        // Compile regex into a Pattern object
        Pattern p = Pattern.compile(regex);

        // Get a Matcher object
        Matcher m = p.matcher(source);

        // Print regex and source text
        System.out.println("\nRegex:" + regex);
        System.out.println("Text:" + source);

        // Perform find
        boolean found = false;
        while (m.find()) {
            System.out.println("Matched Text:" + m.group() + ", Start:" + m.start() + ", " + "End:" + m.end());

            // We found at least one match. Set the found flag to true
            found = true;
        }

        if (!found) {
            // We did not find any match
            System.out.println("No match found");

            /**
             * Regex:[abc]@.
             * Text:cric@jdojo.com is a valid email address
             * Matched Text:c@j, Start:3, End:6
             *
             * Regex:[abc]@.
             * Text:kelly@jdojo.com is invalid
             * No match found
             *
             * Regex:[abc]@.
             * Text:a@band@yea@u
             * Matched Text:a@b, Start:0, End:3
             * Matched Text:a@u, Start:9, End:12
             *
             * Regex:[abc]@.
             * Text:There is an @ sign here
             * No match found
             */
        }
    }
}
