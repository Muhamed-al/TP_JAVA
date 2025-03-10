package Abstraction.abExerc2;

public abstract class SMS extends Message{
    public SMS(String contenu) {
        super(contenu);
    }

    @Override
    public void envoyer() {
        System.out.println("SMS Envoyé : " + getContenu());
    }
    public abstract void afficher();

}
