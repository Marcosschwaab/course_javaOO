import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   
        
        System.out.println("Escolhe uma opção: (1)Alcool - (2) Gasolina - (3) Diesel - (4 Sair)");
        int num = sc.nextInt();
        int alcool = 0;
        int gasoline = 0;
        int diesel = 0;        


        while (num > 0 && num <= 3) {
            if (num == 1){
                alcool = alcool+1;
                System.out.printf("Alcool: %d%n", alcool);
                System.out.printf("Gasoline: %d%n", gasoline);
                System.out.printf("Diesel: %d%n", diesel);
                System.out.println("Escolhe uma opção: (1)Alcool - (2) Gasolina - (3) Diesel - (4 Sair)");
                num = sc.nextInt();  
            }
             else if (num == 2){
                gasoline = gasoline +1;
                System.out.printf("Alcool: %d%n", alcool);
                System.out.printf("Gasoline: %d%n", gasoline);
                System.out.printf("Diesel: %d%n", diesel);
                System.out.println("Escolhe uma opção: (1)Alcool - (2) Gasolina - (3) Diesel - (4 Sair)");
                num = sc.nextInt();  
            }
            else if (num == 3){
                diesel = diesel+1;
                System.out.printf("Alcool: %d%n", alcool);
                System.out.printf("Gasoline: %d%n", gasoline);
                System.out.printf("Diesel: %d%n", diesel);
                System.out.println("Escolhe uma opção: (1)Alcool - (2) Gasolina - (3) Diesel - (4 Sair)");
                num = sc.nextInt();  
            }
            }
        
        if (num == 4){
                System.out.printf("Muito Obrigado");
                System.out.printf("Alcool: %d%n", alcool);
                System.out.printf("Gasoline: %d%n", gasoline);
                System.out.printf("Diesel: %d%n", diesel);
        }
        else {
                System.out.println("Escolhe uma opção: (1)Alcool - (2) Gasolina - (3) Diesel - (4 Sair)");
                num = sc.nextInt();  
        }
        sc.close();
    }
}


