import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; n >= i; i++){
            if (n > 0){
                int quad = i * i;
                int cubo = i * i * i;
                System.out.printf("%d %d %d%n", i, quad, cubo);
            }
        }

        sc.close();
    }
}
