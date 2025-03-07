package Gestion_Employes;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Entreprise entreprise = new Entreprise(2);

        while(true){
            System.out.println("Developpeur (D) / Manager (M)");
            String type = sc.next();

            System.out.println("Donner le nom du l'employé ");
            String nom = sc.next();

            System.out.println("Donner l'age du l'employé ");
            int age  = sc.nextInt();

            System.out.println("Donner le salaire de l'employé ");
            double salaire = sc.nextDouble();

            if (type.equalsIgnoreCase("D")){
                System.out.println("Donner le nombre des heures supp :");
                int heuresSupp = sc.nextInt();
                Employe dev = new Developpeur(nom , age , salaire , heuresSupp);
                entreprise.ajouterEmploye(dev);
            } else if (type.equalsIgnoreCase("M")) {
                System.out.println("Donner le prime du l'employé ");
                double prime = sc.nextDouble();
                entreprise.ajouterEmploye(new Manager(nom , age , salaire , prime));
            }else{
                System.out.println("Choix invalid !");
            }

            System.out.println("Voulez vous continuer ? (y/n)");
            String choix = sc.next();
            if (choix.equalsIgnoreCase("n")){
                break;
            }

        }

        System.out.println("Affichage des employés");
        entreprise.afficherTousLesEmployes();
    }
}
