package Exercice5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Donner le montant a payé");
        double montant = sc.nextDouble();

        System.out.println("Choisissez le type de paiment");
        System.out.println("1 - Carte Bancaire");
        System.out.println("2 - Paypal");
        int choix = sc.nextInt();
        Paiement p;
        switch (choix){
            case 1 :
                p  = new CarteBancaire();
                p.effectuerPaiemment(montant);
                break;
            case 2 :
                p = new Paypal();
                p.effectuerPaiemment(montant);
                break;
            default:
                System.out.println("ERROR ");
        }

    }
}
