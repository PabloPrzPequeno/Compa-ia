package org.ies.models;

import java.util.Arrays;
import java.util.Objects;

public class Company {
    private String name;
    private String cif;
    private Departament[] departament;

    public Company(String name, String cif, Departament[] departament) {
        this.name = name;
        this.cif = cif;
        this.departament = departament;
    }
    public void findDepartament(String name) {
        boolean verdad = false;
        for (Departament departament: departament) {
            if (departament.getName().equals(name)){
                verdad = true;
                departament.info();
            }
        }
        if (verdad == false) {
            System.out.println("No existe el departamento");
        }
    }

    public void findEmployee(String name) {
        boolean verdad = false;
        for (Departament departament: departament) {
            if (departament.getName().equals(name)){
                verdad = true;
            departament.infoEmployee();
            }
        }
    if (verdad == false) {
        System.out.println("No existe el departamento");
    }
    }
    public void showEmployeeDepartament(String nif,String name) {
       boolean nif1 = false;
       boolean  name1 = false;
        for (Departament departament: departament) {
            if(departament.getName().equals(name)) {
                name1 = true;
                for (Employee employee: departament.getEmployee()) {
                    if (employee.getNif().equals(nif)){
                    nif1 = true;
                        employee.info();
                    }
                }
                if(nif1 == false){
                    System.out.println("No se encuentra el empleado");
                }
            }
        }
        if (name1 == false){
            System.out.println("No existe el departamento");
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Departament[] getDepartament() {
        return departament;
    }

    public void setDepartament(Departament[] departament) {
        this.departament = departament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(cif, company.cif) && Arrays.equals(departament, company.departament);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, cif);
        result = 31 * result + Arrays.hashCode(departament);
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", departament=" + Arrays.toString(departament) +
                '}';
    }
}
