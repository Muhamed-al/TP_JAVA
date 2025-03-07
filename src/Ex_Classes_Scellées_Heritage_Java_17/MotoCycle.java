package Ex_Classes_Scellées_Heritage_Java_17;

public non-sealed class MotoCycle extends Vehicule{
    public MotoCycle(String brand) {
        super(brand);
    }

    public void wheelie(){
        System.out.println("La moto fait un wheeling");
    }
}
