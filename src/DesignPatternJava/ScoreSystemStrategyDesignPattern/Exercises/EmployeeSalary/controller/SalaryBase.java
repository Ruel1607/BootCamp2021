package DesignPatternJava.ScoreSystemStrategyDesignPattern.Exercises.EmployeeSalary.controller;

public abstract  class SalaryBase {
    public abstract double ComputeRegularSalary(double hourlyRate , double hours , double days);
}
