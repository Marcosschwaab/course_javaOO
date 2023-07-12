
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero ");
        int num = sc.nextInt();

        if ( num % 2 == 0 ) {

            System.out.printf("PAR");

        }
        else {
            System.out.printf("IMPAR");
        }
        sc.close();
    }
}