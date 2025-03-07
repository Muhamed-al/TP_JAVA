package Ex_Classes_Scellées_Heritage_Java_17;

public final class Car extends Vehicule{

    public Car(String brand) {
        super(brand);
    }

    public void drive(){
        System.out.println("La voiture roule");
    }
}
