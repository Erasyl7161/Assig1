import java.util.Scanner;

public class GreatestCommonDivisorCalculator {

    public static long calculateGCD(long number1, long number2) {
        if (number2 == 0) {
            return number1;
        }
        return calculateGCD(number2, number1 % number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        long number1 = scanner.nextLong();
        System.out.print("Enter the second number: ");
        long number2 = scanner.nextLong();
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + calculateGCD(number1, number2));
        scanner.close();
    }
}