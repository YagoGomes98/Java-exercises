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
}
