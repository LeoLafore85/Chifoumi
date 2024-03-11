package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        List<String> villes = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        String villeLaPlusLongue = "";
        for (String ville : villes) {
            if (ville.length() > villeLaPlusLongue.length()) {
                villeLaPlusLongue = ville;
            }
        }

        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }

        Iterator<String> iterator = villes.iterator();
        while (iterator.hasNext()) {
            String ville = iterator.next();
            if (ville.startsWith("N")) {
                iterator.remove();
            }
        }

        System.out.println("Villes en majuscules : " + villes);
        System.out.println("La ville avec le plus grand nombre de lettres est : " + villeLaPlusLongue);
        System.out.println("Villes après suppression des noms commençant par 'N' : " + villes);

    }
}
