package Abstraction.Exercice2;

public class SMS extends Message{
    public SMS(String content) {
        super(content);
    }

    @Override
    public void envoyer() {
        System.out.println("SMS envoyé : " + getContent());
    }
}
