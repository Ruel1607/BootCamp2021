package DesignPatternJava.Exercises.EmployeeSalary.model;

import DesignPatternJava.Exercises.EmployeeSalary.controller.SalaryBase;

public class RegularEmployee extends SalaryBase {
    @Override
    public double ComputeRegularSalary(double hourlyRate, double hours, double days) {
     double total = (hours * hourlyRate) * days ;
        return total;
    }
}
