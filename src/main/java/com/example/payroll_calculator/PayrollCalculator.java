package com.example.payroll_calculator;

public class PayrollCalculator {
    private int tax_percentage;
    private double salary;

    public int getTax_percentage() {
        return tax_percentage;
    }

    public void setTax_percentage(int tax_percentage) {
        this.tax_percentage = tax_percentage;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public PayrollCalculator(int tax_percentage, double salary) {
        this.tax_percentage = tax_percentage;
        this.salary = salary;
    }

    public double calculate_personal_wage_tax() {
        return tax_percentage * salary / 100;
    }
}
