package com.example.payroll_calculator;

public class PayrollCalculator {
    private int taxPercentage;
    private double grossSalary;


    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double calculate_personal_wage_tax() {
        return taxPercentage * grossSalary / 100;
    }

    public double calculate_net_salary() {
        return (100 - taxPercentage) * grossSalary / 100;
    }

    public void printInfo() {
        System.out.println("Personal wage tax is " + calculate_personal_wage_tax() + "$");
        System.out.println("Net salary is " + calculate_net_salary() + "$");
    }
}
