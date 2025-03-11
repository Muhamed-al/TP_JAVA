package Abstraction.Exercice1;

public class Main {

    public static  void main(String[] args){
        Vehicule voiture = new Voiture();
        voiture.demarer();
        voiture.arreter();
        Vehicule moto = new Moto();
        moto.demarer();
        moto.arreter();
    }
}
