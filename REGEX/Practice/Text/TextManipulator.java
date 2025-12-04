package REGEX.Practice.Text;

public class TextManipulator {
    public static  String manipulateText(String pattern, String text) {
        return text.replaceAll(pattern,"");
    }
}
