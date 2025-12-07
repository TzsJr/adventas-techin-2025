package lt.ng.model;

public class SeatCalculator {
    private final int rows;
    private final int firstRowSeats;
    private long totalSeats;

    public SeatCalculator(int rows, int firstRowSeats) {
        this.rows = rows;
        this.firstRowSeats = firstRowSeats;
    }

    public void calculateSeats() {
        int seatsOnCurrentRow = firstRowSeats;

        for (int i = 1; i <= rows; i++) {
            totalSeats += seatsOnCurrentRow;
            seatsOnCurrentRow += 2;
        }
    }

    public String getResults() {
        return String.format("If first row has %d seats and there are %d rows, in total we will need %d seats",
                firstRowSeats,
                rows,
                totalSeats);
    }
}
