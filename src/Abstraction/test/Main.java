package Abstraction.test;

import Abstraction.Exercice4.Animal;
import Abstraction.Exercice4.Chat;
import Abstraction.Exercice4.Chien;

public class Main {

    public static void main(String[] args){
        Paiement p = new Paypal(1000);
        p.effectuerPaiement();

        Paiement p1 = new CarteBAncaire(200);
        p1.effectuerPaiement();
    }
}
