import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int unit = sc.nextInt();
        double price = sc.nextDouble();
        double total;

        total = price * unit;
        
        System.out.println("Codigo =" + cod);

        System.out.println("Quantidade =" + unit);

        System.out.println("Valor total =" + total);

        sc.close();
    }
}
