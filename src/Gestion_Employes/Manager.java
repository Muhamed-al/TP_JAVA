package Gestion_Employes;

public class Manager extends Employe{

    private double prime;

    public Manager(String nom, int age, double salaire, double prime) {
        super(nom, age, salaire);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }
    @Override
    public void AfficherDetails(){
        super.AfficherDetails();
        System.out.println("Prime : " + prime);
    }

}
