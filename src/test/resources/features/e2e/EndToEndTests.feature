Feature: End to end scenarios for Customers creation and Income change

  Scenario Outline: Customer is created and income is changed
    Given Create customer request is sent, supplemented with "<incomeLastYear>" income last year
    Examples:
      | incomeLastYear |
      | 12.23          |
      | 123.54         |
      | 456.2          |
