package Abstraction.test;

public class Konnect extends Paiement{


    public Konnect(double montant) {
        super(montant);
    }

    @Override
    public void effectuerPaiement() {
        System.out.println("Konnect");
    }
}
