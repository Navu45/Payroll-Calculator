package com.test.payroll_calculator;

import com.example.payroll_calculator.PayrollCalculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {

    private final PayrollCalculator calculator = new PayrollCalculator();


    @Given("the gross salary of the person is {int}")
    public void theGrossSalaryOfThePersonIs(int gross_salary) {
        calculator.setGrossSalary(gross_salary);
    }

    @And("the tax percentage is {int}")
    public void theTaxPercentageIsTax_percentage(int tax_percentage) {
        calculator.setTaxPercentage(tax_percentage);
    }

    @When("^user presses the Enter$")
    public void userPressesTheEnter() {
        calculator.printInfo();
    }

    @Then("the personal wage tax should be returned as {double}")
    public void thePersonalWageTaxShouldBeReturnedAsPersonal_wage_tax(double personal_wage_tax) {
        assertEquals(personal_wage_tax, calculator.calculate_personal_wage_tax(), 1e-15);
    }

    @And("net salary should be {double}")
    public void netSalaryShouldBeNet_salary(double net_salary) {
        assertEquals(net_salary, calculator.calculate_net_salary(), 1e-15);
    }

}