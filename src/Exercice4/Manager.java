package Exercice4;

class Manager extends Employe {
    private double prime;

    public Manager(String nom, double salaire, double prime) {
        super(nom, salaire);
        this.prime = prime;
    }

    public double calculerSalaire() {
        double newSalaire = super.calculerSalaire() + prime;
        System.out.println("Le salaire final de " + getNom() + " est : " + newSalaire+ " DT");
        return newSalaire;
    }
}
