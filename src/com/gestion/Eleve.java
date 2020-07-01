package com.gestion;

import java.util.ArrayList;

public class Eleve  implements  CompareTo<Eleve>{
    private String nom;
    private ArrayList<Integer> listeNote = new ArrayList<Integer> ();
    private double moyenne;

    public Eleve(String nom) {
        this.nom = nom;
    }


    public String getNom() {
        return nom;
    }

    public ArrayList<Integer> getListeNote() {
        return listeNote;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void ajouterNote(int note) {
        int nbreNote = listeNote.size ();
        if (note < 0)
            note = 0;
        else if (note >= 20) {
            note = 20;
        }
        listeNote.add (note);
        this.moyenne = (this.moyenne * nbreNote + note) / (nbreNote + 1);
    }

    public double calculMoyenne() {
        // listeNote
        double somme =0;
        for( int i=0 ; i < listeNote.size (); i++){
            somme += listeNote.get (i);
        }
        return somme/listeNote.size ();
    }

    @Override
    public String toString() {
        return "Eleve{" +
                "nom='" + nom + '\'' +
                ", moyenne=" + moyenne +
                '}';
    }

    @Override
    public int compareTo(Eleve autreEleve) {
        if(this.moyenne < autreEleve.moyenne) return  -1;
        if(this.moyenne > autreEleve.moyenne) return 1;
        return 0;
    }
}
