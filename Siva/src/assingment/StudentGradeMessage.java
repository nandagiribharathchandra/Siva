package assingment;
import java.util.Scanner;

public class StudentGradeMessage  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's grade: ");
        char grade = scanner.next().charAt(0);

        if (grade == 'A' || grade == 'a') {
            System.out.println("Excellent! .");
        } else if (grade == 'B' || grade == 'b') {
            System.out.println("Good job! .");
        } else if (grade == 'C' || grade == 'c') {
            System.out.println("Average ,improving.");
        } else if (grade == 'D' || grade == 'd') {
            System.out.println("need improvement .");
        } else if (grade == 'F' || grade == 'f') {
            System.out.println("Failed.");
        } else {
            System.out.println("Invalid grade entered.");
        
        }
    }}
       