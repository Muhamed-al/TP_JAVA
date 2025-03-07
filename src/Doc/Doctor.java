package Doc;

public class Doctor extends Personne{

    private String speciality;

    public Doctor(String name , String email  ,String speciality){
        super(name , email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
