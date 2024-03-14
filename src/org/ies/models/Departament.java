package org.ies.models;

import java.util.Arrays;
import java.util.Objects;

public class Departament {
    private String name;
    private double budget;
    private Employee[] employee;

    public Departament(String name, double budget, Employee[] employee) {
        this.name = name;
        this.budget = budget;
        this.employee = employee;
    }

    public void info() {
        System.out.println(this.toString());
    }
    public void infoEmployee() {
        for (Employee employee:employee) {
            System.out.println(employee.toString());

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departament that = (Departament) o;
        return budget == that.budget && Objects.equals(name, that.name) && Arrays.equals(employee, that.employee);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, budget);
        result = 31 * result + Arrays.hashCode(employee);
        return result;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", employees=" + Arrays.toString(employee) +
                '}';
    }
}


