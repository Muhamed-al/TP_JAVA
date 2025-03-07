package Ex_Classes_Scellées_Heritage_Java_17;

public sealed class Vehicule permits Car , MotoCycle , Truck{

    private String brand;

    public Vehicule(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void startEngine(){
        System.out.println("Le vehicule demarre.");
    }
}
