package Abstraction.Exercice2;

public class Main {

    public static void main(String[] args){
        Message email = new Email("Bonjour ING 3 J N ");
        email.envoyer();
        Message sms = new SMS("Bonjour ING 3 J N");
        sms.envoyer();
    }
}
