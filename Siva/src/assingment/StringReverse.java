package assingment;
public class StringReverse {

    public static String reverseWithMethod(String input) {
        // Use StringBuilder to reverse the input string
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String reversedString = reverseWithMethod(inputString);
        System.out.println("Reversed string using method: " + reversedString);
    }
}

