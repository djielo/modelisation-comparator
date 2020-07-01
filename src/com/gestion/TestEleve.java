package com.gestion;

import java.util.ArrayList;

public class TestEleve {
    public static void main(String[] args) {
        Eleve el = new Eleve ("jerome");
        ArrayList<Integer> listeNote = new ArrayList<> ();
        el.ajouterNote (9);
        el.ajouterNote (11);
        System.out.println (el.calculMoyenne ());


    }
}
