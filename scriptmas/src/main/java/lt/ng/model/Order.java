package lt.ng.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static lt.ng.constant.ChristmasConstants.EXTRA_TILES_PERCENT;

public class Order {
    private int tileLength;
    private int tileWidth;
    private long tileArea;
    private int roomLength;
    private int roomWidth;
    private long roomArea;
    private int tileAmount;
    private int tileTotalAmount;
    private double m2price;
    private double totalCost;

    public Order(int tileLength, int tileWidth, int roomLength, int roomWidth, double m2price) {
        this.tileLength = tileLength;
        this.tileWidth = tileWidth;
        this.roomLength = roomLength;
        this.roomWidth = roomWidth;
        this.m2price = m2price;
    }

    public void calculateTotalCost() {
        tileArea = getArea(tileLength, tileWidth);
        roomArea = getArea(roomLength, roomWidth);
        tileAmount = round((double) roomArea / tileArea);
        double extraTiles = (double) (tileAmount * EXTRA_TILES_PERCENT) / 100;
        tileTotalAmount = round(extraTiles + tileAmount);
        totalCost = round(tileTotalAmount * m2price, 2);
    }

    public String getOrderInvoice() {
        return String.format("If room is %d x %d and area is %d, " +
                        "using %d x %d tiles with area %d of the price %.2f per m2, " +
                        "you will need %d tile(s), but if we add %d%% extra total would be %d tile(s). " +
                        "And that would cost %.2f in total.",
                roomLength,
                roomWidth,
                roomArea,
                tileLength,
                tileWidth,
                tileArea,
                m2price,
                tileAmount,
                EXTRA_TILES_PERCENT,
                tileTotalAmount,
                totalCost);
    }

    private long getArea(int length, int width) {
        return (long) length * width;
    }

    private int round(double number) {
        BigDecimal bdNumber = BigDecimal.valueOf(number);
        return Integer.parseInt(bdNumber.setScale(0, RoundingMode.UP).toString());
    }

    private double round(double number, int precision) {
        BigDecimal bdNumber = BigDecimal.valueOf(number);
        return Double.parseDouble(bdNumber.setScale(precision, RoundingMode.UP).toString());
    }
}
