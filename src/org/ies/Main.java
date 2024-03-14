package org.ies;

import org.ies.components.reader.EmployeeReader;
import org.ies.components.reader.DepartamentReader;
import org.ies.components.reader.CompanyReader;
import org.ies.components.app.CompanyApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        EmployeeReader employeeReader = new EmployeeReader(scanner);
        DepartamentReader departamentReader = new DepartamentReader(scanner,employeeReader);
        CompanyReader companyReader = new CompanyReader(scanner,departamentReader);
        CompanyApp companyApp = new CompanyApp(scanner,companyReader);
        companyApp.run();
    }
}
