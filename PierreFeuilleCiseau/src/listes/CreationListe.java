package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> listeNombres = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++) {
            listeNombres.add(i);
        }

        System.out.println("La taille de la liste est : " + listeNombres.size());
    }
}
