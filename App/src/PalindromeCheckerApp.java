public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";   // Change value to test

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("Program Completed.");
    }

    // Recursive method
    public static boolean isPalindrome(String word, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call with reduced problem size
        return isPalindrome(word, start + 1, end - 1);
    }
}