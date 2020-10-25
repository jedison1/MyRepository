@datatable
Feature: Data table sample

  Scenario: Data table test
    Given the data to print
      | Name   | Age |
      | James  |  25 |
      | James1 |  26 |
    When city is added
      | City |
      | C    |
      | C1   |
    Then print the values
