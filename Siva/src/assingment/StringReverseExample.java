package assingment;

public class StringReverseExample {
    public static String reverseWithStringBuilder(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseWithStringBuilder(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
