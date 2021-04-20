package DesignPatternJava.Exercises.EmployeeSalary.controller;

import DesignPatternJava.Exercises.EmployeeSalary.model.CommisionEmployee;
import DesignPatternJava.Exercises.EmployeeSalary.model.Manager;
import DesignPatternJava.Exercises.EmployeeSalary.model.RegularEmployee;

public class Main {
    public static void main(String[] args) {
        Salary salary = new Salary();

        System.out.print("REGULAR EMPLOYEE SALARY: " );
        salary.salaryBaseAlgo = new RegularEmployee();
        salary.ComputeRegularSalary(250,8,20);


        System.out.print("COMMISION  EMPLOYEE SALARY: " );
        salary.salaryBaseAlgo = new CommisionEmployee();
        salary.ComputeRegularSalary(200,8,7);


        System.out.print("MANAGER EMPLOYEE SALARY: " );
        salary.salaryBaseAlgo = new Manager();
        salary.ComputeRegularSalary(500,8,20);

    }
}
