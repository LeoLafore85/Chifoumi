package sets;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetPays {
    public static void main(String[] args) {
        Set<Pays> ensembleDePays = new HashSet<>();

        ensembleDePays.add(new Pays("USA", 331002651, 59531.66));
        ensembleDePays.add(new Pays("France", 65273511, 40412.03));
        ensembleDePays.add(new Pays("Allemagne", 83783942, 46452.95));
        ensembleDePays.add(new Pays("UK", 67886011, 39753.24));
        ensembleDePays.add(new Pays("Italie", 60461826, 31952.98));
        ensembleDePays.add(new Pays("Japon", 126476461, 38428.10));
        ensembleDePays.add(new Pays("Chine", 1439323776, 9770.85));
        ensembleDePays.add(new Pays("Russie", 145934462, 11288.87));
        ensembleDePays.add(new Pays("Inde", 1380004385, 2104.15));

        for (Pays pays : ensembleDePays) {
            System.out.println("Pays : " + pays.nom + ", Habitants : " + pays.nbHabitants + ", PIB/Hab : " + pays.pibParHabitant);
        }

        Pays paysAvecLePlusHautPIBParHabitant = null;
        for (Pays pays : ensembleDePays) {
            if (paysAvecLePlusHautPIBParHabitant == null || pays.pibParHabitant > paysAvecLePlusHautPIBParHabitant.pibParHabitant) {
                paysAvecLePlusHautPIBParHabitant = pays;
            }
        }

        System.out.println("Le pays avec le PIB/habitant le plus important est : " + paysAvecLePlusHautPIBParHabitant.nom + " avec un PIB/habitant de " + paysAvecLePlusHautPIBParHabitant.pibParHabitant);

        Pays paysAvecLePlusHautPIBTotal = null;
        double pibTotalLePlusHaut = 0;
        for (Pays pays : ensembleDePays) {
            double pibTotalDuPays = pays.nbHabitants * pays.pibParHabitant;
            if (paysAvecLePlusHautPIBTotal == null || pibTotalDuPays > pibTotalLePlusHaut) {
                paysAvecLePlusHautPIBTotal = pays;
                pibTotalLePlusHaut = pibTotalDuPays;
            }
        }

        System.out.println("Le pays avec le PIB total le plus important est : " + paysAvecLePlusHautPIBTotal.nom + " avec un PIB total de " + pibTotalLePlusHaut);

        Pays paysAvecLePlusPetitPIBTotal = null;
        double pibTotalLePlusPetit = Double.MAX_VALUE;
        for (Pays pays : ensembleDePays) {
            double pibTotalDuPays = pays.nbHabitants * pays.pibParHabitant;
            if (pibTotalDuPays < pibTotalLePlusPetit) {
                paysAvecLePlusPetitPIBTotal = pays;
                pibTotalLePlusPetit = pibTotalDuPays;
            }
        }

        if (paysAvecLePlusPetitPIBTotal != null) {
            ensembleDePays.remove(paysAvecLePlusPetitPIBTotal);
        }

        System.out.println("Contenu du HashSet après suppression du pays avec le PIB total le plus petit :");
        for (Pays pays : ensembleDePays) {
            System.out.println(pays.nom + " - " + (pays.nbHabitants * pays.pibParHabitant));
        }

        System.out.println("Contenu du HashSet après modification :");
        for (Pays pays : ensembleDePays) {
            double pibTotal = pays.nbHabitants * pays.pibParHabitant;
            System.out.println("Nom : " + pays.nom + ", Habitants : " + pays.nbHabitants + ", PIB total : " + pibTotal);
        }
    }
}


