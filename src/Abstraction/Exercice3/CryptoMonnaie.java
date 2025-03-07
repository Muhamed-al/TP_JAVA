package Abstraction.Exercice3;

public class CryptoMonnaie extends Paiement{
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " effectué avec CryptoMonnaie");
    }
}
