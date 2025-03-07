package Gestion_Employes;

public class Entreprise {
    private Employe[] employes;
    private int compteur;

    public Entreprise(int taille){
        employes = new Employe[taille];
        compteur = 0;
    }

    public Employe[] getEmployes() {
        return employes;
    }

    public void setEmployes(Employe[] employes) {
        this.employes = employes;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public void ajouterEmploye(Employe e){
        if ( compteur < employes.length){
            employes[compteur] = e;
            compteur++;
        }else{
            System.out.println("L'entreprise est pleine ");
        }
    }
    public void afficherTousLesEmployes(){
        for (int i=0 ; i< compteur ; i++){
            employes[i].AfficherDetails();
            System.out.println("------------------");
        }
    }

}
