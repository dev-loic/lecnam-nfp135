package arrays_iterative_structures_1;

import java.util.Scanner;

// Version 2.0 : on optimise les performances en ne perdant aucune notion fonctionnelle

public class Exercice3Ameliore {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Recuperation du nb de lignes de mon triangle
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

        long debut = System.currentTimeMillis();

        // Cette fois-ci on construit la ligne au debut et on la modifie a chaque fois, plus que de la recreer
        // Essayer avec un grand nombre de ligne et vous verrez que la difference entre les 2 algorithmes est importante
        String spaces = "";
        String stars = "*";
        for(int i=1; i<=nbOfLines-1; i++) {
            spaces = spaces + " ";
        }
        for (int i=1; i<=nbOfLines; i++) {
            System.out.println(spaces+stars);
            if(spaces.length()!=0) {
                spaces = spaces.substring(1);
            }
            stars = stars + "**";
        }
        // Temps d'execution : on a fini, on peut prendre notre point d'arrivée
        // Et afficher le résultat.
        System.out.print("Temps d'execution : ");
        System.out.println(System.currentTimeMillis()-debut);

        sc.close();
    }
}
