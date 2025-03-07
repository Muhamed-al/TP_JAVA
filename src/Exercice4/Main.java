package Exercice4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voulez-vous créer un Employé (1) ou un Manager (2) ? ");
        int choix = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entrez le nom de l'employé : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le salaire : ");
        double salaire = scanner.nextDouble();

        Employe employe;

        if (choix == 2) {
            System.out.print("Entrez la prime du manager : ");
            double prime = scanner.nextDouble();
            employe = new Manager(nom, salaire, prime);
        } else {
            employe = new Employe(nom, salaire);
        }
        employe.calculerSalaire();
    }
}
