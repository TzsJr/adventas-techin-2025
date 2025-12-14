package lt.ng.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static java.math.RoundingMode.HALF_UP;
import static lt.ng.util.constant.ChristmasConstants.CART_PROMO_CODES;

public class CartSystem {
    private final Map<String, BigDecimal> gifts;
    private BigDecimal totalSum;
    private String promoCode;

    public CartSystem() {
        gifts = new HashMap<>();
        totalSum = new BigDecimal("0");
        promoCode = "";
    }

    public void add(String id, double price) {
        if (price < 0.0) {
            System.out.println("Price cannot be negative!");
            return;
        }

        BigDecimal realPrice = getRealPrice(BigDecimal.valueOf(price));
        BigDecimal existingValue = gifts.putIfAbsent(id, realPrice);
        if (existingValue != null) {
            System.out.printf("Item '%s' already exists in cart!\n", id);
            return;
        }

        totalSum = totalSum.add(realPrice).setScale(2, HALF_UP);
        System.out.println(id + " added successfully!");
    }

    private BigDecimal getRealPrice(BigDecimal price) {
        BigDecimal realPrice = price;
        if (!promoCode.isEmpty()) {
            BigDecimal discount = CART_PROMO_CODES.get(promoCode);
            realPrice = realPrice.subtract(price.multiply(discount));
        }
        return realPrice.setScale(2, HALF_UP);
    }

    public void remove(String id) {
        BigDecimal existingValue = gifts.get(id);
        if (existingValue == null) {
            System.out.printf("Item '%s' not found in cart!\n", id);
            return;
        }

        gifts.remove(id);
        totalSum = totalSum.subtract(existingValue);
        System.out.println(id + " removed successfully!");
    }

    public void total() {
        System.out.println("Total sum of cart is " + totalSum.setScale(2, HALF_UP));
    }

    public void applyDiscount(String code) {
        if (!promoCode.isEmpty()) {
            System.out.printf("Another promo code is already applied: %s\n", promoCode);
            return;
        }
        BigDecimal discount = CART_PROMO_CODES.get(code);
        if (discount == null) {
            System.out.printf("Promo code '%s' is not valid!\n", code);
            return;
        }

        promoCode = code;
        updatePricesAndTotal(discount);
        System.out.println(code + " applied successfully!");
    }

    private void updatePricesAndTotal(BigDecimal discount) {
        totalSum = new BigDecimal("0");
        gifts.forEach((key, value) -> {
            BigDecimal newValue = value.subtract(value.multiply(discount)).setScale(2, HALF_UP);
            gifts.put(key, newValue);
            totalSum = totalSum.add(newValue);
        });
    }

    public void clear() {
        gifts.clear();
        totalSum = new BigDecimal("0");
        promoCode = "";
        System.out.println("Cart cleared successfully!");
    }

    public void list() {
        System.out.printf("Cart content: \n%s\n", mapToString(gifts));
    }

    private String mapToString(Map<String, BigDecimal> map) {
        StringBuilder sb = new StringBuilder();
        if (map.isEmpty()) {
            sb.append("-\n");
        } else {
            map.forEach((key, value) ->
                    sb.append("item: ").append(key).append(", price: ").append(value).append("\n"));
        }
        sb.append("Total sum: ").append(totalSum);
        return sb.toString();
    }
}
