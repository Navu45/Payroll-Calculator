package com.test.payroll_calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @Given("^the tax percentage is \\$percentage % \"(.*)\"$")
    public void theTaxPercentageIsPercentage(String percentage) {
        actionwords.theTaxPercentageIsPercentage(percentage);
    }

    @When("^user presses the Enter$")
    public void userPressesTheEnter() {
        actionwords.userPressesTheEnter();
    }

    @Then("^the personal wage tax should be returned as \\$personal_wage_tax \"(.*)\"$")
    public void thePersonalWageTaxShouldBeReturnedAsPersonalWageTax(String personalWageTax) {
        actionwords.thePersonalWageTaxShouldBeReturnedAsPersonalWageTax(personalWageTax);
    }

    @Then("^net salary should be \\$net_salary \"(.*)\"$")
    public void netSalaryShouldBeNetSalary(String netSalary) {
        actionwords.netSalaryShouldBeNetSalary(netSalary);
    }

    @Given("^the salary of the person is \\$salary \"(.*)\"$")
    public void theSalaryOfThePersonIsSalary(String salary) {
        actionwords.theSalaryOfThePersonIsSalary(salary);
    }
}