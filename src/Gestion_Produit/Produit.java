package Gestion_Produit;

public class Produit {

    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void affcherDetails(){
        System.out.println("Nom : " + nom);
        System.out.println("Prix : " + prix);
    }
}
