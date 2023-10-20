import java.util.Scanner;
import java.util.InputMismatchException;

public class CalcConsole {
    
    public static void main(String[] args) {
        String choix;
        Scanner scan = new Scanner(System.in);

        while (true) {
            String menu = "***************************************************************\n"
                    + "*                      CalcConsole 0.0.1                      *\n"
                    + "***************************************************************\n"
                    + "* Pour effectuer une addition -> tapez 'a'                    *\n"
                    + "* Pour effectuer une soustraction -> tapez 's'                *\n"
                    + "* Pour effectuer une multiplication -> tapez 'm'              *\n"
                    + "* Pour effectuer une division -> tapez 'd'                    *\n"
                    + "* Pour calculer un carre -> tapez 'c'                         *\n"
                    + "* Pour calculer une surface (carre/rectangle) -> tapez '2'    *\n"
                    + "* Pour calculer un volume (carre/rectangle) -> tapez '3'      *\n"
                    + "* Pour quitter l'application -> tapez 'q'                     *\n"
                    + "***************************************************************\n"
                    + "Entrez votre choix : ";

            System.out.print(menu);

            choix = scan.nextLine(); // Récupérer le choix de l'utilisateur

            int num1 = 0, num2 = 0, num3 = 0;
            double resultat = 0;

            if (choix.equals("a")) {
                System.out.println("Vous avez choisi l'addition !");
                System.out.print("Entrez le premier nombre : ");
                num1 = getValidInt(scan);
                scan.nextLine(); // consommer la nouvelle ligne restante ce qui veut dire que la prochaine entrée
                                 // sera vide

                System.out.print("Entrez le second nombre : ");
                num2 = getValidInt(scan);
                scan.nextLine();

                resultat = Maths.additionner(num1, num2);
                System.out.println("Le résultat de l'addition est : " + resultat);
            } else if (choix.equalsIgnoreCase("s")) {
                System.out.println("Vous avez choisi la soustraction !");
                System.out.print("Entrez le premier nombre : ");
                num1 = getValidInt(scan);
                scan.nextLine();

                System.out.print("Entrez le second nombre : ");
                num2 = getValidInt(scan);
                scan.nextLine();

                resultat = Maths.soustraire(num1, num2);
                System.out.println("Le résultat de la soustraction est : " + resultat);
            } else if (choix.equalsIgnoreCase("m")) {
                System.out.println("Vous avez choisi la multiplication !");
                System.out.print("Entrez le premier nombre : ");
                num1 = getValidInt(scan);
                scan.nextLine();

                System.out.print("Entrez le second nombre p: ");
                num2 = getValidInt(scan);
                scan.nextLine();

                resultat = Maths.multiplier(num1, num2);
                System.out.println("Le résultat de la multiplication est : " + resultat);
            } else if (choix.equalsIgnoreCase("d")) {
                System.out.println("Vous avez choisi la division !");
                System.out.print("Entrez le premier nombre : ");
                num1 = getValidInt(scan);
                scan.nextLine();

                System.out.print("Entrez le second nombre : ");
                num2 = getValidInt(scan);
                scan.nextLine();

                if (num2 == 0) {
                    System.out.println("Erreur : division par zéro !");
                } else {
                    resultat = Maths.diviser(num1, num2);
                    System.out.println("Le résultat de la division est : " + resultat);
                }
            } else if (choix.equalsIgnoreCase("c")) {
                System.out.println("Vous avez choisi de calculer un carré !");
                System.out.print("Entrez le nombre : ");
                num1 = getValidInt(scan);
                scan.nextLine();

                resultat = Maths.carre(num1);
                System.out.println("Le carré de " + num1 + " est : " + resultat);
            } else if (choix.equalsIgnoreCase("2")) {
                System.out.println("Vous avez choisi de calculer une surface !");
                System.out.print("Entrez la longueur : ");
                num1 = getValidInt(scan);
                scan.nextLine();

                System.out.print("Entrez la largeur : ");
                num2 = getValidInt(scan);
                scan.nextLine();

                resultat = Maths.calculerSurface(num1, num2);
                System.out.println("La surface est : " + resultat);
            } else if (choix.equalsIgnoreCase("3")) {
                System.out.println("Vous avez choisi de calculer un volume waaa !");
                System.out.print("Entrez la longueur : ");
                num1 = getValidInt(scan);
                scan.nextLine();

                System.out.print("Entrez la largeur : ");
                num2 = getValidInt(scan);
                scan.nextLine();

                System.out.print("Entrez la hauteur : ");
                num3 = getValidInt(scan);
                scan.nextLine();

                resultat = Maths.calculerVolume(num1, num2, num3);
                System.out.println("Le volume est : " + resultat);
            } else if (choix.equalsIgnoreCase("q")) {
                break; // sortir de la boucle while si l'utilisateur veut quitter
            }

            // Demander à l'utilisateur s'il veut continuer
            System.out.println("Souhaitez-vous effectuer un autre calcul ? (O pour oui, N pour non, --> peu etre ? )");
            String continuer = scan.nextLine();

            if (continuer.equalsIgnoreCase("n")) {
                break; // sortir de la boucle while si l'utilisateur ne veut pas continuer
            }
        }

        // Fermez le scanner
        scan.close();
        System.out.println("\n\nMerci pour votre visite sur CalcConsole 0.0.1 !\n\n");
    }

    /**
     * Récupère un entier (int) valide de l'utilisateur. Si l'entrée est invalide, un message est affiché et l'utilisateur 
     * est invité à fournir une nouvelle entrée jusqu'à ce qu'un entier valide soit fourni.
     *
     * @param scanner L'objet Scanner utilisé pour lire l'entrée de l'utilisateur.
     * @return Un entier (int) valide saisi par l'utilisateur.
     */
    public static int getValidInt(Scanner scanner) {
        int num = 0;
        while (true) {
            try {
                num = scanner.nextInt();
                break; // sortir de la boucle while si l'entrée est valide
            } catch (InputMismatchException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
                scanner.next(); // consommer la nouvelle ligne restante
            }
        }
        return num;
    }

}
