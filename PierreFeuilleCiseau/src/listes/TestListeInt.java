package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> listeEntiers = new ArrayList<Integer>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

        System.out.println("Éléments de la liste : " + listeEntiers);

        System.out.println("Taille de la liste : " + listeEntiers.size());

        Integer maxElement = Collections.max(listeEntiers);
        System.out.println("L'élément le plus grand dans la liste : " + maxElement);

        Integer minElement = Collections.min(listeEntiers);
        listeEntiers.remove(minElement);
        System.out.println("Éléments de la liste après suppression du plus petit élément (" + minElement + ") : " + listeEntiers);

        for (int i = 0; i < listeEntiers.size(); i++) {
            if (listeEntiers.get(i) < 0) {
                listeEntiers.set(i, Math.abs(listeEntiers.get(i)));
            }
        }

        System.out.println("Éléments de la liste après modification des éléments négatifs : " + listeEntiers);

    }
}
