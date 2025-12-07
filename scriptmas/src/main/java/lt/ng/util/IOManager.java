package lt.ng.util;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static lt.ng.constant.ChristmasConstants.GOODBYE;
import static lt.ng.constant.ChristmasConstants.ILLEGAL_OR_HIGH;
import static lt.ng.constant.ChristmasConstants.TOO_HIGH;
import static lt.ng.constant.ChristmasConstants.TOO_LOW;
import static lt.ng.constant.ChristmasConstants.WELCOME;
import static lt.ng.constant.ChristmasConstants.WRONG_VALUE;
import static lt.ng.constant.ChristmasConstants.TASKS_DESCRIPTION;

public class IOManager {
    private final Scanner userInput = new Scanner(System.in);

    public void welcome() {
        System.out.println(WELCOME);
    }

    public void goodBye() {
        System.out.println(GOODBYE);
    }

    public int getWantedTask(int taskCount) {
        return getIntInput(TASKS_DESCRIPTION, 0, taskCount);
    }

    public int getIntInput(String message, int lowLimit, int highLimit) {
        boolean isValidValue;
        int intValue = 0;

        do {
            System.out.println(message);
            try {
                intValue = userInput.nextInt();
                if (intValue < lowLimit) {
                    isValidValue = reportErrorReturnNotValid(TOO_LOW);
                    continue;
                } else if (intValue > highLimit) {
                    isValidValue = reportErrorReturnNotValid(TOO_HIGH);
                    continue;
                }
                isValidValue = true;
                userInput.nextLine();
            } catch (InputMismatchException e) {
                isValidValue = reportErrorReturnNotValid(ILLEGAL_OR_HIGH);
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
                    isValidValue = reportErrorReturnNotValid(TOO_LOW);
                    continue;
                } else if (doubleValue > highLimit) {
                    isValidValue = reportErrorReturnNotValid(TOO_HIGH);
                    continue;
                }
                isValidValue = true;
                userInput.nextLine();
            } catch (InputMismatchException e) {
                isValidValue = reportErrorReturnNotValid(ILLEGAL_OR_HIGH);
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
                    isValidValue = reportErrorReturnNotValid(TOO_LOW);
                    continue;
                } else if (doubleValue > highLimit) {
                    isValidValue = reportErrorReturnNotValid(TOO_HIGH);
                    continue;
                }
                doubleValues.add(doubleValue);
                if (doubleValue == stopValue) {
                    isValidValue = true;
                }
                userInput.nextLine();
            } catch (InputMismatchException e) {
                isValidValue = reportErrorReturnNotValid(ILLEGAL_OR_HIGH);
                userInput.nextLine();
            }
        } while (!isValidValue);

        return doubleValues;
    }

    private boolean reportErrorReturnNotValid(String message) {
        System.out.printf(WRONG_VALUE, message);
        return false;
    }
}
