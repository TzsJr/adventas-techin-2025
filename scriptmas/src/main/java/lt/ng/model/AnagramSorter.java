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
    private Map<String, List<String>> groupedAndSortedWords;

    public AnagramSorter(List<String> inputs) {
        this.inputs = inputs;
    }

    public void groupWords() {
        Map<String, List<String>> groupedWords = new HashMap<>();
        for (String word : inputs) {
            List<String> words = new ArrayList<>();

            word = word.trim();
            words.add(word);
            String key = getKey(word.toLowerCase());

            checkKeyAndGroup(key, words, groupedWords);
        }

        groupedWords.forEach((key, words) -> Collections.sort(words));
        groupedAndSortedWords = sortByValueSize(groupedWords);
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

    private void checkKeyAndGroup(String key, List<String> words, Map<String, List<String>> groupedWordsMap) {
        List<String> groupedWords = groupedWordsMap.get(key);
        if (groupedWords == null) {
            groupedWordsMap.put(key, words);
        } else {
            groupedWords.addAll(words);
            groupedWordsMap.put(key, groupedWords);
        }
    }

    private Map<String, List<String>> sortByValueSize(Map<String, List<String>> map) {
        return map.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(en -> -en.getValue().size()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new));
    }

    public String getResults() {
        return String.format("Grouped anagram words: \n[\n%s\n]", mapToString(groupedAndSortedWords));
    }

    private String mapToString(Map<String, List<String>> map) {
        StringBuilder sb = new StringBuilder();
        map.forEach((key, value) -> {
            sb.append("\t[");
            value.forEach(word -> sb.append("\"").append(word).append("\", "));
            int length = sb.length();
            sb.replace(length - 2, length - 1, "],\n");
        });
        int length = sb.length();
        sb.delete(length - 3, length - 1);
        return sb.toString();
    }
}
