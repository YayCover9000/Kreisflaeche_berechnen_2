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
        // intialied Double fläche
        double fläche = 0.0;

        if (radius > 0) {
            fläche = PI * radius;
            KreisflaecheBerechnen.ausgeben(fläche);
        }
        else {
            System.out.println("Eingabefehler");
            scanner.close();
        }
    }
    public static void ausgeben(double fläche) {
        System.out.println("Flaeche: " + fläche);
    }
}
