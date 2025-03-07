package Polymorphisme;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Calculatrice cal = new Calculatrice();
        int a = 10 ;
        int b = 23;
        cal.add(a,b);


        /*Scanner sc = new Scanner(System.in);
        Personne[] personnes = new Personne[2];

        for (int i = 0  ; i< personnes.length ; i++){
            System.out.println("Donner le nom du personne numero " + i);
            String name = sc.next();
            System.out.println("Donner l'age du personne numero " + i);
            int age = sc.nextInt();
            Personne per = new Personne(name , age);
            personnes[i] = per;
        }
        System.out.println("////////// Affiche du tableau ");
        for (int i = 0 ; i < personnes.length ; i++){
            System.out.println("Personne N° " + i);
            System.out.println("Name : " + personnes[i].getName());
            System.out.println("Age : " + personnes[i].getAge());
        }*/
    }
}
