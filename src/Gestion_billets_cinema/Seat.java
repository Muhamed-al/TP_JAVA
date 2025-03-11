package Gestion_billets_cinema;

public class Seat {

    private int row;
    private int number;
    private boolean isAvailable;

    public Seat(int row, int number ) {
        this.row = row;
        this.number = number;
        this.isAvailable = true;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



    public void reserve(){
        if (isAvailable){
            isAvailable = false;
            System.out.println("Place reservée avec succes");
        }else{
            System.out.println("Place deja reservée");
        }
    }

    public void release(){
        if (isAvailable){
            System.out.println("Place deja disponible");
        }else{
            isAvailable = true;
            System.out.println("Place libéré avec succes ");
        }
    }

    @Override
    public String toString() {
        return isAvailable ? "[O]" : "[X]";
    }
}
