import java.util.HashSet;
import java.util.Set;

public class WordCount {
    public static int countDistinctWords(String text) {
        String[] words = text.split("\\W+");
        Set<String> distinctWords = new HashSet<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                distinctWords.add(word.toLowerCase());
            }
        }
        return distinctWords.size();
    }

    public static void main(String[] args) {
        // Example text
        String text = "Hello world! Welcome to the world of Java. Java is fun and Java is powerful.";

        // Counting distinct words 
        int distinctWordCount = countDistinctWords(text);

        // Display result
        System.out.println("Number of distinct words: " + distinctWordCount);
    }
}

