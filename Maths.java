public class Maths {

    // Méthode pour additionner deux nombres
    public static int additionner(int a, int b) {
        return a + b;
    }

    // Méthode pour soustraire deux nombres
    public static int soustraire(int a, int b) {
        return a - b;
    }

    // Méthode pour multiplier deux nombres
    public static int multiplier(int a, int b) {
        return a * b;
    }

    // Méthode pour diviser deux nombres
    public static double diviser(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Le diviseur ne peut pas être zéro.");
        }
        return a / b;
    }

    // Méthode pour calculer le carré d'un nombre
    public static int carre(int a) {
        return a * a;
    }

    // Méthode pour calculer la surface d'un carré ou d'un rectangle
    public static int calculerSurface(int longueur, int largeur) {
        return longueur * largeur;
    }

    // Méthode pour calculer le volume d'un cube ou d'un prisme rectangulaire
    public static int calculerVolume(int longueur, int largeur, int hauteur) {
        return longueur * largeur * hauteur;
    }
}
