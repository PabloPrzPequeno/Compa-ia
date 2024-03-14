package org.ies.components.reader;

import org.ies.models.Employee;

import java.util.Scanner;

public class EmployeeReader {
    private Scanner scanner;

    public EmployeeReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Employee askEmployee(){
        System.out.println("Introduce los datos del trabajador");
        System.out.println("Dame un nif");
        String nif = scanner.next();
        System.out.println("Dame un nombre");
        String name = scanner.next();
        System.out.println("Dame un apellido");
        String surname = scanner.next();
        System.out.println("Dime su puesto de trabajo");
        String position = scanner.next();

        Employee employee = new Employee(nif,name,surname,position);
        return employee;
    }
}

