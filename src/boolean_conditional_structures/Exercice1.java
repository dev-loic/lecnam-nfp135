package boolean_conditional_structures;

import java.util.Scanner;

public class Exercice1 {
    // Login 🔓
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userName;
        String password;

        System.out.print("Entrez votre nom d'utilisateur : ");
        userName = sc.nextLine();

        System.out.print("Entrez votre mot de passe : ");
        password = sc.nextLine();

        if (userName.equals("administrateur") && password.equals("azerty123")) {
            System.out.println("Bienvenue administrateur");
        } else {
            System.out.println("pseudo ou mot de passe inconnu...");
        }

        sc.close();
    }
}
