package Exercice5;

public class Paypal extends Paiement{


    @Override
    public void effectuerPaiemment(double montant){
        System.out.println("Paiement de "+ montant +" dt  effectué par Paypal.");
    }
}
