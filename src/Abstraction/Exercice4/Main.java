package Abstraction.Exercice4;

public class Main {

    public static void main(String[] args){
        Animal[] animaux = new Animal[2];

        animaux[0] = new Chien();
        animaux[1] = new Chat();

        System.out.println("Methode 1");
        for (int i =0 ; i < animaux.length ; i++){
            animaux[i].crier();
        }

        System.out.println("Methode 2");
        for (Animal el : animaux){
            el.crier();
        }


    }
}
