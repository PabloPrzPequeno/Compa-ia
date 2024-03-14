package org.ies.components.reader;

import org.ies.models.Departament;
import org.ies.models.Employee;

import java.util.Scanner;

public class DepartamentReader {
    private Scanner scanner;
    private EmployeeReader employeeReader;

    public DepartamentReader(Scanner scanner, EmployeeReader employeeReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
    }

    public Departament askDepartament() {
        System.out.println("Introduce los datos de un departamento:");
        System.out.println("Dame un nombre");
        String name = scanner.next();
        System.out.println("Dime el presupuesto");
        int budget = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Cuantos empleados tiene la empresa ?");
        int repEmployees = scanner.nextInt();
        scanner.nextLine();

        Employee[] employee = new Employee[repEmployees];

        for (int i = 0; i < repEmployees; i++) {
            System.out.println("Dame un empleado");
            employee[i]= employeeReader.askEmployee();
        }

        return new Departament(name,budget,employee);

    }
    }

