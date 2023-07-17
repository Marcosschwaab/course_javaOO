import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  

        for (int i = 0; i<n; i++){
            int a = sc.nextInt();  
            int b = sc.nextInt();
             
            if( a == 0 ){
                System.out.printf("divisão impossivel");
            }
            else {
                Double div = (double) a / b;
                System.out.printf("%.1f%n", div);
            }      
        }
        sc.close();
    }
}