import java.lang.Math;
import java.util.Scanner;
public class KreisflaecheBerechnen {
    /* Fläche=π∗radius²
    π=3,14159
    */
    public static final double PI = Math.PI;


    public static void main(String [] args) {
        // Scanner initialised
        Scanner scanner = new Scanner(System.in);
        // Radius als Double einlesen
        double radius = scanner.nextDouble();
        // intialied Double flaeche
        double flaeche = 0.0;

        if (radius > 0) {
            flaeche = PI * radius * radius;
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
