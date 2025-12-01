package lt.ng;

import lt.ng.model.Order;
import lt.ng.util.IOManager;

public class Main {
    public static void main(String[] args) {
        IOManager ioManager = new IOManager();
        Order tileOrder = new Order();

        ioManager.welcome();
        processOrder(ioManager, tileOrder);
    }

    private static void processOrder(IOManager ioManager, Order tileOrder) {
        tileOrder.setTileLength(ioManager.getIntInput("Please enter length of tile (must be whole number): "));
        tileOrder.setTileWidth(ioManager.getIntInput("Please enter width of tile (must be whole number): "));
        tileOrder.setRoomLength(ioManager.getIntInput("Please enter length of room (must be whole number): "));
        tileOrder.setRoomWidth(ioManager.getIntInput("Please enter width of room (must be whole number): "));
        tileOrder.setM2price(ioManager.getDecimalInput("Please enter price of m2 of tiles: "));
        tileOrder.calculateTotalCost();

        System.out.println(tileOrder.getOrderInvoice());
    }
}
