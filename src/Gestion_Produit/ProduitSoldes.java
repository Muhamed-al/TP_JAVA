package Gestion_Produit;

public class ProduitSoldes extends Produit{

    private double pourcentage;

    public ProduitSoldes(String nom, double prix, double pourcentage) {
        super(nom, prix);
        this.pourcentage = pourcentage;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    @Override
    public void affcherDetails(){
        System.out.println("Nom : " + super.getNom());
        System.out.println("Prix : " + (super.getPrix() - (super.getPrix() * pourcentage)/100));
    }
}
