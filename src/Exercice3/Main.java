package Exercice3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Moto / Voiture");
        int choix= sc.nextInt();
        String marque;
        double vitesseMax;
        int cylindree;
        int nbPortes;
        switch (choix){
            case 1 :
                System.out.println("Donner la marque");
                marque = sc.next();
                System.out.println("Donner le vitesse MAx");
                vitesseMax = sc.nextDouble();
                System.out.println("Donner le nombres des portes ");
                nbPortes = sc.nextInt();
                Voiture v = new Voiture(marque, vitesseMax , nbPortes);
                v.afficherInfo();
                break;
            case 2 :
                System.out.println("Donner la marque");
                marque = sc.next();
                System.out.println("Donner le vitesse MAx");
                vitesseMax = sc.nextDouble();
                System.out.println("Donner le nombres des cylindree ");
                cylindree = sc.nextInt();
                Moto m = new Moto(marque, vitesseMax , cylindree);
                m.afficherInfo();
                break;
        }
    }
}
