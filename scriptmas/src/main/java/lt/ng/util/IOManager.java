package lt.ng.util;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class IOManager {
    private final Scanner userInput = new Scanner(System.in);

    public void welcome() {
        System.out.println("Hello Santa!\n");
    }

    public void goodBye() {
        System.out.println("\n\n\nTask completed! Merry Christmas!\n");
    }

    public int getWantedTask(int taskCount) {
        String tasksDescription = String.format("""
                        Currently there are %d implemented tasks. Please choose wanted task by number or type '0' to exit:
                        1: Santa’s Tiling Trouble (tiles calculator)
                        2: Santa’s Midnight Clock Countdown (time calculator)
                        3: Santa’s Number-Trimming Magic (number trimmer)
                        4: Gift Bag (toys price calculator)
                        5: Santa’s Magical ASCII Countdown (countdown timer)
                        """,
                taskCount);
        return getIntInput(tasksDescription, 0, taskCount);
    }

    public int getIntInput(String message, int lowLimit, int highLimit) {
        boolean isValidValue;
        int intValue = 0;

        do {
            System.out.println(message);
            try {
                intValue = userInput.nextInt();
                if (intValue < lowLimit) {
                    isValidValue = reportErrorReturnNotValid("Value too low!");
                    continue;
                } else if (intValue > highLimit) {
                    isValidValue = reportErrorReturnNotValid("Value too high!");
                    continue;
                }
                isValidValue = true;
                userInput.nextLine();
            } catch (InputMismatchException e) {
                isValidValue = reportErrorReturnNotValid("Value too high or illegal!");
                userInput.nextLine();
            }
        } while (!isValidValue);

        return intValue;
    }

    public double getDecimalInput(String message, double lowLimit, double highLimit) {
        boolean isValidValue;
        double doubleValue = 0.0;

        do {
            System.out.println(message);
            try {
                doubleValue = userInput.nextDouble();
                if (doubleValue < lowLimit) {
                    isValidValue = reportErrorReturnNotValid("Value too low!");
                    continue;
                } else if (doubleValue > highLimit) {
                    isValidValue = reportErrorReturnNotValid("Value too high!");
                    continue;
                }
                isValidValue = true;
                userInput.nextLine();
            } catch (InputMismatchException e) {
                isValidValue = reportErrorReturnNotValid("Value too high or illegal!");
                userInput.nextLine();
            }
        } while (!isValidValue);

        return doubleValue;
    }

    public List<Double> getDecimalsInput(String message, double lowLimit, double highLimit, double stopValue) {
        boolean isValidValue = false;
        double doubleValue;
        List<Double> doubleValues = new ArrayList<>();

        do {
            System.out.println(message);
            try {
                doubleValue = userInput.nextDouble();
                if (doubleValue < lowLimit) {
                    isValidValue = reportErrorReturnNotValid("Value too low!");
                    continue;
                } else if (doubleValue > highLimit) {
                    isValidValue = reportErrorReturnNotValid("Value too high!");
                    continue;
                }
                doubleValues.add(doubleValue);
                if (doubleValue == stopValue) {
                    isValidValue = true;
                }
                userInput.nextLine();
            } catch (InputMismatchException e) {
                isValidValue = reportErrorReturnNotValid("Value too high or illegal!");
                userInput.nextLine();
            }
        } while (!isValidValue);

        return doubleValues;
    }

    private boolean reportErrorReturnNotValid(String message) {
        System.out.println("Wrong value! " + message);
        return false;
    }
}
