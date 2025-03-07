package Gestion_Produit;

public class ProduitPromotion extends Produit{

    private double prixPromo;

    public ProduitPromotion(String nom, double prix, double prixPromo) {
        super(nom, prix);
        this.prixPromo = prixPromo;
    }

    public double getPrixPromo() {
        return prixPromo;
    }

    public void setPrixPromo(double prixPromo) {
        this.prixPromo = prixPromo;
    }

    @Override
    public void affcherDetails(){
        System.out.println("Nom : " + super.getNom());
        System.out.println("Prix : " + (super.getPrix()  - prixPromo));
    }
}
