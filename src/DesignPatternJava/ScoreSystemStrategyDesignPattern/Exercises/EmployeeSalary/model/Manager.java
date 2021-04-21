package DesignPatternJava.ScoreSystemStrategyDesignPattern.Exercises.EmployeeSalary.model;

import DesignPatternJava.ScoreSystemStrategyDesignPattern.Exercises.EmployeeSalary.controller.SalaryBase;

public class Manager extends SalaryBase {
    @Override
    public double ComputeRegularSalary(double hourlyRate, double hours, double days) {
       double total = (hours * hourlyRate) * days ;
        return total;
    }
}
