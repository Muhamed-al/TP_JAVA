package Exercice5;

public class CarteBancaire extends Paiement{

    @Override
    public void effectuerPaiemment(double montant){
        System.out.println("Paiement de "+ montant +" dt  effectué par carte bancaire.");
    }
}
