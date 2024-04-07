import java.util.Scanner;

public class FibonacciCalculator {

    public static long calculateFibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return calculateFibonacciRecursive(n - 1) + calculateFibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term number of the Fibonacci sequence: ");
        int termNumber = scanner.nextInt();
        System.out.println("The value at term " + termNumber + " in the Fibonacci sequence is: " + calculateFibonacciRecursive(termNumber));
        scanner.close();
    }
}