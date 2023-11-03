package application;
import java.util.Locale;
import java.util.Scanner;

import entities.People;


public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sumHeight = 0;
        int under16 = 0;
        double avgHeight = 0;
        String namesUnder16 = "";


        System.out.println("Digite o número de pessoas: ");
        int n = sc.nextInt();

        People[] vect = new People[n];

        for (int i=0; i<n; i++){
            sc.nextLine();
            System.out.println("Insira os dados da "+ i +"° pessoa." );
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            People people = new People(name, age, height);
            sumHeight += people.getHeight();

            if (age < 16) {
                under16++;
                if (namesUnder16.isEmpty()) {
                    namesUnder16 = people.getName();
                } else {
                    namesUnder16 += ", " + people.getName();
                }
            }

            avgHeight  = sumHeight / i;
        }

        double percentLessThan16 = ((double) under16 / n) * 100;

        System.out.println("Altura média das pessoas: " + avgHeight );
        System.out.println("Porcentagem de pessoas com menos de 16 anos: " + percentLessThan16 + "%");
        
        if (under16 > 0) {
            System.out.println("Nomes das pessoas com menos de 16 anos: " + namesUnder16);
        }


        sc.close();
    }
}
