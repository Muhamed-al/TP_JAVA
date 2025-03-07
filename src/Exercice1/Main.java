package Exercice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le titre du livre : ");
        String titre = scanner.nextLine();
        System.out.print("Entrez l'auteur du livre : ");
        String auteur = scanner.nextLine();
        System.out.print("Le livre est-il disponible ? (true/false) : ");
        boolean disponible = scanner.nextBoolean();

        Livre livre = new Livre(titre, auteur, disponible);

        System.out.println("Informations du livre :");
        livre.afficherInfos();

        while (true) {
            System.out.println("\nQue voulez-vous faire ?");
            System.out.println("1. Emprunter le livre");
            System.out.println("2. Retourner le livre");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    livre.emprunter();
                    break;
                case 2:
                    livre.retourner();
                    break;
                case 3:
                    System.out.println("Merci d'avoir utilisé notre système de gestion de livres.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 3.");
            }

            System.out.println("\nInformations mises à jour du livre :");
            livre.afficherInfos();
        }
    }
}
