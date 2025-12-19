package lt.ng.service;

import lt.ng.model.AnagramSorter;
import lt.ng.model.ArcheryCalculator;
import lt.ng.model.ArcheryCalculator.Coordinate;
import lt.ng.model.CartSystem;
import lt.ng.model.Clock;
import lt.ng.model.LightsGenerator;
import lt.ng.model.NumberTrimmer;
import lt.ng.model.Order;
import lt.ng.model.SeatCalculator;
import lt.ng.model.Students;
import lt.ng.model.ToyCounter;
import lt.ng.model.WeightCalculator;

import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static java.time.Month.DECEMBER;
import static lt.ng.util.NumberUtils.roundWithPrecision;
import static lt.ng.util.constant.ChristmasConstants.CONSOLE_CLEAR;
import static lt.ng.util.constant.ChristmasConstants.DIFFERENT_TOY_NUMBERS;
import static lt.ng.util.constant.ChristmasConstants.DIGITS;
import static lt.ng.util.constant.ChristmasConstants.EXPENSIVE_PRICE;
import static lt.ng.util.constant.ChristmasConstants.FESTIVE_MESSAGES;
import static lt.ng.util.constant.ChristmasConstants.IMPLEMENTED_TASKS;
import static lt.ng.util.constant.ChristmasConstants.JUICE_VESSELS;
import static lt.ng.util.constant.ChristmasConstants.MINUTES_PASSED;
import static lt.ng.util.constant.ChristmasConstants.UNEXPECTED_VALUE;

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
            case 11:
                calculatePoints();
                break;
            case 12:
                groupWords();
                break;
            case 13:
                filterGirls();
                break;
            case 14:
                processGiftCart();
                break;
            case 15:
                calculateCheapestGift();
                break;
            case 16:
                calculateGifts();
                break;
            case 17:
                calculateJuiceBottles();
                break;
            case 18:
                calculateItemsPrices();
                break;
            case 19:
                countDuplicates();
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

    private void calculatePoints() {
        Coordinate center = ioManager.getNumberOfCoordinates(
                "Please enter target's center coordinates in format x,y or (x,y): ",
                0.1,
                Double.MAX_VALUE,
                1,
                true
        ).getFirst();
        double centerMin = Math.min(center.x(), center.y());
        double bigRadius = ioManager.getDecimalInput(
                "Please enter big ring radius: ",
                0.1,
                centerMin
        );
        double mediumRadius = ioManager.getDecimalInput(
                "Please enter small ring radius: ",
                0.1,
                bigRadius
        );
        double smallRadius = ioManager.getDecimalInput(
                "Please enter small ring radius: ",
                0.1,
                mediumRadius
        );
        double bigPointValue = ioManager.getDecimalInput(
                "Please enter big ring points: ",
                0.1,
                Double.MAX_VALUE
        );
        double mediumPointValue = ioManager.getDecimalInput(
                "Please enter medium ring points: ",
                0.1,
                Double.MAX_VALUE
        );
        double smallPointValue = ioManager.getDecimalInput(
                "Please enter small ring points: ",
                0.1,
                Double.MAX_VALUE
        );
        ArcheryCalculator calculator = new ArcheryCalculator(
                center,
                smallRadius,
                mediumRadius,
                bigRadius,
                smallPointValue,
                mediumPointValue,
                bigPointValue);

        int totalShots = ioManager.getIntInput(
                "Please enter the number of shots (must be whole number): ",
                1,
                Integer.MAX_VALUE);
        List<Coordinate> madeShots = ioManager.getNumberOfCoordinates(
                String.format("Please enter %%d shot, out of %d, coordinates in format x,y or (x,y): ", totalShots),
                0.1,
                centerMin * 2,
                totalShots,
                false
        );
        calculator.addShots(madeShots);
        calculator.calculatePoints();

        System.out.println(calculator.getResults());
    }

    private void groupWords() {
        List<String> words = ioManager.getWords(
                "Please enter words array. Valid formats: \nword1,word2,word3 \nor \n[\"word1\",\"word2\",\"word3\"]: ");
        AnagramSorter anagramSorter = new AnagramSorter(words);
        anagramSorter.groupWords();

        System.out.println(anagramSorter.getResults());
    }

    private void filterGirls() {
        List<String> names = ioManager.getWords("""
                Please enter students. Valid formats:
                LastName1 FirstName1, LastName2 FirstName2
                or
                ["LastName1 FirstName", "LastName2 FirstName2"]""");
        Students students = new Students(names);
        students.calculateGirls();

        System.out.println(students.getGirls());
    }

    private void processGiftCart() {
        CartSystem cart = new CartSystem();
        cart.add("train", 30);
        System.out.println();
        cart.total();
        System.out.println();
        cart.add("train", 10);
        System.out.println();
        cart.total();
        System.out.println();
        cart.add("doll", 20);
        System.out.println();
        cart.total();
        System.out.println();
        cart.add("something", -2);
        System.out.println();
        cart.total();
        System.out.println();
        cart.list();
        System.out.println();
        cart.applyDiscount("PROMO25");
        System.out.println();
        cart.applyDiscount("PROMO50");
        System.out.println();
        cart.total();
        System.out.println();
        cart.list();
        System.out.println();
        cart.remove("train");
        System.out.println();
        cart.total();
        System.out.println();
        cart.list();
        System.out.println();
        cart.clear();
        System.out.println();
        cart.total();
        System.out.println();
        cart.list();
    }

    private void calculateCheapestGift() {
        double[] prices = ioManager.getNumberOfDecimalsInputFromLine(
                "Please enter prices of book, music CD and USB memory stick: ",
                0.0,
                Double.MAX_VALUE,
                3);
        double firstMin = Math.min(prices[0], prices[1]);
        double finalMin = roundWithPrecision(Math.min(firstMin, prices[2]), 2, RoundingMode.HALF_UP);

        System.out.printf("Peter will spend %.2f.\n", finalMin);
    }

    private void calculateGifts() {
        List<Integer[]> workshops = List.of(
                new Integer[]{5, 7, 3, 100},
                new Integer[]{6, 4, 4, 5, 200},
                new Integer[]{10, 2, 300});
        long[] workshopsGifts = new long[workshops.size()];
        long totalGifts = 0L;

        for (int i = 0; i < workshops.size(); i++) {
            Integer[] workshop = workshops.get(i);
            for (Integer integer : workshop) {
                workshopsGifts[i] += integer;
            }
            totalGifts += workshopsGifts[i];
            System.out.printf("Workshop %d made %d gifts,\n", i + 1, workshopsGifts[i]);
        }

        System.out.printf("Santa's total gift count is %d.\n", totalGifts);
    }

    private void calculateJuiceBottles() {
        int[] juiceAmounts = new int[]{45, 92, 33, 4, 2, 1, 10};
        List<Integer[]> totalVessels = new ArrayList<>();

        for (int amount : juiceAmounts) {
            int bigVessels = amount / JUICE_VESSELS[0];
            int juiceLeft = amount - bigVessels * JUICE_VESSELS[0];
            int mediumVessels = juiceLeft / JUICE_VESSELS[1];
            int smallVessels = (juiceLeft - mediumVessels * JUICE_VESSELS[1]) / JUICE_VESSELS[2];
            totalVessels.add(new Integer[]{bigVessels, mediumVessels, smallVessels});
        }

        for (int i = 0; i < totalVessels.size(); i++) {
            System.out.printf(
                    "Elf no. %d juice amount: %s, required vessels: %s\n",
                    i + 1,
                    juiceAmounts[i],
                    Arrays.toString(totalVessels.get(i)));
        }
    }

    private void calculateItemsPrices() {
        List<Double[]> itemsPrices = List.of(
                new Double[]{1.07, 2.92, 3.45, 1.09, 0.89},
                new Double[]{1.08, 2.35, 3.75, 1.12, 0.69},
                new Double[]{0.98, 2.48, 3.62, 1.10, 0.72},
                new Double[]{1.11, 2.22, 3.33, 4.44});
        List<Number[]> output = new ArrayList<>();
        double totalPrice = 0.0;

        for (int i = 0; i < itemsPrices.size(); i++) {
            Double[] store = itemsPrices.get(i);
            double oneStoreTotalPrice = 0.0;
            int itemCount = store.length;
            for (Double itemPrice : store) {
                oneStoreTotalPrice += itemPrice;
            }
            totalPrice += oneStoreTotalPrice;
            output.add(new Number[]{
                    i + 1,
                    itemCount,
                    roundWithPrecision(oneStoreTotalPrice, 2, RoundingMode.HALF_UP)});
        }

        for (Number[] storeInvoice : output) {
            System.out.printf(
                    "In store no. %s Santa bought %s items and paid %.2f.\n",
                    storeInvoice[0],
                    storeInvoice[1],
                    (double) storeInvoice[2]);
        }
        System.out.printf("In total Santa paid %.2f.\n", roundWithPrecision(totalPrice, 2, RoundingMode.HALF_UP));
    }

    private void countDuplicates() {
        int totalNumbers = ioManager.getIntInput(
                "Please enter how many toy numbers there will be: ",
                1,
                Integer.MAX_VALUE);
        int[] toyNumbers = ioManager.getNumberOfIntsInputFromLine(
                "Please enter toy numbers (must be whole numbers). Valid format: 1 2 3 4",
                1,
                DIFFERENT_TOY_NUMBERS,
                totalNumbers);
        int[] counts = new int[DIFFERENT_TOY_NUMBERS];
        Set<Integer> duplicates = new TreeSet<>();

        for (int number : toyNumbers) {
            int index = number - 1;
            counts[index]++;
            if (counts[index] > 1) {
                duplicates.add(number);
            }
        }

        System.out.printf("\nDuplicate toy numbers: %s\n", duplicates);
    }
}
