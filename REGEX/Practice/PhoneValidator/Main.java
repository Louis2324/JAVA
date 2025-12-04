package REGEX.Practice.PhoneValidator;

public class Main {

    public static void main(String[] args) {
        String pattern = "^(\\+2507\\d{8}|07\\d{8})$";

        System.out.println("Checking if (+250788888888) is a valid Rwandan mobile number: "+Validator.isValidRwandanMobile(pattern, "+250788888888"));
        System.out.println("Checking if (+250728888888) is a valid Rwandan mobile number: "+Validator.isValidRwandanMobile(pattern, "+250728888888"));
        System.out.println("Checking if (+250738888888) is a valid Rwandan mobile number: "+Validator.isValidRwandanMobile(pattern, "+250738888888"));
        System.out.println("Checking if (0788888888)    is a valid Rwandan mobile number: "+Validator.isValidRwandanMobile(pattern, "0788888888"));
        System.out.println("Checking if (0988888888)    is a valid Rwandan mobile number: "+Validator.isValidRwandanMobile(pattern, "0988888888"));
        System.out.println("Checking if (+256788843646) is a valid Rwandan mobile number: "+Validator.isValidRwandanMobile(pattern, "+256788843646"));
    }
}
