Feature: Payroll Calculator


  Scenario Outline: Calculate the personal wage tax
    As a user
    I want to calculate the personal wage tax
    So then i would know my net salary
    Given the salary of the person is $salary "<salary>"
    And the tax percentage is $percentage % "<personal_wage_tax>"
    When user presses the Enter
    Then the personal wage tax should be returned as $personal_wage_tax "<salary> * <personal_wage_tax> / 100"
    And net salary should be $net_salary "<salary> - <salary> * <personal_wage_tax> / 100"

    Examples:
      | salary | personal_wage_tax |
      | 6000 | 13 |
