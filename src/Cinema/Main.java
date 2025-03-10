package Cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CinemaHall cinema = new CinemaHall(5, 5);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Afficher les sièges");
            System.out.println("2. Réserver un siège");
            System.out.println("3. Libérer un siège");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cinema.displaySeats();
                    break;
                case 2:
                    System.out.print("Entrez la rangée: ");
                    int row = scanner.nextInt();
                    System.out.print("Entrez le numéro de siège: ");
                    int number = scanner.nextInt();
                    cinema.reserveSeat(row, number);
                    break;
                case 3:
                    System.out.print("Entrez la rangée: ");
                    row = scanner.nextInt();
                    System.out.print("Entrez le numéro de siège: ");
                    number = scanner.nextInt();
                    cinema.releaseSeat(row, number);
                    break;
                case 4:
                    System.out.println("Merci d'avoir utilisé le système de réservation de cinéma !");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        }
    }
}
