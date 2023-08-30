package assingment;



//Define an enum named 'Day' to represent days of the week
enum Day {
 SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
 public static void main(String[] args) {
     // Using enum values
     Day today = Day.WEDNESDAY;
     System.out.println("Today is " + today);

     // Switch statement with enum
     switch (today) {
         case MONDAY:
             System.out.println("It's the start of the week");
             break;
         case FRIDAY:
             System.out.println("It's almost the weekend");
             break;
         default:
             System.out.println("Just another day");
     }

     // Iterating over enum values
     System.out.println("Days of the week:");
     for (Day day : Day.values()) {
         System.out.println(day);
     }
 }
}
