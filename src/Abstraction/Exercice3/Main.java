package Abstraction.Exercice3;

public class Main {

    public static void main(String[] args){
        Paiement carteBancaire = new CarteBancaire();
        carteBancaire.effectuerPaiement(1200);

        Paiement crypto = new CryptoMonnaie();
        crypto.effectuerPaiement(4500);
    }
}
