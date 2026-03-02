import java.util.Scanner;
import java.util.Stack;
class PalindromeChecker {
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return isPalindromeUsingStack(cleaned);
    }
    private boolean isPalindromeUsingStack(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("=== OOP Based Palindrome Checker ===");
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        scanner.close();
    }
}