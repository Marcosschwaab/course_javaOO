import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; n >= i; i++){
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

