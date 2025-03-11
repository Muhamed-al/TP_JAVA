package Abstraction.Exercice4;

public class Main {

    public static void main(String[] args){

        Animal[] animaux = new Animal[2];

        animaux[0] = new Chien();
        animaux[1] = new Chat();

        for (int i = 0 ; i< animaux.length ; i++){
            if (animaux[i] instanceof Chien){
                System.out.println("Chien");
            }else {
                System.out.println("Chat ");
            }
            animaux[i].crier();
        }

    }
}
