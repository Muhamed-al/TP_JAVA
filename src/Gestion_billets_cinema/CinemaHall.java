package Gestion_billets_cinema;

public class CinemaHall {
    Seat[][] seats;

    public CinemaHall(int row , int numberPerRow){
        seats= new Seat[row][numberPerRow];
        for (int i = 0 ; i <row ; i++){
            for (int j = 0 ; j< numberPerRow ; j++){
                seats[i][j] = new Seat(i+1 , j+1);
            }
        }
    }

    public void displaySeats(){
        for (Seat[] row : seats){
            for (Seat seat : row){
                System.out.print(seat);
            }
            System.out.println();
        }
    }

    public void reserver(int row , int col){
        if (isValidSeat(row , col)){
            seats[row-1][col-1].reserve();
        }else {
            System.out.println("Numéro de siège invalide.");
        }
    }

    public void release(int row , int col){
        if (isValidSeat(row , col)){
            seats[row-1][col-1].release();
        }else {
            System.out.println("Numéro de siège invalide.");
        }
    }

    public boolean isValidSeat(int row , int col){
        return row > 0 &&
                row <= seats.length &&
                col > 0 &&
                col <= seats[0].length;
    }
}
