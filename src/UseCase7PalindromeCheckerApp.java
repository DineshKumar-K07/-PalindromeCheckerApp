import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Deque Based Optimized Palindrome Checker ===");
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Step 1: Clean input (remove special characters and convert to lowercase)
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Step 3: Insert characters into deque
        for (char ch : cleaned.toCharArray()) {
            deque.addLast(ch);  // insert at rear
        }

        boolean isPalindrome = true;

        // Step 4: Compare front and rear elements
        while (deque.size() > 1) {

            char front = deque.removeFirst();  // remove from front
            char rear = deque.removeLast();    // remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Step 5: Display Result
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        scanner.close();
    }
}