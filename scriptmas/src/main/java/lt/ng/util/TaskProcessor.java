package lt.ng.util;

import lt.ng.model.Clock;
import lt.ng.model.NumberTrimmer;
import lt.ng.model.Order;
import lt.ng.model.ToyCounter;

import java.util.List;

import static lt.ng.constant.ChristmasConstants.DIGITS;
import static lt.ng.constant.ChristmasConstants.FESTIVE_MESSAGES;

public class TaskProcessor {
    private final IOManager ioManager;

    public TaskProcessor() {
        ioManager = new IOManager();
    }

    public void welcome() {
        ioManager.welcome();
    }

    public void goodBye() {
        ioManager.goodBye();
    }

    public void processWantedTask() {
        final int IMPLEMENTED_TASKS = 5;
        int taskId = ioManager.getWantedTask(IMPLEMENTED_TASKS);

        switch (taskId) {
            case 0:
                break;
            case 1:
                processOrder();
                break;
            case 2:
                calculateTime();
                break;
            case 3:
                trimNumber();
                break;
            case 4:
                countToys();
                break;
            case 5:
                countdown(10, 0, 1000);
                break;
            default:
                System.out.println("Something unexpected entered: " + taskId);
                return;
        }
        goodBye();
    }

    private void processOrder() {
        Order tileOrder = new Order();
        tileOrder.setTileLength(ioManager.getIntInput(
                "Please enter length of tile (must be whole number): ",
                1,
                Integer.MAX_VALUE));
        tileOrder.setTileWidth(ioManager.getIntInput(
                "Please enter width of tile (must be whole number): ",
                1,
                Integer.MAX_VALUE));
        tileOrder.setRoomLength(ioManager.getIntInput(
                "Please enter length of room (must be whole number): ",
                1,
                Integer.MAX_VALUE));
        tileOrder.setRoomWidth(ioManager.getIntInput(
                "Please enter width of room (must be whole number): ",
                1,
                Integer.MAX_VALUE));
        tileOrder.setM2price(ioManager.getDecimalInput(
                "Please enter price of m2 of tiles: ",
                0.0,
                Double.MAX_VALUE));
        tileOrder.calculateTotalCost();

        System.out.println(tileOrder.getOrderInvoice());
    }

    private void calculateTime() {
        int hours = ioManager.getIntInput(
                "Please enter workshop clock hours (must be whole number): ",
                0,
                23);
        int minutes = ioManager.getIntInput(
                "Please enter workshop clock minutes (must be whole number): ",
                0,
                59);
        Clock clock = new Clock(hours, minutes);

        System.out.println(clock.getTime());
    }

    private void trimNumber() {
        int number = ioManager.getIntInput("Please enter four-digit number: ", 1000, 9999);
        NumberTrimmer numTrimmer = new NumberTrimmer(number);

        System.out.println(numTrimmer.getResults());
    }

    private void countToys() {
        final double EXPENSIVE_PRICE = 10.0;
        List<Double> inputs = ioManager.getDecimalsInput(
                "Please enter toy prices (must be positive numbers), entered 0 means list is finished: ",
                0.0,
                Double.MAX_VALUE,
                0.0);
        ToyCounter toyCounter = new ToyCounter(inputs);
        toyCounter.countExpensiveToys(EXPENSIVE_PRICE);

        System.out.println(toyCounter.getResults());
    }

    private void countdown(int start, int end, int sleepMs) {
        if (start <= end) {
            System.out.println("Start cannot be lower than end for countdown!");
            return;
        }
        if (DIGITS.length - 1 < start) {
            start = DIGITS.length - 1;
            System.out.println("Start is too big, reducing to match constant size: " + start);
        }

        for (int i = start; i >= end; i--) {
            // No build in way to clear console in Java, so the easiest way is to separate each loop with a bunch of new lines
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            System.out.println(DIGITS[i]);
            System.out.println(FESTIVE_MESSAGES[i]);

            try {
                Thread.sleep(sleepMs);
            } catch (InterruptedException e) {
                System.out.println("Exception during countdown: " + e.getMessage());
            }
        }
    }
}
