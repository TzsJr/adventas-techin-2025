package lt.ng;

import lt.ng.model.Clock;
import lt.ng.model.Order;
import lt.ng.util.IOManager;

public class Main {
    public static void main(String[] args) {
        IOManager ioManager = new IOManager();
        Order tileOrder = new Order();

        ioManager.welcome();
        processOrder(ioManager, tileOrder);
        calculateTime(ioManager);
    }

    private static void processOrder(IOManager ioManager, Order tileOrder) {
        tileOrder.setTileLength(ioManager.getIntInput(
                "Please enter length of tile (must be whole number): ",
                0,
                Integer.MAX_VALUE));
        tileOrder.setTileWidth(ioManager.getIntInput(
                "Please enter width of tile (must be whole number): ",
                0,
                Integer.MAX_VALUE));
        tileOrder.setRoomLength(ioManager.getIntInput(
                "Please enter length of room (must be whole number): ",
                0,
                Integer.MAX_VALUE));
        tileOrder.setRoomWidth(ioManager.getIntInput(
                "Please enter width of room (must be whole number): ",
                0,
                Integer.MAX_VALUE));
        tileOrder.setM2price(ioManager.getDecimalInput(
                "Please enter price of m2 of tiles: ",
                0.0,
                Double.MAX_VALUE));
        tileOrder.calculateTotalCost();

        System.out.println(tileOrder.getOrderInvoice());
    }

    private static void calculateTime(IOManager ioManager) {
        int hours = ioManager.getIntInput(
                "Please enter workshop clock hours (must be whole number): ",
                -1,
                23);
        int minutes = ioManager.getIntInput(
                "Please enter workshop clock minutes (must be whole number): ",
                -1,
                59);
        Clock clock = new Clock(hours, minutes);

        System.out.println(clock.getTime());
    }
}
