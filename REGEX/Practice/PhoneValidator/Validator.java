package REGEX.Practice.PhoneValidator;

public class Validator {

    public static boolean isValidRwandanMobile(String pattern, String input) {
        return input.matches(pattern);
    }
}
