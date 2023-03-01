package fr.m2i.m2ws.model;

public class Personne {
    private String nom;
    private String prenom;

    public Personne() {
        this("Doe", "John");
    }

    public Personne(String nom, String prenom) {
        this.setNom(nom);
        this.setPrenom(prenom);
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
