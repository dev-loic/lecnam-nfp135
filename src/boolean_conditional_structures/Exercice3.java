package boolean_conditional_structures;

import java.util.Scanner;

public class Exercice3 {
    // e-shop 👘

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbTShirts = 0;
        double totalAmountWithoutShip = 0, totalAmount = 0;

        System.out.print("Combien de t-shirts souhaitez-vous commander ? ");
        nbTShirts = sc.nextInt();

        totalAmountWithoutShip = 5 * nbTShirts;

        if (totalAmountWithoutShip < 50) {
            totalAmount = totalAmountWithoutShip + 10;
        } else if (totalAmountWithoutShip < 100) {
            totalAmount = totalAmountWithoutShip;
        } else {
            totalAmount = totalAmountWithoutShip * 0.95;
        }

        System.out.println("Le total de la commande s'élève à " + totalAmount + " Euros");

        sc.close();
    }
}
