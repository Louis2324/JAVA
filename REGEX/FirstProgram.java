package REGEX;
import java.util.regex.*;

public class FirstProgram {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]{8}");
        Matcher matcher = pattern.matcher("rwanda123isthebest");

        while(matcher.find() ) {
            String group = matcher.group();
            System.out.println(group);

            int start = matcher.start(); //inclusive
            int end = matcher.end(); //exclusive
            System.out.println("From " + start + " to "+end);
        }

        // or separator
        Pattern pt2 = Pattern.compile("a|b");
        Matcher m2 = pt2.matcher("a big bus");

        while(m2.find()) {
            String group = m2.group();
            System.out.println(group);

            int start = m2.start(); //inclusive
            int end = m2.end(); //exclusive
            System.out.println("From " + start + " to "+end);
        }

        //special characters
        System.out.println();
        System.out.println();
        System.out.println("Third regex matcher");
        Pattern pt3 = Pattern.compile("\\w");
        Matcher m3 = pt3.matcher("rca_RWANDA");

        while(m3.find()) {
            String group = m3.group();
            System.out.println(group);

            int start = m3.start(); //inclusive
            int end = m3.end(); //exclusive
            System.out.println("From " + start + " to "+end);
        }

    }


}
