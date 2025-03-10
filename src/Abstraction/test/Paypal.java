package Abstraction.test;

public class Paypal extends Paiement{

    public Paypal(double montant) {
        super(montant);
    }

    @Override
    public void effectuerPaiement() {
        System.out.println("Paypal" + getMontant());
    }
}
