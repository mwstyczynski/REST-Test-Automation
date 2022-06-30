Feature: Validation of Calculated tax value and Established threshold

  #TODO: Complete scenario after Configuration
  Scenario Outline: Customer is created and income is changed
    Given Create customer request is sent, supplemented with "<income>" income last year
    Examples:
      | threshold | income | tax    |
      | FIRST     | 12.23  | 12.23  |
      | SECOND    | 123.54 | 123.54 |
      | THIRD     | 456.2  | 456.2  |
