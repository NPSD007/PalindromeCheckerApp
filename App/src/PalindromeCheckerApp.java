public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";   // You can change this value

        String reversed = "";

        // Reverse using for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println("Original String : " + word);
            System.out.println("Reversed String : " + reversed);
            System.out.println("Result : It is a Palindrome.");
        } else {
            System.out.println("Original String : " + word);
            System.out.println("Reversed String : " + reversed);
            System.out.println("Result : It is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}