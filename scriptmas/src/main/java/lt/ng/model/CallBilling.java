package lt.ng.model;

import java.util.HashMap;
import java.util.Map;

import static java.math.RoundingMode.HALF_UP;
import static lt.ng.util.NumberUtils.roundWithPrecision;
import static lt.ng.util.constant.ChristmasConstants.CALL_PRICE_LIST;

public class CallBilling {
    private final String userFirstName;
    private final String userLastName;
    private double cost;
    private final Map<String, Double> calls;

    public CallBilling(String userFirstName, String userLastName) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        cost = 0.0;
        calls = new HashMap<>();
    }

    public void addCall(String city, double minutes) {
        if (calls.containsKey(city)) {
            double totalCost = roundWithPrecision(calls.get(city) + minutes, 2, HALF_UP);
            calls.put(city, totalCost);
        } else {
            calls.put(city, roundWithPrecision(minutes, 2, HALF_UP));
        }
    }

    public void calculateTotalCost() {
        calls.forEach((city, minutes) -> {
            Double price = CALL_PRICE_LIST.get(city);
            if (price != null) {
                this.cost = roundWithPrecision(this.cost + minutes * price, 2, HALF_UP);
            } else {
                System.out.printf("Cannot calculate call price for %s, for %s %s!\n", city, userFirstName, userLastName);
            }
        });
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public double getCost() {
        return cost;
    }
}
