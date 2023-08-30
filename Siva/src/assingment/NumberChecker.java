// Custom exception class for odd numbers
package assingment;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class NumberChecker {

    // Method to check if the number is odd and throw an exception if it is
    public static void checkIfEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Number is odd and not allowed.");
        }
    }

    public static void main(String[] args) {
        int inputNumber = 12; // Replace this with any number you want to check

        try {
            checkIfEven(inputNumber);
            System.out.println(inputNumber + " is an even number.");
        } catch (OddNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}