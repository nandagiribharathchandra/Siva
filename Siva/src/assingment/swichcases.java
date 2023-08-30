package assingment;

import java.util.Scanner;

public class swichcases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's grade: ");
        String grade = scanner.nextLine();

        String message = getMessageForGrade(grade);
        System.out.println(message);

        scanner.close();
    }

    public static String getMessageForGrade(String grade) {
        switch (grade.toUpperCase()) {
            case "A":
                return "Excellent! !";
            case "B":
                return "Good job! .";
            case "C":
                return "Average";
            case "D":
                return "Need Improvement.";
            case "F":
                return "You failed. .";
            default:
                return "Invalid grade entered.";
        }
    }
}
