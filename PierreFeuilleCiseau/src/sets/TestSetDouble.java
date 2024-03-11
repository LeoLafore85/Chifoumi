package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {
    public static void main(String[] args) {
        Double[] elements = {1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01};
        Set<Double> setDeDoubles = new HashSet<>(Arrays.asList(elements));

        System.out.println("Éléments du HashSet :");
        for (Double element : setDeDoubles) {
            System.out.println(element);
        }

        Double maxElement = Collections.max(setDeDoubles);
        System.out.println("Le plus grand élément de la collection est : " + maxElement);
        Double minElement = Collections.min(setDeDoubles);
        setDeDoubles.remove(minElement);

        System.out.println("Éléments du HashSet après suppression du plus petit élément :");
        for (Double element : setDeDoubles) {
            System.out.println(element);
        }

    }
}
