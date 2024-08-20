public class PalindromeChecker {
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to format and print the result
    public static void printPalindromeResult(String str) {
        boolean result = isPalindrome(str);
        System.out.println("\"" + str + "\" - " + result);
    }

    public static void main(String[] args) {
        // Test cases
        printPalindromeResult("racecar"); // Output: "racecar" - true
        printPalindromeResult("hello");   // Output: "hello" - false
    }
}
