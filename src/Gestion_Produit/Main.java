package Gestion_Produit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);

        System.out.println("Type Produit");
        System.out.println("1 - Produit Solde");
        System.out.println("2 - Produit Promotion");
        int choix = sc.nextInt();
        String nom;
        double price;
        Produit p ;
        switch (choix){
            case 1 :
                System.out.println("Donner le nom du produit : ");
                nom = sc.next();

                System.out.println("Donner le Prix ");
                 price = sc.nextDouble();

                System.out.println("Donner le pourcentage de reduction ");
                double reduction  = sc.nextDouble();
                p = new ProduitSoldes(nom , price , reduction);
                p.affcherDetails();
                break;
            case 2 :
                System.out.println("Donner le nom du produit : ");
                nom = sc.next();

                System.out.println("Donner le Prix ");
                price = sc.nextDouble();

                System.out.println("Donner le pourcentage de reduction ");
                double prixPromo  = sc.nextDouble();
                p = new ProduitPromotion(nom , price , prixPromo);
                p.affcherDetails();
                break;
            default:
                System.out.println("ERROR !");
        }





    }
}
