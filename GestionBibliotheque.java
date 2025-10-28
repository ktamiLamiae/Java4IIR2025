package javaAvance4IIR;

import java.util.ArrayList;

public class GestionBibliotheque {
    private ArrayList<Livre> livres;

    public GestionBibliotheque() {
        livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
        livre.setBibliotheque(this);
    }

    public void afficherLivres() {
        for(Livre l : livres) {
            System.out.println(l);
        }
    }
}
