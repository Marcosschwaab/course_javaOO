import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite código da peça ");
        int cod1 = sc.nextInt();
        System.out.println("digite quantidade de peças ");
        int numpeca1= sc.nextInt();
        System.out.println("digite valor da peça ");
        double valorpeca1 = sc.nextDouble();

        System.out.println("digite código da segunda peça ");
        int cod2 = sc.nextInt();
        System.out.println("digite quantidade das segunda peças ");
        int numpeca2= sc.nextInt();
        System.out.println("digite valor da segunda peça ");
        double valorpeca2 = sc.nextDouble();


        double valor_total = (numpeca1 * valorpeca1 + numpeca2 * valorpeca2);

        System.out.printf("VALOR A PAGAR= %.2f ", valor_total);


        sc.close();

    }
}


