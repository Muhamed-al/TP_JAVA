package Abstraction.Exercice2;

public class Main {

    public static void main(String[] args){
        Message sms = new SMS("Bonjour");
        sms.envoyer();
        Message email = new Email("Bonsoir");
        email.envoyer();
    }
}
