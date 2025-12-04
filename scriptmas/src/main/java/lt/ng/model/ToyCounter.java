package lt.ng.model;

import java.util.List;

public class ToyCounter {
    private final List<Double> inputs;
    private double priceOfExpensiveToys;
    private int countOfExpensiveToys;

    public ToyCounter(List<Double> inputs) {
        this.inputs = inputs;
    }

    public void countExpensiveToys(double expensivePrice) {
        priceOfExpensiveToys = 0.0;
        countOfExpensiveToys = 0;
        inputs.forEach(price -> {
            if (price > expensivePrice) {
                priceOfExpensiveToys += price;
                countOfExpensiveToys++;
            }
        });
    }

    public String getResults() {
        return String.format("Total price of magical toys: %.2f EUR. Number of magical toys: %d",
                priceOfExpensiveToys,
                countOfExpensiveToys);
    }
}
