package lt.ng.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramSorter {
    private final List<String> inputs;
    private final Map<String, List<String>> groupedWords;

    public AnagramSorter(List<String> inputs) {
        this.inputs = inputs;
        groupedWords = new HashMap<>();
    }

    public void groupWords() {
        for (String word : inputs) {
            List<String> words = new ArrayList<>();

            word = word.trim();
            words.add(word);
            String key = getKey(word.toLowerCase());

            checkKeyAndGroup(key, words);
        }

        groupedWords.forEach((key, words) -> Collections.sort(words));
        // todo sorting by size
//        groupedWords.entrySet()
//                .stream()
//                .sorted(Comparator.comparing(entry -> entry.getValue().size(), Comparator.reverseOrder()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    private String getKey(String word) {
        int length = word.length();
        char[] letters = word.toCharArray();
        int wordValueInt = 0;

        for (char letter : letters) {
            wordValueInt += letter;
        }

        return String.format("L%d_V%d", length, wordValueInt);
    }

    private void checkKeyAndGroup(String key, List<String> words) {
        List<String> groupedWords = this.groupedWords.get(key);
        if (groupedWords == null) {
            this.groupedWords.put(key, words);
        } else {
            groupedWords.addAll(words);
            this.groupedWords.put(key, groupedWords);
        }
    }

    public String getResults() {
        return String.format("Grouped anagram words: \n[\n%s\n]", mapToString());
    }

    private String mapToString() {
        StringBuilder sb = new StringBuilder();
        groupedWords.forEach((key, words) -> {
            sb.append("\t[");
            words.forEach(word -> sb.append("\"").append(word).append("\", "));
            int length = sb.length();
            sb.replace(length - 2, length - 1, "],\n");
        });
        int length = sb.length();
        sb.delete(length - 3, length - 1);
        return sb.toString();
    }
}
