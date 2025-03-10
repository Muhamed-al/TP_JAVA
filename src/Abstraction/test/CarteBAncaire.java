package Abstraction.test;

public class CarteBAncaire extends  Paiement{


    public CarteBAncaire(double montant) {
        super(montant);
    }

    @Override
    public void effectuerPaiement() {
        System.out.println("Carte Bancaire " + getMontant());
    }
}
