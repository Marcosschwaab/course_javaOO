import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Double a = 0.0;
        Double b = 0.0;
        Double c = 0.0;
        Double media = 0.0;
 
        for (int i=0; i<n; i++){
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            media = (a*2.0 + b*3.0 + c*5.0) / 10;
            
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}

