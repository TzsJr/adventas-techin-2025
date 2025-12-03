package lt.ng.model;

public class NumberTrimmer {
    private final int input;
    private final int output;

    public NumberTrimmer(int input) {
        this.input = input;
        output = trim(input);
    }

    private int trim(int input) {
        return (input / 1000) * 10 + (input % 10);
    }

    public String getResults() {
        return String.format("If four-digit number is %d, then trimmed one is %d.", input, output);
    }
}
