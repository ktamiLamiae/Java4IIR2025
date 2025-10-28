package javaAvance4IIR;

import java.util.HashSet;
import java.util.Objects;

public class Etudiant {
    private String nom;
    private int numero;

    public Etudiant(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    // Getters
    public String getNom() { return nom; }
    public int getNumero() { return numero; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return numero == etudiant.numero && nom.equals(etudiant.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, numero);
    }

    @Override
    public String toString() {
        return "Etudiant{" + "nom='" + nom + '\'' + ", numero=" + numero + '}';
    }
}

class GestionEtudiants {
    private HashSet<Etudiant> etudiants = new HashSet<>();

    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    public void afficherEtudiants() {
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        GestionEtudiants ge = new GestionEtudiants();
        ge.ajouterEtudiant(new Etudiant("Ali", 101));
        ge.ajouterEtudiant(new Etudiant("Sara", 102));
        ge.ajouterEtudiant(new Etudiant("Ali", 101)); // Duplicate
        ge.afficherEtudiants();
    }
}

//Etudiant{nom='Sara', numero=102}
//Etudiant{nom='Ali', numero=101}