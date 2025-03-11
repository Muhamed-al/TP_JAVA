package Abstraction.test;

public class CarteBancaire extends Paiement{

    public CarteBancaire(double montant){
        super(montant);
    }
    @Override
    public void effectuerPaiment(double montant) {
        System.out.println("Paiment avec carte bancaire");
    }
}
