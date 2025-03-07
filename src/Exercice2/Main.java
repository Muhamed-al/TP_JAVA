package Exercice2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le numero du compte :");
        int  num = sc.nextInt();
        System.out.println("Donner le solde du compte :");
        double solde = sc.nextDouble();

        CompteBancaire compte = new CompteBancaire(num , solde);

        System.out.println("Que voulez vous faire :");
        System.out.println("1- Retirer ");
        System.out.println("2- Deposer");

        int choix = sc.nextInt();
        double montant;
        switch (choix){
            case 1 :
                System.out.println("Donner le montant a retirer");
                montant = sc.nextDouble();
                compte.retirer(montant);
                break;
            case 2 :
                System.out.println("Donner le montant a deposer");
                montant = sc.nextDouble();
                compte.deposer(montant);
                break;
            default:
                System.out.println("Vous devez choisir entre 1 et 2");

        }
    }

}