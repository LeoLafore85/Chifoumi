import java.util.Scanner;
import java.util.Random;

public class Chifoumi {
    private Scanner scanner;
    private Random random;
    private String nomJoueur;
    private final String[] choices = {"pierre", "papier", "ciseaux"};

    public Chifoumi() {
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void commencer() {
        System.out.println("Entrez votre nom : ");
        nomJoueur = scanner.nextLine();

        System.out.println("Bonjour " + nomJoueur + "! Prêt pour jouer contre le BOT? C'est parti!");

        int ScoreJoueur = 0, ScoreBOT = 0;

        for (int tour = 1; tour <= 5 && ScoreJoueur < 3 && ScoreBOT < 3; tour++) {
            System.out.println("\nTour " + tour + ": Choisissez pierre, papier ou ciseaux.");
            String choixJoueur = scanner.nextLine().toLowerCase();

            String choixBOT = choices[random.nextInt(choices.length)];
            System.out.println("BOT a choisi : " + choixBOT);

            if (choixJoueur.equals(choixBOT)) {
                System.out.println("Égalité pour ce tour!");
            } else if (joueurGagne(choixJoueur, choixBOT)) {
                System.out.println(nomJoueur + " gagne le tour!");
                ScoreJoueur++;
            } else {
                System.out.println("BOT gagne le tour!");
                ScoreBOT++;
            }

            System.out.println("Score actuel - " + nomJoueur + ": " + ScoreJoueur + " | BOT: " + ScoreBOT);
        }

        if (ScoreJoueur > ScoreBOT) {
            System.out.println("\nFélicitations " + nomJoueur + ", vous avez gagné la partie!");
        } else if (ScoreBOT > ScoreJoueur) {
            System.out.println("\nDommage! Le BOT a gagné la partie. Essayez encore!");
        } else {
            System.out.println("\nLa partie se termine par une égalité. Bien joué!");
        }
    }

    private boolean joueurGagne(String choixJoueur, String choixBOT) {
        return (choixJoueur.equals("pierre") && choixBOT.equals("ciseaux")) ||
                (choixJoueur.equals("papier") && choixBOT.equals("pierre")) ||
                (choixJoueur.equals("ciseaux") && choixBOT.equals("papier"));
    }
}
