package arrays_iterative_structures_1;

import java.util.Scanner;

public class Exercice3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Recuperation du nb de lignes de mon triangle avec test de la valeur
        int nbOfLines = 0;
        boolean correct = false;
        while(!correct) {
            System.out.print("Saisissez un nombre de lignes : ");
            nbOfLines = sc.nextInt();
            if (nbOfLines > 0) {
                correct = true;
            } else {
                System.out.println("ERREUR : nombre de lignes incorrect");
            }
        }

        // Variable utilisee pour chronometrer le temps d'execution de l'algo
        // Pas necessaire pour l'exercice mais permet de comparer cette correction
        // Et la correction "Exercice3Ameliore"
        long debut = System.currentTimeMillis();

        // Dans cette boucle for, on construit a chaque iteration la ligne en entier
        for(int i=1; i<=nbOfLines; i++) {
            String line = "";
            for (int j=1; j<=nbOfLines-i; j++) {
                line = line + " ";
            }
            for (int j=1; j<=2*i-1; j++) {
                line = line + "*";
            }
            System.out.println(line);
        }

        // Temps d'execution : on a fini, on peut prendre notre point d'arrivée
        // Et afficher le résultat.
        System.out.print("Temps d'execution : ");
        System.out.println(System.currentTimeMillis()-debut);

        sc.close();
    }
}
