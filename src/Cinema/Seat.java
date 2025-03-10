package Cinema;

class Seat {
    private int row;
    private int number;
    private boolean isAvailable;

    public Seat(int row, int number) {
        this.row = row;
        this.number = number;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void reserve() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Siège " + row + "-" + number + " réservé avec succès.");
        } else {
            System.out.println("Le siège " + row + "-" + number + " est déjà réservé.");
        }
    }

    public void release() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Siège " + row + "-" + number + " libéré.");
        } else {
            System.out.println("Le siège " + row + "-" + number + " est déjà disponible.");
        }
    }

    @Override
    public String toString() {
        return isAvailable ? "[O]" : "[X]";
    }
}
