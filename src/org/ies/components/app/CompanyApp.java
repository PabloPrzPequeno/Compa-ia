package org.ies.components.app;

import org.ies.components.reader.CompanyReader;
import org.ies.models.Company;

import java.util.Scanner;

public class CompanyApp {
    private Scanner scanner;
    private CompanyReader companyReader;

    public CompanyApp(Scanner scanner, CompanyReader companyReader) {
        this.scanner = scanner;
        this.companyReader = companyReader;
    }
    public void run() {
        Company company = companyReader.askCompany();
        int option;
        do {
            option=chooseOption();
            switch (option) {
                case 1:
                    System.out.println("Dame el nombre del departamento");
                    String name = scanner.nextLine();
                    company.findDepartament(name);
                    break;
                case 2:
                    System.out.println("Dame el nombre del departamento");
                    String name1 = scanner.nextLine();
                   company.findEmployee(name1);
                   break;
                case 3:
                    System.out.println("Introduce el NIF del empleado");
                    String nif = scanner.nextLine();
                    System.out.println("Introduce el nombre del departamento");
                    String name2 = scanner.nextLine();
                    company.showEmployeeDepartament(nif,name2);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Numero incorrecto");
            }
        }

        while (option != 4);


    }//esto es una prueba

    private int chooseOption() {
        System.out.println("1. Muestra los datos del departamento");
        System.out.println("2. Muestra los empleados de un departamento");
        System.out.println("3. Muestra los datos del empleado");
        System.out.println("4. Salir");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

}
