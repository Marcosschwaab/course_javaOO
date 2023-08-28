package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter the employee name:");
        employee.name = sc.nextLine();
        System.out.println("Enter the employee Gross Salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Enter the Tax:");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.println("Wich percentage to increase salary:");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data: " + employee);

        sc.close();
    }
}
