import java.util.Locale;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero:");
        double x = sc.nextDouble();

        System.out.println("Digite outro numero:");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Ponto de origem");
        } 
        else if (x == 0) {
            System.out.println("Eixo y");
        } 
        else if (y == 0) {
            System.out.println("eixo x");
        } 
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } 
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } 
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } 
        else {
            System.out.println("Q4");
        }
        sc.close();
    }
}