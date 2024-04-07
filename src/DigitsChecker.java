import java.util.Scanner;

public class DigitsChecker {

    public static boolean containsOnlyDigits(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            if (!Character.isDigit(inputString.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it contains only digits: ");
        String inputString = scanner.next();
        if (containsOnlyDigits(inputString)) {
            System.out.println("Yes, the input contains only digits.");
        } else {
            System.out.println("No, the input contains non-digit characters.");
        }
        scanner.close();
    }
}