package Abstraction.Exercice3;

public class CarteBancaire extends Paiement{
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement dde " + montant + " effectué avec carte bancaire ");
    }
}
