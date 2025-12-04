package REGEX.Basics;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Practice for regex");

        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("thisispracticeforregexfoofoofoofoofoo");

        while(matcher.find()) {
            System.out.println("Here are the details for the matched regex: ");
            String substr = matcher.group();
            int start = matcher.start();
            int end = matcher.end();

            System.out.println("The matched substring: "+ substr + " starts at: " + start + " and ends at: " + end + " .");
        }


    }

}
