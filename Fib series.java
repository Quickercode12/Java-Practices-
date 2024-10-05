import java.util.Scanner;
import java.util.Vector;

class Main {

    // Function to generate Fibonacci series
    static Vector<Integer> fib(int f) {

        Vector<Integer> vec = new Vector<>();

        // Special case when the user input is 1 or 2
        if (f == 1) {
            vec.add(0);  // First Fibonacci number is 0
            return vec;
        }

        if (f == 2) {
            vec.add(0);  // First Fibonacci number
            vec.add(1);  // Second Fibonacci number
            return vec;
        }

        // For input greater than 2, generate the Fibonacci series
        int first = 0;  // First Fibonacci number
        int second = 1; // Second Fibonacci number
        vec.add(first); // Add the first Fibonacci number to the vector
        vec.add(second); // Add the second Fibonacci number to the vector

        for (int i = 3; i <= f; i++) {
            int next = first + second;  // Calculate the next Fibonacci number
            vec.add(next);  // Add the next Fibonacci number to the vector
            first = second;
            second = next;
        }

        return vec;
    }

    public static void main(String[] args) {

        // Find Fibonacci series

        // Use Scanner class to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to print the Fibonacci series: ");
        int userInput = scanner.nextInt(); // Read the user's input

        // Generate the Fibonacci series up to 'userInput' terms
        Vector<Integer> vec = fib(userInput);

        // Print the Fibonacci series
        System.out.println("Fibonacci series:");
        for (int val : vec) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
