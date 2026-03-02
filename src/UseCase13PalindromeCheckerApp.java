import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Performance Comparison of Palindrome Algorithms ===");
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(cleaned);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(cleaned);
        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;
        long startTwoPointer = System.nanoTime();
        boolean twoPointerResult = twoPointerPalindrome(cleaned);
        long endTwoPointer = System.nanoTime();
        long twoPointerTime = endTwoPointer - startTwoPointer;

        System.out.println("\n===== RESULTS =====");
        System.out.println("Stack Result       : " + stackResult);
        System.out.println("Deque Result       : " + dequeResult);
        System.out.println("Two Pointer Result : " + twoPointerResult);

        System.out.println("\n===== EXECUTION TIME (in nanoseconds) =====");
        System.out.println("Stack Time       : " + stackTime);
        System.out.println("Deque Time       : " + dequeTime);
        System.out.println("Two Pointer Time : " + twoPointerTime);

        scanner.close();
    }

    public static boolean stackPalindrome(String str) {
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

    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
    public static boolean twoPointerPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}