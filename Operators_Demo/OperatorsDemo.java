
public class OperatorsDemo {
    public static void main(String[] args) {
        System.out.println("Operators Demo\n");
        // Arithmetic Operators
        int a = 10, b = 5;
        boolean x = true, y = false;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment Operators
        int c = 15;
        System.out.println("\nAssignment Operators:");
        System.out.println("c += 5: " + (c += 5));
        System.out.println("c -= 5: " + (c -= 5));
        System.out.println("c *= 2: " + (c *= 2));
        System.out.println("c /= 3: " + (c /= 3));

        //Unary Operators
        int d = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("The Post Increment Value is : " + (d++));
        System.out.println("The pre increment value is : " + (++d));
        System.out.println("The post decrement value is : " + (d--));
        System.out.println("The pre decrement value is : " + (--d));
    }
}