package Gestion_billets_cinema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CinemaHall cinema = new CinemaHall(5,5);

        while(true){
            System.out.println("Menu : ");
            System.out.println("1. Affcher Cinema");
            System.out.println("2. Reserver une place");
            System.out.println("3. Liberer une place");
            System.out.println("4. Quitter");

            int row;
            int col;
            int choix = sc.nextInt() ;
            switch (choix){
                case 1 :
                    cinema.displaySeats();
                    break;
                case 2 :
                    System.out.println("Donner le numero du rangée");
                    row = sc.nextInt();
                    System.out.println("Donner le numero de la place ");
                    col = sc.nextInt();
                    cinema.reserver(row , col);
                    break;
                case 3 :
                    System.out.println("Donner le numero du rangée");
                    row = sc.nextInt();
                    System.out.println("Donner le numero de la place ");
                    col = sc.nextInt();
                    cinema.release(row , col);
                    break;
                case 4 :
                    System.out.println("Merci d'utiliser notre systeme de cinema ");
                    return;
                default:
                    System.out.println("Choix invalide");
            }
        }
    }
}
