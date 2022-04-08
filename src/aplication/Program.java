package aplication;

import entities.BasePlusCommissionEmployee;
import entities.CommissionEmployee;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee e1 = new CommissionEmployee("Nattan", "Phillips", "8768219", 750.0, 0.7);
        Employee e2 = new BasePlusCommissionEmployee("Bob", "Antony", "9982372", 500.0, 0.5, 1000.0);

        System.out.println(e1);
        System.out.println(e2);

        sc.close();
    }
}
