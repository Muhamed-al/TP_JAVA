package Gestion_Employes;

public class Developpeur extends Employe{

    private int nbHeuresSupp;

    public Developpeur(String nom, int age, double salaire, int nbHeuresSupp) {
        super(nom, age, salaire);
        this.nbHeuresSupp = nbHeuresSupp;
    }

    public int getNbHeuresSupp() {
        return nbHeuresSupp;
    }

    public void setNbHeuresSupp(int nbHeuresSupp) {
        this.nbHeuresSupp = nbHeuresSupp;
    }

    @Override
    public void AfficherDetails(){
        super.AfficherDetails();
        System.out.println("Heures Supp : " + nbHeuresSupp);
    }
}
