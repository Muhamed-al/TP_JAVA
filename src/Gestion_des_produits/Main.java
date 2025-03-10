package Gestion_des_produits;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Donner le type du produit ");
            System.out.println("1 - Produit ");
            System.out.println("2 - Produit Solde");
            System.out.println("3 - Produit Promo");
            int choix = sc.nextInt();

            System.out.println("Donner le nom du produit");
            String nom = sc.next();
            System.out.println("Dooner le prix du produit");
            double prix = sc.nextDouble();

            Produit prod;

            switch (choix){
                case 1:
                    prod = new Produit(nom , prix);
                    prod.afficherInfo();
                    break;
                case 2:
                    System.out.println("Donner le pourcentage du reduction ");
                    double pourcentage = sc.nextDouble();
                    prod = new ProduitSoldes(nom , prix  , pourcentage);
                    prod.afficherInfo();
                    break;
                case 3:
                    System.out.println("Donner le prix promotionnel :");
                    double prixPromo = sc.nextDouble();
                    prod = new ProduitPromotion(nom , prix , prixPromo);
                    prod.afficherInfo();
                    break;
                default :
                    System.out.println("Choix invalide ");

            }

        }

    }
}
