import java.lang.Math;
import java.util.Scanner;
public class KreisflaecheBerechnen {
    /* Fläche=π∗radius²
    π=3,14159
    */
    static final double PI = Math.PI;


    public static void main(String [] args) {
        // Scanner initialised
        Scanner scanner = new Scanner(System.in);
        // Radius als Double einlesen
        double radius = scanner.nextDouble();
        // Radius quadratieren und in Variable speichern
        double radiusPow = Math.pow(radius, 2);
        // intialied Double flaeche
        double flaeche = 0.0;

        if (radius > 0) {
            flaeche = PI * radiusPow;
            KreisflaecheBerechnen.ausgeben(flaeche);
        }
        else {
            System.out.println("Eingabefehler");
            scanner.close();
        }
        scanner.close();
    }

    public static void ausgeben(double flaeche) {
        System.out.println("Flaeche: " + flaeche);
    }
}
