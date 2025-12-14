package lt.ng.model;

import java.util.ArrayList;
import java.util.List;

import static lt.ng.util.constant.ChristmasConstants.GIRLS_NAME_SUFFIX;

public class Students {
    private final List<String> students;
    private final List<String> girls;

    public Students(List<String> students) {
        this.students = students;
        girls = new ArrayList<>();
    }

    public void calculateGirls() {
        for (String name : students) {
            if (name.toLowerCase().endsWith(GIRLS_NAME_SUFFIX)) {
                girls.add(name);
            }
        }
    }

    public String getGirls() {
        return String.format("""
                        There are %d girls in students list. Names:
                        %s
                        """,
                girls.size(),
                listToString(girls));
    }

    private String listToString(List<String> list) {
        if (list.isEmpty()) {
            return "-";
        }

        StringBuilder sb = new StringBuilder();
        list.forEach(element -> sb.append(element).append("\n"));
        return sb.toString();
    }
}
