package arrays_iterative_structures_1;

import java.util.Scanner;

public class Exercice1 {

    public static void main(String[] args) {

        // Initialisation des variables
        Scanner sc = new Scanner(System.in);
        int nbUser = 0, result = 0;
        boolean isCorrect = false;

        // Recuperation de l'entier de la table avec verification de la valeur
        do {
            System.out.print("Saisissez l'entier de la table : ");
            nbUser = sc.nextInt();

            if (nbUser < 1 || nbUser > 9) {
                System.out.println("Veuillez saisir un entier compris entre 1 et 9.");
                continue; // on recommence la boucle while
            } else {
                isCorrect = true;
            }
            // rq : comme on a un continue qui recommence la boucle, dans ce cas précis,
            // le "else" n'est pas nécessaire. En effet on passera jamais dans le code qui
            // suit le "if (nbUser<1 || nbUser>9)" si l'entier n'est pas correct.
        } while (!isCorrect);

        // Affichage de la table
        System.out.println("Table de multiplication de " + nbUser);
        for (int i = 1; i <= 9; i++) {
            result = i * nbUser;
            System.out.println(String.format("%d x %d = %d", i, nbUser, result));
            // rq : sur la ligne precedente on utilise un formatted string.
            // Ces chaines de caracteres parametrisables sont tres frequemment utilisees dans les interfaces par exemple.
        }
        sc.close();
    }
}
