
public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        System.out.println("Conditional Statements Demo");
        // if statement
        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }

        // if-else statement
        int number = 15;
        if (number%2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // if-else-if ladder
        int score = 75;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}