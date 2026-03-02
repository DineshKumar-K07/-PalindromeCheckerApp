import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Palindrome Checker Menu ====");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch(choice) {

                case 1:
                    System.out.print("Enter a sentence: ");
                    String input = scanner.nextLine();

                    String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                    String reversed = "";

                    for(int i = cleaned.length() - 1; i >= 0; i--) {
                        reversed += cleaned.charAt(i);
                    }

                    if(cleaned.equals(reversed)) {
                        System.out.println("It is a Palindrome");
                    } else {
                        System.out.println("It is NOT a Palindrome");
                    }
                    break;

                case 2:
                    System.out.println("Exiting Application...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while(choice != 2);

        scanner.close();
    }
}