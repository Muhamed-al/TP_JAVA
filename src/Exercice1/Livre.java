package Exercice1;


class Livre {
    private String titre;
    private String auteur;
    private boolean disponible;

    public Livre(String titre, String auteur, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = disponible;
    }

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Le livre \"" + titre + "\" a été emprunté avec succès.");
        } else {
            System.out.println("Désolé, le livre \"" + titre + "\" n'est pas disponible.");
        }
    }

    public void retourner() {
        if (!disponible) {
            disponible = true;
            System.out.println("Le livre \"" + titre + "\" a été retourné avec succès.");
        } else {
            System.out.println("Le livre \"" + titre + "\" est déjà disponible.");
        }
    }

    // Méthode pour afficher les informations du livre
    public void afficherInfos() {
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Disponibilité : " + (disponible ? "Disponible" : "Emprunté"));
    }
}

