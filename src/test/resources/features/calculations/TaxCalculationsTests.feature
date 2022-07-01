Feature: Validation of Calculated tax value and Established threshold

  #TODO: Complete scenario after Configuration
  Scenario Outline: Customer is created and income is changed
    Given Create customer request is sent, supplemented with "<incomeLastYear>" income last year
    Examples:
      | incomeLastYear | calculatedTax | establishedThreshold |
      | 12.23          | 1.80          | FIRST                |
      | 123.54         | 18.0          | SECOND               |
      | 456.2          | 60.2          | THIRD                |
