package boolean_conditional_structures;

import java.util.Scanner;

public class Exercice2 {
    // salaires 🤑

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salaryA = 0, salaryB = 0;

        // On recupere les 2 salaires
        System.out.print("Entrez le salaire de A : ");
        salaryA = sc.nextDouble();

        System.out.print("Entrez le salaire de B : ");
        salaryB = sc.nextDouble();

        // On calcule les differences relatives
        double differenceA = ((salaryB - salaryA) / salaryA) * 100;
        double differenceB = ((salaryA - salaryB) / salaryB) * 100;

        // On teste les valeurs de ces differences pour savoir si A ou B gagne plus de 3% que l'autre
        if (differenceA > 3) {
            System.out.println("B gagne beaucoup plus que A");
        } else if (differenceB > 3) {
            System.out.println("A gagne beaucoup plus que B");
        } else {
            System.out.println("C'est ok");
        }

        sc.close();
    }
}
