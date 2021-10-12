Feature: Payroll Calculator
  As a user
  I want to calculate the personal wage tax
  So then i would know my net salary

  Scenario: Calculate the personal wage tax (1)
    Given the gross salary of the person is 2000
    And the tax percentage is 13
    When user presses the Enter
    And the personal wage tax should be returned as 260
    And net salary should be 1740

  Scenario Outline: Calculate the personal wage tax (2)

    Given the gross salary of the person is <gross_salary>
    And the tax percentage is <tax_percentage>
    When user presses the Enter
    And the personal wage tax should be returned as <personal_wage_tax>
    And net salary should be <net_salary>

    Examples:
      | gross_salary | tax_percentage | net_salary   | personal_wage_tax   |
      | 6000         | 15             | 5100.0       | 900                 |
      | 3000         | 13             | 2610.0       | 390.0               |
