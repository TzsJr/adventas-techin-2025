package lt.ng.util;

import lt.ng.model.Clock;
import lt.ng.model.NumberTrimmer;
import lt.ng.model.Order;
import lt.ng.model.ToyCounter;

import java.util.List;

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
        final int IMPLEMENTED_TASKS = 4;
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
            default:
                System.out.println("Something unexpected entered: " + taskId);
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
}
