import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;
  
        for (int i=0; N > i; i++ ){
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);

        sc.close();
    }
}
