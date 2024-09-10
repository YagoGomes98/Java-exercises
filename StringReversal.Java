public class StringReversal {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "Java is fun";
        System.out.println(reverseWords(sentence)); // Output: "fun is Java"
    }
}
