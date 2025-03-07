package Exercice2;

public class CompteBancaire {

    private int numCompte;
    private double solde;

    public CompteBancaire(int numCompte, double solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant){
        this.solde+=montant;
        System.out.println("Votre solde est : " + solde);
    }
    public void retirer(double montant){
        if (montant <= solde){
            solde -=montant;
            System.out.println("Votre solde est : " + solde);
        }else{
            System.out.println("Solde insuffisant");
        }
    }
}
