package org.ies.components.reader;

import org.ies.models.Company;
import org.ies.models.Departament;

import java.util.Scanner;

public class CompanyReader {
    private Scanner scanner;
    private DepartamentReader departamentReader;

    public CompanyReader(Scanner scanner, DepartamentReader departamentReader) {
        this.scanner = scanner;
        this.departamentReader = departamentReader;
    }
     public Company askCompany() {
         System.out.println("Introduce los datos de la empresa");
         System.out.println("Dame un nombre");
         String name = scanner.nextLine();
         System.out.println("Dame un cif");
         String cif = scanner.nextLine();

         System.out.println("¿Cuantos departamentos tiene la empresa ?");
         int repDepartament = scanner.nextInt();
         scanner.nextLine();

         Departament[] departament = new Departament[repDepartament];

         for (int i = 0; i < repDepartament; i++) {
             System.out.println("Dame un departamento");
             departament[i]= departamentReader.askDepartament();
         }

         return new Company(name,cif,departament);
     }
}

