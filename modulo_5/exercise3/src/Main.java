import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero ");
        int num = sc.nextInt();
        System.out.println("digite o segundo numero ");
        int num2 = sc.nextInt();

        if (num % num2 == 0 || num2 % num == 0) {
            System.out.printf("MULTIPLOS");
        }
        else {
            System.out.printf("NAO SAO MULTIPLOS");
        }
        sc.close();
    }
}