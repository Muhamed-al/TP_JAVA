package Ex_Classes_Scellées_Heritage_Java_17;

public sealed class Truck extends  Vehicule permits ElectricTruck{

    public Truck(String brand) {
        super(brand);
    }

    public void loadCargo(){
        System.out.println("'Le camion charge du materiel.'");
    }
}
