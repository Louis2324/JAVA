package REGEX.Practice.Text;

public class Main {
    public static void main (String[] args) {
        String randomString = "Build a function manipulateText that receives a regex pattern  and a String of text. The function should return the String without all vowels, numbers, space and all special characters";
        String pattern = "[aeiouAEIOU\\d\\W_]+";
        String cleanString = TextManipulator.manipulateText(pattern,randomString);


        System.out.println("Cleaned Up string: " + cleanString);

    }

}
