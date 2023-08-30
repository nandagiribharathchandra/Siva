package assingment;


import java.util.ArrayList;

public class arraylistexample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding integers to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        
        // Calculating the sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Printing the sum
        System.out.println("Sum of the integers: " + sum);
    }
}
