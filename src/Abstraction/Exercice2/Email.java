package Abstraction.Exercice2;

public class Email extends Message{
    public Email(String content) {
        super(content);
    }

    @Override
    public void envoyer() {
        System.out.println("Email Envoyé : " + getContent());
    }
}
