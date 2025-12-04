package REGEX.Practice.DateValidator;

import java.util.regex.*;

public class DateValidator {
    public static final String pattern = "(\\d{2})-(\\d{2})-(\\d{4})";

    public static String validateAndRefactor(String date) {
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(date);

        if (mat.matches()) {
            return mat.replaceAll("$3-$2-$1");
        }else {
            return "Invalid input (Enter a date of format DD-MM-YYYY";
        }
    }
}
