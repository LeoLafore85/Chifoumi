package fr.sdv.b2324;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        /*Livre livre = em.find(Livre.class, 5);   //Modification du titre du livre avec Id = 5

        if (livre != null) {
            livre.setTitre("Du plaisir dans la cuisine");

        } else {
            System.out.println("Aucun livre trouvé avec l'ID 5");
        }*/


/*
        String titreRecherche = "Vingt mille lieues sous les mers";     // Requete JPQL pour livre en fonction du titre

        TypedQuery<Livre> query = em.createQuery("SELECT l FROM Livre l WHERE l.titre = :titre", Livre.class);
        query.setParameter("titre", titreRecherche);

        Livre livre = query.getSingleResult();

        System.out.println("Titre: " + livre.getTitre());
        System.out.println("Auteur: " + livre.getAuteur());

 */
/*
        String auteurRecherche = "Jules Verne";     // Requete JPQL pour livre en fonction de l'auteur

        TypedQuery<Livre> query = em.createQuery("SELECT l FROM Livre l WHERE l.auteur = :auteur", Livre.class);
        query.setParameter("auteur", auteurRecherche);

        Livre livre = query.getSingleResult();

        System.out.println("Titre: " + livre.getTitre());
        System.out.println("Auteur: " + livre.getAuteur());
*/
/*
        Livre livre = em.find(Livre.class, 2);

        if (livre != null) {
            em.remove(livre);
            System.out.println("Le livre avec l'ID 2 a été supprimé.");
        } else {
            System.out.println("Aucun livre trouvé avec l'ID 2.");
        }

 */
        em.createQuery("SELECT l FROM Livre l", Livre.class)
                .getResultList()
                .forEach(livre -> System.out.println("Titre: " + livre.getTitre() + ", Auteur: " + livre.getAuteur()));

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
