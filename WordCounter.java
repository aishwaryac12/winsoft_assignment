// Q3:Write a Java Program to count the number of words in a string using HashMap.


import java.util.HashMap;
import java.util.StringTokenizer;

public class WordCounter {
    public static void main(String[] args) {
        String input = "Write a Java Program to count the number of words in a string using HashMap.";
        countWords(input);
    }

    public static void countWords(String input) {
        HashMap<String, Integer> wordMap = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word counts:");
        for (String word : wordMap.keySet()) {
            System.out.println(word + ": " + wordMap.get(word));
        }
    }
}