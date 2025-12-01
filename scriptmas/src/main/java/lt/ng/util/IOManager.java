package lt.ng.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IOManager {
    private final Scanner userInput = new Scanner(System.in);

    public void welcome() {
        System.out.println("Hello Santa!\n");
    }

    public int getIntInput(String message) {
        boolean isValidValue;
        int intValue = 0;

        do {
            System.out.println(message);
            try {
                intValue = userInput.nextInt();
                if (intValue <= 0) {
                    isValidValue = reportErrorReturnNotValid();
                    continue;
                }
                isValidValue = true;
                userInput.nextLine();
            } catch (InputMismatchException e) {
                isValidValue = reportErrorReturnNotValid();
                userInput.nextLine();
            }
        } while (!isValidValue);

        return intValue;
    }

    public double getDecimalInput(String message) {
        boolean isValidValue;
        double doubleValue = 0.0;

        do {
            System.out.println(message);
            try {
                doubleValue = userInput.nextDouble();
                if (doubleValue < 0) {
                    isValidValue = reportErrorReturnNotValid();
                    continue;
                }
                isValidValue = true;
                userInput.nextLine();
            } catch (InputMismatchException e) {
                isValidValue = reportErrorReturnNotValid();
                userInput.nextLine();
            }
        } while (!isValidValue);

        return doubleValue;
    }

    private boolean reportErrorReturnNotValid() {
        System.out.println("Wrong value!");
        return false;
    }
}
