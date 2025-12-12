package lt.ng.model;

import static lt.ng.util.constant.ChristmasConstants.MINUTES_IN_H;
import static lt.ng.util.constant.ChristmasConstants.SECONDS_IN_MIN;

public class Clock {
    private final int x;
    private final int y;
    private final int m;
    private final int s;

    public Clock(int x, int y) {
        this.x = x;
        this.y = y;
        m = x * MINUTES_IN_H + y;
        s = m * SECONDS_IN_MIN;
    }

    public String getTime() {
        return String.format("If Santa’s magical workshop clock shows %d hours and %d minutes, " +
                        "our clock calculated that %d minutes have passed since midnight " +
                        "or %d seconds have passed since midnight.",
                x,
                y,
                m,
                s);
    }
}
