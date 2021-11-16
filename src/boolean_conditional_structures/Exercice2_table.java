package boolean_conditional_structures;

import java.util.Scanner;

public class Exercice2_table {
    // salaires 🤑

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dans cette proposition de correction, j'utilise un tableau afin de rendre mon programme plus flexible
        // C'est un plus par rapport à l'énoncé

        // On ajoute un employe supplementaire
        String [] employees = {"A", "B", "C"}; // Noms des employés
        double [] salaries = new double[employees.length]; // Tableau des salaires de la même taille

        // On recupere l'ensemble des salaires
        for(int i=0; i < employees.length; i++) {
            System.out.print("Entrez le salaire de " + employees[i] + " : ");
            salaries[i] = sc.nextDouble();
        }

        // On fait nos calculs avec les tests sur les differences
        for(int i=0; i < salaries.length ; i++) {
            for(int j=0; j < salaries.length ; j++) {
                if (j==i) continue; // cette ligne permet de passer a l'iteration d'apres sans executer le reste du code de la boucle
                double difference = ((salaries[j] - salaries[i]) / salaries[i]) * 100;
                if (difference > 3) {
                    String mostPaid = employees[j];
                    String lessPaid = employees[i];
                    System.out.println("Attention, l'employé " + mostPaid + " gagne bien plus que l'employé " + lessPaid + " !");
                } else {
                    System.out.println("tout va bien");
                }
            }
        }

        sc.close();
    }
}
