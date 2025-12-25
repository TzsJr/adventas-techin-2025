package lt.ng.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    private StringUtils() {
        // Utils class shouldn't have public constructor. Import static constants/methods in order to use them
    }

    public static List<String> splitAndAppend(String text) {
        List<String> result = new ArrayList<>();

        String[] words = text.split(" ");
        boolean stop = false;
        int wordIndex = 0;
        int wordsToAppend = 1;
        int longestAppendedWordSize = 0;

        do {
            StringBuilder sb = new StringBuilder();
            int end = Math.min(wordIndex + wordsToAppend, words.length);
            for (int j = wordIndex; j < end; j++) {
                sb.append(words[j]);
                wordIndex++;
                if (j == end - 1) {
                    result.add(sb.toString());
                    if (wordsToAppend % 2 == 0) {
                        longestAppendedWordSize = Math.max(longestAppendedWordSize, sb.length());
                    }
                    continue;
                }
                sb.append(" ");
            }
            wordsToAppend++;
            if (wordIndex == words.length) {
                stop = true;
            }
        } while (!stop);

        for (int i = 0; i < result.size(); i++) {
            String word = result.get(i);
            if (i % 2 == 0) {
                result.set(i, word.indent(longestAppendedWordSize - 1).replace("\n", ""));
            } else {
                int indent = longestAppendedWordSize - word.length();
                result.set(i, word.indent(indent).replace("\n", ""));
            }
        }

        return result;
    }
}
