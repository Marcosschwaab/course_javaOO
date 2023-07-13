import java.util.Scanner;

public class App {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a hora inicial");
        int hourInit = sc.nextInt();

        System.out.println("Digite a hora final");
        int hourEnd = sc.nextInt();
        
        int hourTotal;

        if (hourInit < hourEnd){
            hourTotal = hourEnd - hourInit;
         }
        else {
            hourTotal = 24 - hourInit + hourEnd;
        }
        System.out.println("O JOGO DUROU " + hourTotal + " HORA(S)");
        sc.close();
    }
}
