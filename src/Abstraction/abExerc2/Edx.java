package Abstraction.abExerc2;

public class Edx extends Message{
    public Edx(String contenu) {
        super(contenu);
    }

    @Override
    public void envoyer() {
        System.out.println("Message Edx envoyé " + getContenu());
    }

    @Override
    public void afficher(){
        System.out.println("Credentials : " + "login : xxxxx" + "passsword : xxxxxx");
    }
}
