package javaAvance4IIR;

import java.util.ArrayList;

public class Livre {
    private String titre;
    private String auteur;
    private int annee;
    private GestionBibliotheque bibliotheque;

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public int getAnnee() { return annee; }

    //setter pr lier un livre a une biblio
    public void setBibliotheque(GestionBibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    public GestionBibliotheque getBibliotheque() {
        return bibliotheque;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", annee=" + annee +
                '}';
    }
}