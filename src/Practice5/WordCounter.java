package Practice5;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCounter {
    static void main() {
        Map<String, Integer> wordFreq = new HashMap<>();

        // Reading and counting
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Here's just regex grouping
                String[] words = line.split("[ ,.;:!?]");
                Arrays.stream(words)
                    // Filter out "strings" which contains only whitespaces or which empty
                    .filter(token -> !token.isBlank())
                    .map(String::toLowerCase)
                    .forEach(
                            word -> wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1)
                    );
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Sorting
        Map<String, Integer> sortedWordFreq = wordFreq.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        // Writing results to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {
            for (Map.Entry<String, Integer> entry : sortedWordFreq.entrySet()) {
                writer.write(String.format("%s: %d\n", entry.getKey(), entry.getValue()));
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
