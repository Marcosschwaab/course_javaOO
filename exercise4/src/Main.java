import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite número de funcionarios ");
        int funcionarios = sc.nextInt();
        System.out.println("digite horas trabalhadas ");
        int horas = sc.nextInt();
        System.out.println("digite valor da hora ");
        double valorhora = sc.nextDouble();


        double salario = (horas * valorhora);
        System.out.println("NUMBER= " + funcionarios);
        System.out.printf("SALARY= %.2f ", salario);

        sc.close();

    }
}
