package Doc;

public class Patient extends  Personne{

    private String maladie;

    public Patient(String name , String email , String maladie){
        super(name ,email);
        this.maladie =maladie;
    }

    public String getMaladie() {
        return maladie;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
    }

    public void afficherDetails(){
        super.afficherDetails();
        System.out.println("Maladie : " + maladie);
    }
}
