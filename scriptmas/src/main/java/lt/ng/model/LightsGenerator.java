package lt.ng.model;

public class LightsGenerator {
    private final int rows;

    public LightsGenerator(int rows) {
        this.rows = rows;
    }

    public String generatePattern() {
        String[][] pattern = fillPattern();
        int rowsWithBorder = rows + 1;
        StringBuilder patternBuilder = new StringBuilder();

        for (int i = 0; i <= rowsWithBorder; i++) {
            for (int j = 0; j <= rowsWithBorder; j++) {
                if (i == 0 || j == 0) {
                    // top and left borders
                    patternBuilder.append("#");
                    if (j == rowsWithBorder) {
                        // top right corner
                        patternBuilder.append("\n");
                    }
                } else {
                    if (i == rowsWithBorder && j < rowsWithBorder) {
                        // bottom border
                        patternBuilder.append("#");
                    } else if (j == rowsWithBorder) {
                        // right border
                        patternBuilder.append("#\n");
                    } else {
                        // middle
                        patternBuilder.append(pattern[i - 1][j - 1]);
                    }
                }
            }
        }

        return patternBuilder.toString();
    }

    private String[][] fillPattern() {
        String[][] pattern = new String[rows][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                pattern[i][j] = getValue(i + 1, j + 1);
            }
        }

        return pattern;
    }

    private String getValue(int row, int col) {
        int sum = row + col;
        if (sum % 3 == 0) {
            if (sum % 5 == 0) {
                return "G";
            }
            return "T";
        } else if (sum % 5 == 0) {
            return "S";
        }
        return ".";
    }
}
