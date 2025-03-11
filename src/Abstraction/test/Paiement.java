package Abstraction.test;

public abstract class Paiement {

    private double montant;

    public Paiement(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    abstract public  void effectuerPaiment(double montant);


}
