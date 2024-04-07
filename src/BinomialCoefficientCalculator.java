import java.math.BigInteger;
import java.util.Scanner;

public class BinomialCoefficientCalculator {

    public static BigInteger calculateBinomialCoefficient(int n, int k) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            result = result.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        System.out.println("The binomial coefficient C(" + n + ", " + k + ") is: " + calculateBinomialCoefficient(n, k));
        scanner.close();
    }
}