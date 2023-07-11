import java.util.Locale;

public class Main {
    public static void main(String[] args){
        int y = 32;
        String nome = "Maria";
        int idade = 21;
        double x = 10.56540;
        System.out.println("Hello World!");
        System.out.println(y);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        System.out.printf("RESULTADO %.2f METROS%n", x);
        System.out.printf("%s tem %d idade e ganha R$ %.2f", nome, idade, x);
    }
}

