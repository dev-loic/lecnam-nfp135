package arrays_iterative_structures_2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Notes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // On crée un NumberFormat pour arrondir tous les nombres à 2 chiffres après la virgule
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);

        // PARTIE 1 : initialisation
        int nbStudents = 0, nbNotes = 0;
        System.out.print("Combien d'étudiants ? ");
        nbStudents = sc.nextInt();
        System.out.print("Combien de notes ? ");
        nbNotes = sc.nextInt();

        int [][] notes = new int[nbStudents][nbNotes];
        for(int i=0; i<nbStudents; i++) {
            for(int j=0; j<nbNotes; j++) {
                notes[i][j] = -1;
            }
        }

        // PARTIE 2 : moyenne
        for (int i=0; i<nbStudents; i++) {
            System.out.println("** SAISIE DES NOTES DE L'ETUDIANT " + (i+1));
            double sum = 0;
            for (int j=0; j<nbNotes; j++) {
                System.out.print(String.format("**** Note %d : ", (j+1)));
                notes[i][j] = sc.nextInt();
                // A chaque ajout de note, on en profite pour additionner leur valeur
                // Ainsi le calcul de la moyenne pourra se faire directement apres la boucle
                sum += notes[i][j];
            }
            double moyenne = sum / nbNotes;
            // Rq : on utilise le numberFormat créé tout au début afin d'afficher la moyenne avec 2 chiffres après la virgule
            System.out.println("==> Moyenne : " + numberFormat.format(moyenne));
        }

        // PARTIE 3 : moyenne classe et moyenne la plus élevée
        // La partie 3 est en fait la partie 2 avec un peu plus de code afin de recupérer les différentes informations
        // Nous aurions pu créer un tableau de moyennes pour calculer les statistiques de la classe
        // Mais s'il n'est pas necessaire de sauvegarder des variables il vaut mieux l'éviter
        double moyenneMax = -1;
        double sumClasse = 0;
        for (int i=0; i<nbStudents; i++) {
            System.out.println("** SAISIE DES NOTES DE L'ETUDIANT " + (i+1));
            double sum = 0;
            for (int j=0; j<nbNotes; j++) {
                System.out.print(String.format("**** Note %d : ", (j+1)));
                notes[i][j] = sc.nextInt();
                // A chaque ajout de note, on en profite pour additionner leur valeur
                // Ainsi le calcul de la moyenne pourra se faire directement apres la boucle
                sum += notes[i][j];
            }
            double moyenne = sum / nbNotes;
            System.out.println("==> Moyenne : " + numberFormat.format(moyenne));
            // On profite de la boucle pour calculer la somme des moyennes
            // Et recuperer la note maximale
            sumClasse += moyenne;
            if (moyenneMax<moyenne) {
                moyenneMax = moyenne;
            }
        }
        System.out.println("** STATISTIQUES DE LA CLASSE");
        System.out.println("**** Moyenne = " + numberFormat.format(sumClasse / nbStudents));
        System.out.println("**** MoyenneMax = " + numberFormat.format(moyenneMax));

        sc.close();
    }
}
