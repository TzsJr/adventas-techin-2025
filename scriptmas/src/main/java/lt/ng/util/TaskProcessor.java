package lt.ng.util;

import lt.ng.model.Clock;
import lt.ng.model.LightsGenerator;
import lt.ng.model.NumberTrimmer;
import lt.ng.model.Order;
import lt.ng.model.SeatCalculator;
import lt.ng.model.ToyCounter;
import lt.ng.model.WeightCalculator;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import static java.time.Month.DECEMBER;
import static lt.ng.constant.ChristmasConstants.CONSOLE_CLEAR;
import static lt.ng.constant.ChristmasConstants.DIGITS;
import static lt.ng.constant.ChristmasConstants.EXPENSIVE_PRICE;
import static lt.ng.constant.ChristmasConstants.FESTIVE_MESSAGES;
import static lt.ng.constant.ChristmasConstants.IMPLEMENTED_TASKS;
import static lt.ng.constant.ChristmasConstants.MINUTES_PASSED;
import static lt.ng.constant.ChristmasConstants.UNEXPECTED_VALUE;

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
        int taskId = ioManager.getWantedTask(IMPLEMENTED_TASKS);
        System.out.print("\n");

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
            case 6:
                calculateFlight();
                break;
            case 7:
                calculateSeats();
                break;
            case 8:
                generateChristmasLightsPattern();
                break;
            case 9:
                choosePerfectMelon();
                break;
            case 10:
                calculateMysteryTime();
                break;
            default:
                System.out.printf(UNEXPECTED_VALUE, taskId);
                return;
        }
        goodBye();
    }

    private void processOrder() {
        int tileLength = ioManager.getIntInput(
                "Please enter length of tile (must be whole number): ",
                1,
                Integer.MAX_VALUE);
        int tileWidth = ioManager.getIntInput(
                "Please enter width of tile (must be whole number): ",
                1,
                Integer.MAX_VALUE);
        int roomLength = ioManager.getIntInput(
                "Please enter length of room (must be whole number): ",
                1,
                Integer.MAX_VALUE);
        int roomWidth = ioManager.getIntInput(
                "Please enter width of room (must be whole number): ",
                1,
                Integer.MAX_VALUE);
        double m2Price = ioManager.getDecimalInput(
                "Please enter price of m2 of tiles: ",
                0.0,
                Double.MAX_VALUE);
        Order tileOrder = new Order(tileLength, tileWidth, roomLength, roomWidth, m2Price);
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
        List<Double> inputs = ioManager.getDecimalsInputUntilStop(
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
            System.out.println(CONSOLE_CLEAR);

            System.out.println(DIGITS[i]);
            System.out.println(FESTIVE_MESSAGES[i]);

            try {
                Thread.sleep(sleepMs);
            } catch (InterruptedException e) {
                System.out.println("Exception during countdown: " + e.getMessage());
            }
        }
    }

    private void calculateFlight() {
        int hours = ioManager.getIntInput(
                "Please enter hours when sleigh takes off from North Pole (must be whole number): ",
                0,
                23);
        int minutes = ioManager.getIntInput(
                "Please enter minutes when sleigh takes off from North Pole (must be whole number): ",
                0,
                59);
        long flightDuration = ioManager.getIntInput(
                "Please enter for how long flight lasts (must be whole number): ",
                0,
                59);
        LocalDateTime takeOffTime = LocalDateTime.of(2025, DECEMBER, 31, hours, minutes, 0);
        LocalDateTime landingTime = takeOffTime.plusMinutes(flightDuration);

        System.out.printf(
                "If Santa takes off at %d hour and %d minute, and the flight lasts %d minutes, " +
                        "then Santa will land at %d hour and %d minute.\n",
                hours,
                minutes,
                flightDuration,
                landingTime.getHour(),
                landingTime.getMinute());
    }

    private void calculateSeats() {
        int rows = ioManager.getIntInput(
                "Please enter how many rows there are in a hall (must be whole number): ",
                0,
                Integer.MAX_VALUE);
        int seatsInFirstRow = ioManager.getIntInput(
                "Please enter how many seats there are in first row (must be whole number): ",
                0,
                Integer.MAX_VALUE);
        SeatCalculator seatCalculator = new SeatCalculator(rows, seatsInFirstRow);
        seatCalculator.calculateSeats();

        System.out.println(seatCalculator.getResults());
    }

    private void generateChristmasLightsPattern() {
        int rows = ioManager.getIntInput(
                "Please enter Christmas lights pattern size N (must be whole number): ",
                1,
                Integer.MAX_VALUE);
        LightsGenerator lightsGenerator = new LightsGenerator(rows);

        System.out.println(lightsGenerator.getPattern());
    }

    private void choosePerfectMelon() {
        int totalMelons = ioManager.getIntInput(
                "Please enter the number of melons (must be whole number): ",
                1,
                Integer.MAX_VALUE);
        List<Double> weightsOfMelons = ioManager.getNumberOfDecimalsInput(
                String.format("Please enter the weight for no. %%d melon out of %d: ", totalMelons),
                0.005,
                Double.MAX_VALUE,
                totalMelons);
        WeightCalculator weightCalculator = new WeightCalculator(weightsOfMelons);
        weightCalculator.calculateAverageWeight();
        weightCalculator.calculatePerfectMelonNumber();

        System.out.println(weightCalculator.getResults());
    }

    private void calculateMysteryTime() {
        int hours = ioManager.getIntInput(
                "Please enter magical clock hours (must be whole number): ",
                0,
                23);
        int minutes = ioManager.getIntInput(
                "Please enter magical clock minutes (must be whole number): ",
                0,
                59);
        LocalTime now = LocalTime.of(hours, minutes);
        LocalTime timeAfterRotation = now.plusMinutes(MINUTES_PASSED);

        System.out.printf(
                "If magical clock currently shows %s, then after a full 360° turn it will show %s.\n",
                now,
                timeAfterRotation);
    }
}
