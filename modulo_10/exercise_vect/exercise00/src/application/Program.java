package application;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;

         System.out.println("Quantos números quer digitar?"); 
        int num = sc.nextInt();

        if ( num <= 10 ){
        n = num;
	        }
  
        else {
            System.out.println(" Numero deve ser menor ou igual a 10");   
        }

       int[] vect = new int[n];
            for (int i=0; i<n; i++){
                System.out.println("Digite um número?"); 
                vect[i] = sc.nextInt();
            }
            if (n > 0){
            System.out.println("NUMEROS NEGATIVOS:");}

            for (int i=0; i<n; i++) {
                if (vect[i] < 0) {
                    System.out.printf("%d\n", vect[i]);
                }
            }
    

        sc.close();
    }
}
