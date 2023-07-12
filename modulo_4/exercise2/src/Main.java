import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            double py = 3.14159;
            double x = sc.nextDouble();

            double raio = (x * 2) * py;

            System.out.printf("A: %.4f", raio);

    sc.close();

    }
}




