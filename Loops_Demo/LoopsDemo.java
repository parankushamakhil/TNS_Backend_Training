
public class LoopsDemo {
    public static void main(String[] args) {
        // Simple for loop
        System.out.println("for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("  i = " + i);
        }

        // Enhanced for loop 
        System.out.println("\n enhanced for loop:");
        int[] numbers = {2, 4, 6, 8};
        for (int n : numbers) {
            System.out.println("  n = " + n);
        }

        // while loop
        System.out.println("\n while loop:");
        int w = 3;
        while (w > 0) {
            System.out.println("  w = " + w);
            w--;
        }

        // do-while loop 
        System.out.println("\n do-while loop:");
        int d = 0;
        do {
            System.out.println("  d = " + d);
            d++;
        } while (d < 1);

        // Nested loops 
        System.out.println("\n nested for loops (3x3):");
        for (int r = 1; r <= 3; r++) {
            for (int c = 1; c <= 3; c++) {
                System.out.print((r * c) + (c < 3 ? "\t" : "\n"));
            }
        }
    }
}