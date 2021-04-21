package DesignPatternJava.ScoreSystemStrategyDesignPattern.Exercises.EmployeeSalary.controller;

public class Salary {
    public  SalaryBase salaryBaseAlgo;


    public void ComputeRegularSalary(double hourlyRate, double hours, double days) {
        System.out.println(salaryBaseAlgo.ComputeRegularSalary(hourlyRate,hours,days));
    }
}
