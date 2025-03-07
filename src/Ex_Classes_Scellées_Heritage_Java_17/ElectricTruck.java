package Ex_Classes_Scellées_Heritage_Java_17;

public final  class ElectricTruck extends Truck{

    public ElectricTruck(String brand) {
        super(brand);
    }

    public void chargeBattery(){
        System.out.println("Le camion charge du materiel.");
    }
}
