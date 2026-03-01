import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   Welcome to Palindrome Checker App!   ");
        System.out.println("=========================================");
        System.out.println("\n--- UC2: Hardcoded Palindrome Check ---");
        String hardcoded = "madam";
        System.out.println("Checking hardcoded word: " + hardcoded);
        if (isPalindrome(hardcoded)) {
            System.out.println("\"" + hardcoded + "\" IS a palindrome.");
        } else {
            System.out.println("\"" + hardcoded + "\" is NOT a palindrome.");
        }
        System.out.println("\n--- UC3: User Input Palindrome Check ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check: ");
        String userInput = scanner.nextLine();
        if (isPalindrome(userInput)) {
            System.out.println("\"" + userInput + "\" IS a palindrome.");
        } else {
            System.out.println("\"" + userInput + "\" is NOT a palindrome.");
        }
        System.out.println("\n--- UC4: Case Insensitive Check ---");
        System.out.print("Enter a word (case insensitive check): ");
        String caseInput = scanner.nextLine();
        if (isPalindrome(caseInput.toLowerCase())) {
            System.out.println("\"" + caseInput + "\" IS a palindrome (case insensitive).");
        } else {
            System.out.println("\"" + caseInput + "\" is NOT a palindrome (case insensitive).");
        }
        System.out.println("\n--- UC5: Ignore Spaces & Special Characters ---");
        System.out.print("Enter a sentence or phrase: ");
        String phraseInput = scanner.nextLine();
        String cleaned = phraseInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (isPalindrome(cleaned)) {
            System.out.println("\"" + phraseInput + "\" IS a palindrome (ignoring spaces/special chars).");
        } else {
            System.out.println("\"" + phraseInput + "\" is NOT a palindrome (ignoring spaces/special chars).");
        }

        // UC6 — Multiple Words Check in a Loop
        System.out.println("\n--- UC6: Check Multiple Words ---");
        String continueCheck = "yes";
        while (continueCheck.equalsIgnoreCase("yes")) {
            System.out.print("Enter a word to check: ");
            String word = scanner.nextLine();
            String cleanedWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            if (isPalindrome(cleanedWord)) {
                System.out.println("\"" + word + "\" IS a palindrome.");
            } else {
                System.out.println("\"" + word + "\" is NOT a palindrome.");
            }
            System.out.print("Check another word? (yes/no): ");
            continueCheck = scanner.nextLine();
        }

        System.out.println("\n=========================================");
        System.out.println("   Thank you for using Palindrome Checker!");
        System.out.println("=========================================");

        scanner.close();
    }
    public static boolean isPalindrome(String str) {
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