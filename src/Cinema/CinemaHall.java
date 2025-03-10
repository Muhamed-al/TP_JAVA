package Cinema;

public class CinemaHall {
    private Seat[][] seats;

    public CinemaHall(int rows, int seatsPerRow) {
        seats = new Seat[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                seats[i][j] = new Seat(i + 1, j + 1);
            }
        }
    }

    public void displaySeats() {
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    public void reserveSeat(int row, int number) {
        if (isValidSeat(row, number)) {
            seats[row - 1][number - 1].reserve();
        } else {
            System.out.println("Numéro de siège invalide.");
        }
    }

    public void releaseSeat(int row, int number) {
        if (isValidSeat(row, number)) {
            seats[row - 1][number - 1].release();
        } else {
            System.out.println("Numéro de siège invalide.");
        }
    }

    private boolean isValidSeat(int row, int number) {
        return row > 0 && row <= seats.length && number > 0 && number <= seats[0].length;
    }
}

