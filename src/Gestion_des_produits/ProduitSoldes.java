package Gestion_des_produits;

public class ProduitSoldes extends  Produit{

    private double pourcentageReduction;

    public ProduitSoldes(String nom, double prix , double pourcentageReduction) {
        super(nom, prix);
        this.pourcentageReduction = pourcentageReduction;
    }


    public double getPourcentageReduction() {
        return pourcentageReduction;
    }

    public void setPourcentageReduction(double pourcentageReduction) {
        this.pourcentageReduction = pourcentageReduction;
    }

    @Override
    public void afficherInfo(){
        System.out.println("Nom : " + getNom());
        System.out.println("Prix apres reduction : " + (getPrix() - (getPrix()*pourcentageReduction)/100));
    }

}
