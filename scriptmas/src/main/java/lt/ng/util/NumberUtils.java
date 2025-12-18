package lt.ng.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberUtils {
    private NumberUtils() {
        // Utils class shouldn't have public constructor. Import static constants/methods in order to use them
    }

    public static int round(double number, RoundingMode roundingMode) {
        BigDecimal bdNumber = BigDecimal.valueOf(number);
        return Integer.parseInt(bdNumber.setScale(0, roundingMode).toString());
    }

    public static double roundWithPrecision(double number, int precision, RoundingMode roundingMode) {
        BigDecimal bdNumber = BigDecimal.valueOf(number);
        return Double.parseDouble(bdNumber.setScale(precision, roundingMode).toString());
    }
}
