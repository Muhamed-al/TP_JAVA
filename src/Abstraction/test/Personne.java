package Abstraction.test;

public class Personne {

    String name;
    int age;
    String cin;

    public Personne(String name, int age, String cin) {
        this.name = name;
        this.age = age;
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "Bonjour";
    }
}
