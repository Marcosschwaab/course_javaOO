import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();
        double tax;

        if( num <= 2000.00){
            System.out.println("Isento");
        }
        else if(num >= 2000.01 && num <= 3000.00){
            tax = (num - 2000.00)* 0.08;
            System.out.printf("R$ %.2f%n", tax);
        }
        else if(num >= 3000.01 && num <= 4500.00){
            tax = (num - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", tax);
        }
        else if(num >= 4500.01){
            tax = (num - 4500.00) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f%n", tax);
        }

        sc.close();
    }
}
