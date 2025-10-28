package javaAvance4IIR;

import java.util.LinkedList;

public class GestionTaches {
    private LinkedList<Tache> taches = new LinkedList<>();

    public void ajouterTache(Tache tache) {
        taches.add(tache);
    }

    public void terminerPremiereTache() {
        if (!taches.isEmpty()) {
            taches.getFirst().terminer();
        }
    }

    public void afficherTaches() {
        for (Tache t : taches) {
            System.out.println(t);
        }
    }
}