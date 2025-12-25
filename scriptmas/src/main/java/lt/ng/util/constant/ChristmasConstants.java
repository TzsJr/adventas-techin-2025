package lt.ng.util.constant;

import java.math.BigDecimal;
import java.util.Map;

public class ChristmasConstants {
    private ChristmasConstants() {
        // Constant class shouldn't have public constructor. Import static constants/methods in order to use them
    }

    public static int IMPLEMENTED_TASKS = 22;
    public static String TASKS_DESCRIPTION = String.format("""
                    Currently there are %d implemented tasks. Please choose wanted task by number or type '0' to exit:
                    1: Santa’s Tiling Trouble (tiles calculator)
                    2: Santa’s Midnight Clock Countdown (time calculator)
                    3: Santa’s Number-Trimming Magic (number trimmer)
                    4: Gift Bag (toys price calculator)
                    5: Santa’s Magical ASCII Countdown (countdown timer)
                    6: Santa’s Sleigh Flight Schedule (flight calculator)
                    7: Santa’s Christmas Concert Seating Plan (seat calculator)
                    8: Christmas Lights Pattern Generator
                    9: Santa’s Perfect Christmas Melon (melon weight comparison)
                    10: Santa’s Spinning Clock Mystery
                    11: Santa’s Magical Archery Challenge (points calculator)
                    12: Santa’s Magic Word Workshop — Anagram Groups
                    13: Christmas School – Student Name Magic (girls list)
                    14: Santa’s Gift Cart Engine
                    15: Peter’s Christmas Shopping Dilemma (cheapest gift finder)
                    16: Santa’s Gift Audit (gifts counter)
                    17: Santa’s Magic Juice Bottling Challenge (bottle counter)
                    18: Santa’s Shopping Trip (items from stores calculator)
                    19: Santa’s Toy Collection – Trading Duplicates (duplicate counter)
                    20: Santa’s Christmas Call Center – Billing Task
                    21: Christmas Library Task
                    22: Christmas Tree (word pattern)
                    """,
            IMPLEMENTED_TASKS);
    public static String WELCOME = "Hello Santa!\n";
    public static String GOODBYE = "\n\n\nTask completed! Merry Christmas!\n";
    public static String TOO_LOW = "Value too low!";
    public static String TOO_HIGH = "Value too high!";
    public static String NOT_ENOUGH = "Got less values than expected!";
    public static String TOO_MUCH = "Got more values than expected!";
    public static String ILLEGAL_OR_HIGH = "Value illegal or too high!";
    public static String ILLEGAL = "Value illegal!";
    public static String WRONG_VALUE = "Wrong value! %s\n";
    public static String UNEXPECTED_VALUE = "Something unexpected entered: %d\n";
    public static String BORROW_OK = "BORROW OK:";
    public static String BORROW_FAIL = "BORROW FAILED:";
    public static String RETURN_OK = "RETURN OK:";
    public static String RETURN_FAIL = "RETURN FAILED:";
    public static String CONSOLE_CLEAR = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    public static int EXTRA_TILES_PERCENT = 5;
    public static int MINUTES_IN_H = 60;
    public static int SECONDS_IN_MIN = 60;
    public static double EXPENSIVE_PRICE = 10.0;
    // If minute hand spins full 360°, exactly 1 hour will we passed (or 60 minutes)
    public static int MINUTES_PASSED = 60;
    public static String GIRLS_NAME_SUFFIX = "a";
    public static Map<String, BigDecimal> CART_PROMO_CODES = Map.of(
            "PROMO10", new BigDecimal("0.10"),
            "PROMO25", new BigDecimal("0.25"),
            "SANTA50", new BigDecimal("0.50"));
    // Different vessels for bottling, default values: 5 liters, 2 liters and 1 liter
    public static int[] JUICE_VESSELS = new int[]{5, 2, 1};
    public static int DIFFERENT_TOY_NUMBERS = 100;
    public static Map<String, Double> CALL_PRICE_LIST = Map.of(
            "London", 0.5,
            "Paris", 0.4,
            "New York", 0.7);
    public static String[] DIGITS = {
            """
            
                  000000000     \s
                00:::::::::00   \s
              00:::::::::::::00 \s
             0:::::::000:::::::0\s
             0::::::0   0::::::0\s
             0:::::0     0:::::0\s
             0:::::0     0:::::0\s
             0:::::0 000 0:::::0\s
             0:::::0     0:::::0\s
             0:::::0     0:::::0\s
             0::::::0   0::::::0\s
             0:::::::000:::::::0\s
              00:::::::::::::00 \s
                00:::::::::00   \s
                  000000000     \s
            """,
            """
            
                   1111111      \s
                  1::::::1      \s
                 1:::::::1      \s
                 111:::::1      \s
                    1::::1      \s
                    1::::1      \s
                    1::::1      \s
                    1::::l      \s
                    1::::l      \s
                    1::::l      \s
                    1::::l      \s
                 111::::::111   \s
                 1::::::::::1   \s
                 1::::::::::1   \s
                 111111111111   \s
            """,
            """
            
             222222222222222    \s
             2:::::::::::::::22 \s
             2::::::222222:::::2\s
             2222222     2:::::2\s
                         2:::::2\s
                         2:::::2\s
                      2222::::2 \s
                 22222::::::22  \s
               22::::::::222    \s
              2:::::22222       \s
             2:::::2            \s
             2:::::2       222222
             2::::::2222222:::::2
             2::::::::::::::::::2
             22222222222222222222
            """,
            """
            
             3333333333333333   \s
             3:::::::::::::::33 \s
             3::::::33333::::::3\s
             3333333     3:::::3\s
                         3:::::3\s
                         3:::::3\s
                 33333333:::::3 \s
                 3:::::::::::3  \s
                 33333333:::::3 \s
                         3:::::3\s
                         3:::::3\s
             3333333     3:::::3\s
             3::::::33333::::::3\s
             3:::::::::::::::33 \s
              333333333333333   \s
            """,
            """
            
                    444444444   \s
                   4::::::::4   \s
                  4:::::::::4   \s
                 4::::44::::4   \s
                4::::4 4::::4   \s
               4::::4  4::::4   \s
              4::::4   4::::4   \s
             4::::444444::::444 \s
             4::::::::::::::::4 \s
             4444444444:::::444 \s
                       4::::4   \s
                       4::::4   \s
                     44::::::44 \s
                     4::::::::4 \s
                     4444444444 \s
            """,
            """
            
             555555555555555555 \s
             5::::::::::::::::5 \s
             5:::::555555555555 \s
             5:::::5            \s
             5:::::5            \s
             5:::::5555555555   \s
             5:::::::::::::::5  \s
             555555555555:::::5 \s
                         5:::::5\s
                         5:::::5\s
             5555555     5:::::5\s
             5::::::55555::::::5\s
              55:::::::::::::55 \s
                55:::::::::55   \s
                  555555555     \s
            """,
            """
            
                     66666666   \s
                    6::::::6    \s
                   6::::::6     \s
                  6::::::6      \s
                 6::::::6       \s
                6::::::6        \s
               6::::::::66666   \s
              6::::::::::::::6  \s
             6::::::66666:::::6 \s
             6:::::6     6:::::6\s
             6:::::6     6:::::6\s
             6::::::66666::::::6\s
              66:::::::::::::66 \s
                66:::::::::66   \s
                  666666666     \s
            """,
            """
            
             77777777777777777777
             7::::::::::::::::::7
             7::::::::::::::::::7
             777777777777:::::::7
                        7::::::7\s
                       7::::::7 \s
                      7::::::7  \s
                     7::::::7   \s
                    7::::::7    \s
                   7::::::7     \s
                  7::::::7      \s
                 7::::::7       \s
                7::::::7        \s
               7::::::7         \s
              77777777          \s
            """,
            """
            
                  888888888     \s
                88:::::::::88   \s
              88:::::::::::::88 \s
             8::::::88888::::::8\s
             8:::::8     8:::::8\s
             8:::::8     8:::::8\s
              8:::::88888:::::8 \s
               8:::::::::::::8  \s
              8:::::88888:::::8 \s
             8:::::8     8:::::8\s
             8:::::8     8:::::8\s
             8::::::88888::::::8\s
              88:::::::::::::88 \s
                88:::::::::88   \s
                  888888888     \s
            """,
            """
            
                  999999999     \s
                99:::::::::99   \s
              99:::::::::::::99 \s
             9::::::99999::::::9\s
             9:::::9     9:::::9\s
             9:::::9     9:::::9\s
              9:::::99999::::::9\s
               99::::::::::::::9\s
                 99999::::::::9 \s
                      9::::::9  \s
                     9::::::9   \s
                    9::::::9    \s
                   9:::::9      \s
                  9:::::9       \s
                 9999999        \s
            """,
            """
            
                   1111111            000000000     \s
                  1::::::1          00:::::::::00   \s
                 1:::::::1        00:::::::::::::00 \s
                 111:::::1       0:::::::000:::::::0\s
                    1::::1       0::::::0   0::::::0\s
                    1::::1       0:::::0     0:::::0\s
                    1::::1       0:::::0     0:::::0\s
                    1::::l       0:::::0 000 0:::::0\s
                    1::::l       0:::::0     0:::::0\s
                    1::::l       0:::::0     0:::::0\s
                    1::::l       0::::::0   0::::::0\s
                 111::::::111    0:::::::000:::::::0\s
                 1::::::::::1     00:::::::::::::00 \s
                 1::::::::::1       00:::::::::00   \s
                 111111111111         000000000     \s
            """
    };
    public static String[] FESTIVE_MESSAGES = {
            "SANTA’S SLEIGH IS LAUNCHING!",
            "Last elves and Santa's good byes",
            "Sleigh's leash heating up...",
            "List with children names  and gifts prepared on top of the bag...",
            "Sleigh warming up...",
            "Lights are turned-on on sled...",
            "Reindeer is having final snacks...",
            "Elves and Santa put the bag into sleds...",
            "Reindeer are buckling up...",
            "Santa is preparing boots and belt...",
            "Elves put gifts into a bag..."
    };
    public static String CHRISTMAS_TREE_TEXT = "Linkiu geros pradžios, naujos energijos, tikrų atradimų, drąsių idėjų, " +
            "atvirumo viskam, kas nauja. Linksmų Šv. Kalėdų ir sėkmingų Naujųjų 2026-tų metų. " +
            "We wish you a good start, fresh energy, true discoveries, bold ideas, significant gains and " +
            "openness for innovations. Merry Christmas and a Happy New Year!";
}
