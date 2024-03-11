package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVillePlusPeuplee {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        Ville villeLaPlusPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > villeLaPlusPeuplee.getNbHabitants()) {
                villeLaPlusPeuplee = ville;
            }
        }
        System.out.println("La ville la plus peuplée est : " + villeLaPlusPeuplee);


        Ville villeLaMoinsPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() < villeLaMoinsPeuplee.getNbHabitants()) {
                villeLaMoinsPeuplee = ville;
            }
        }
        villes.remove(villeLaMoinsPeuplee);
        System.out.println("Villes après suppression de la ville la moins peuplée :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }

        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        System.out.println("Villes après modification des noms de celles de plus de 100 000 habitants :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }

    }
}
