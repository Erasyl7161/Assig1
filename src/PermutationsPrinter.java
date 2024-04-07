import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PermutationsPrinter {

    public static void printPermutations(String inputString) {
        printPermutations("", inputString);
    }

    private static void printPermutations(String prefix, String remainingChars) {
        int length = remainingChars.length();
        if (length == 0) {
            System.out.println(prefix);
        } else {
            Set<Character> usedChars = new HashSet<>();
            for (int i = 0; i < length; i++) {
                char currentChar = remainingChars.charAt(i);
                if (!usedChars.contains(currentChar)) {
                    usedChars.add(currentChar);
                    String newPrefix = prefix + currentChar;
                    String newRemainingChars = remainingChars.substring(0, i) + remainingChars.substring(i + 1, length);
                    printPermutations(newPrefix, newRemainingChars);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        printPermutations(inputString);
        scanner.close();
    }
}