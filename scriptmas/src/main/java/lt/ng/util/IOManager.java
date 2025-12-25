package lt.ng.util;

import lt.ng.model.ArcheryCalculator.Coordinate;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static lt.ng.util.constant.ChristmasConstants.GOODBYE;
import static lt.ng.util.constant.ChristmasConstants.ILLEGAL;
import static lt.ng.util.constant.ChristmasConstants.ILLEGAL_OR_HIGH;
import static lt.ng.util.constant.ChristmasConstants.NOT_ENOUGH;
import static lt.ng.util.constant.ChristmasConstants.TASKS_DESCRIPTION;
import static lt.ng.util.constant.ChristmasConstants.TOO_HIGH;
import static lt.ng.util.constant.ChristmasConstants.TOO_LOW;
import static lt.ng.util.constant.ChristmasConstants.TOO_MUCH;
import static lt.ng.util.constant.ChristmasConstants.WELCOME;
import static lt.ng.util.constant.ChristmasConstants.WRONG_VALUE;

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

    public List<Double> getDecimalsInputUntilStop(String message, double lowLimit, double highLimit, double stopValue) {
        boolean isValidValueOrEnough = false;
        double doubleValue;
        List<Double> doubleValues = new ArrayList<>();

        do {
            System.out.println(message);
            try {
                doubleValue = userInput.nextDouble();
                if (doubleValue < lowLimit) {
                    isValidValueOrEnough = reportErrorReturnNotValid(TOO_LOW);
                    continue;
                } else if (doubleValue > highLimit) {
                    isValidValueOrEnough = reportErrorReturnNotValid(TOO_HIGH);
                    continue;
                }
                doubleValues.add(doubleValue);
                if (doubleValue == stopValue) {
                    isValidValueOrEnough = true;
                }
                userInput.nextLine();
            } catch (InputMismatchException e) {
                isValidValueOrEnough = reportErrorReturnNotValid(ILLEGAL_OR_HIGH);
                userInput.nextLine();
            }
        } while (!isValidValueOrEnough);

        return doubleValues;
    }

    public List<Double> getNumberOfDecimalsInput(String message, double lowLimit, double highLimit, int totalNumbers) {
        boolean isValidValueOrEnough = false;
        double doubleValue;
        List<Double> doubleValues = new ArrayList<>();

        do {
            System.out.printf(message + "\n", doubleValues.size() + 1);
            try {
                doubleValue = userInput.nextDouble();
                if (doubleValue < lowLimit) {
                    isValidValueOrEnough = reportErrorReturnNotValid(TOO_LOW);
                    continue;
                } else if (doubleValue > highLimit) {
                    isValidValueOrEnough = reportErrorReturnNotValid(TOO_HIGH);
                    continue;
                }
                doubleValues.add(doubleValue);
                if (doubleValues.size() == totalNumbers) {
                    isValidValueOrEnough = true;
                }
                userInput.nextLine();
            } catch (InputMismatchException e) {
                isValidValueOrEnough = reportErrorReturnNotValid(ILLEGAL_OR_HIGH);
                userInput.nextLine();
            }
        } while (!isValidValueOrEnough);

        return doubleValues;
    }

    public List<Coordinate> getNumberOfCoordinates(
            String message,
            double lowLimit,
            double highLimit,
            int totalCoordinates,
            boolean center
    ) {
        boolean isValidValueOrEnough = false;
        double x;
        double y;
        String input;
        List<Coordinate> coordinates = new ArrayList<>();

        do {
            if (center) {
                System.out.println(message);
            } else {
                System.out.printf(message + "\n", coordinates.size() + 1);
            }
            try {
                input = userInput.nextLine();
                String[] coordinateStr =
                        input.replace("(", "").replace(")", "").split(",");
                x = Double.parseDouble(coordinateStr[0].trim());
                y = Double.parseDouble(coordinateStr[1].trim());
                if (x < lowLimit || y < lowLimit) {
                    isValidValueOrEnough = reportErrorReturnNotValid(TOO_LOW);
                    continue;
                } else if (x > highLimit || y > highLimit) {
                    isValidValueOrEnough = reportErrorReturnNotValid(TOO_HIGH);
                    continue;
                }
                coordinates.add(new Coordinate(x, y));
                if (coordinates.size() == totalCoordinates) {
                    isValidValueOrEnough = true;
                }
            } catch (NoSuchElementException
                     | NullPointerException
                     | NumberFormatException
                     | ArrayIndexOutOfBoundsException e
            ) {
                isValidValueOrEnough = reportErrorReturnNotValid(ILLEGAL);
            }
        } while (!isValidValueOrEnough);

        return coordinates;
    }

    public List<String> getWords(String message) {
        boolean isValid;
        String inputLine;
        List<String> inputs = new ArrayList<>();

        do {
            System.out.println(message);
            try {
                inputLine = userInput.nextLine();
                inputs.addAll(List.of(inputLine
                        .replace("[", "")
                        .replace("]", "")
                        .replace("\"", "")
                        .split(",")));
                isValid = true;
            } catch (NoSuchElementException | NullPointerException e) {
                isValid = reportErrorReturnNotValid(ILLEGAL);
            }
        } while (!isValid);

        return inputs;
    }

    public double[] getNumberOfDecimalsInputFromLine(String message, double lowLimit, double highLimit, int totalNumbers) {
        boolean isValidValue = false;
        String line;
        String[] values;
        double[] doubleValues = new double[totalNumbers];

        do {
            System.out.println(message);
            try {
                line = userInput.nextLine();
                values = line.split(" ");
                if (values.length < doubleValues.length) {
                    isValidValue = reportErrorReturnNotValid(NOT_ENOUGH);
                    continue;
                } else if (values.length > doubleValues.length) {
                    isValidValue = reportErrorReturnNotValid(TOO_MUCH);
                    continue;
                }

                for (int i = 0; i < totalNumbers; i++) {
                    double doubleValue = Double.parseDouble(values[i]);
                    if (doubleValue < lowLimit) {
                        isValidValue = reportErrorReturnNotValid(TOO_LOW);
                        break;
                    } else if (doubleValue > highLimit) {
                        isValidValue = reportErrorReturnNotValid(TOO_HIGH);
                        break;
                    }

                    doubleValues[i] = doubleValue;
                    if (i == totalNumbers - 1) {
                        isValidValue = true;
                    }
                }
            } catch (NoSuchElementException | NullPointerException | NumberFormatException e) {
                isValidValue = reportErrorReturnNotValid(ILLEGAL);
            }
        } while (!isValidValue);

        return doubleValues;
    }

    public int[] getNumberOfIntsInputFromLine(String message, int lowLimit, int highLimit, int totalNumbers) {
        boolean isValidValue = false;
        String line;
        String[] values;
        int[] intValues = new int[totalNumbers];

        do {
            System.out.println(message);
            try {
                line = userInput.nextLine();
                values = line.split(" ");
                if (values.length < intValues.length) {
                    isValidValue = reportErrorReturnNotValid(NOT_ENOUGH);
                    continue;
                } else if (values.length > intValues.length) {
                    isValidValue = reportErrorReturnNotValid(TOO_MUCH);
                    continue;
                }

                for (int i = 0; i < totalNumbers; i++) {
                    int intValue = Integer.parseInt(values[i]);
                    if (intValue < lowLimit) {
                        isValidValue = reportErrorReturnNotValid(TOO_LOW);
                        break;
                    } else if (intValue > highLimit) {
                        isValidValue = reportErrorReturnNotValid(TOO_HIGH);
                        break;
                    }

                    intValues[i] = intValue;
                    if (i == totalNumbers - 1) {
                        isValidValue = true;
                    }
                }
            } catch (NoSuchElementException | NullPointerException | NumberFormatException e) {
                isValidValue = reportErrorReturnNotValid(ILLEGAL);
            }
        } while (!isValidValue);

        return intValues;
    }

    private boolean reportErrorReturnNotValid(String message) {
        System.out.printf(WRONG_VALUE, message);
        return false;
    }
}
