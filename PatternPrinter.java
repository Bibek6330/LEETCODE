public class PatternPrinter {
    public static void printRightAngleTriangle(int n) {
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print '*' for each column in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; // Number of rows
        printRightAngleTriangle(n);
    }
}

