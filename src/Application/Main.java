package Application;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or Company (i/c)? ");
            char tipo = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            Double anualInCome = sc.nextDouble();
            sc.nextLine();

            if(tipo == 'i'){
                System.out.print("Health Expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                sc.nextLine();

                list.add(new Individual(name, anualInCome, healthExpenditures));
            }else{
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                sc.nextLine();

                list.add(new Company(name, anualInCome, numberOfEmployees));
            }
        }

        System.out.println("TAXES PAID: ");

        for (TaxPayer i: list){
            System.out.println(i.getName() + ": $ " + i.tax());
        }

        sc.close();

    }

}
