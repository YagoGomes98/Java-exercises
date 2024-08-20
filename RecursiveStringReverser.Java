public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseRecursive(input);
        System.out.println("Reversed String (Recursive): " + reversed);
    }

    public static String reverseRecursive(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }
}
