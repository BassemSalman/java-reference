package LanguageBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String regex = "ab+c";
        Pattern pattern = Pattern.compile(regex); // to use regex we should compile the string first
        String input = "abbbc";
        
        Matcher matcher = pattern.matcher(input); // Create a matcher object for the input string
        boolean isMatch = matcher.matches(); // Check if the entire input matches the pattern
        

        while (matcher.find()) { // Find all matches in the input
            String match = matcher.group(); // Get the matched string
            System.out.println("Matched: " + match);
        }


        System.out.println("Is there a match? " + isMatch);
    }
}


/*

.: Matches any single character.
*: Matches zero or more occurrences of the preceding character or group.
+: Matches one or more occurrences of the preceding character or group.
?: Matches zero or one occurrence of the preceding character or group.
|: Matches either the expression before or after the vertical bar.
{n,m}
{n}

\d digit
\w word
[]: Matches any single character within the brackets.
[^]: Matches any single character not within the brackets.
(): Groups multiple tokens together and creates a capturing group. 
 


 [a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}
 1 or more men hol
 w @
 w 1 or more men holik
 w \\. yaane l no2ta since l no2ta lahal ela maana
 then 2 or more men holik
 */