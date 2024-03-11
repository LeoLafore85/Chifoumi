package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {
        String[] paysArray = {"USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"};
        Set<String> pays = new HashSet<>(Arrays.asList(paysArray));

        String paysLePlusLong = "";
        for (String paysActuel : pays) {
            if (paysActuel.length() > paysLePlusLong.length()) {
                paysLePlusLong = paysActuel;
            }
        }

        pays.remove(paysLePlusLong);

        System.out.println("Contenu de la collection après suppression du pays avec le plus grand nombre de lettres :");
        for (String paysActuel : pays) {
            System.out.println(paysActuel);
        }
    }
}
