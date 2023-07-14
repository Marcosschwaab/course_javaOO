import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   
        
        System.out.println("Digite a senha:");
        int num = sc.nextInt();

        int senha = 2002;

        while (num != senha) {
            System.out.println("Senha incorreta, tente novamente!");
            System.out.println("Digite a senha:");
            num = sc.nextInt();  
        }
        System.out.println("Acesso Permitido");


        sc.close();
    }
}
