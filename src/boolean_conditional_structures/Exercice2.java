package boolean_conditional_structures;

import java.util.Scanner;

public class Exercice2 {
    // salaires 🤑

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] employees = {"A", "B"};
        double [] salaries = new double[employees.length];

        for(int i=0; i < employees.length; i++) {
            System.out.print("Entrez le salaire de " + employees[i] + " : ");
            salaries[i] = sc.nextDouble();
        }

        for(int i=0; i < salaries.length ; i++) {
            for(int j=i+1; j < salaries.length ; j++) {
                double difference = ((salaries[i] - salaries[j]) / salaries[i]) * 100;
                if (Math.abs(difference) > 3) {
                    String mostPaid = difference > 3 ? employees[i] : employees[j];
                    String lessPaid = difference > 3 ? employees[j] : employees[i];
                    System.out.println("Attention, l'employé " + mostPaid + " gagne bien plus que l'employé " + lessPaid + " !");
                } else {
                    System.out.println("tout va bien");
                }
            }
        }

        sc.close();
    }
}
