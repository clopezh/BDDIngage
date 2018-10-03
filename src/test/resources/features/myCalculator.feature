Feature: My Calculator

  @wip
  Scenario: Should add two positive numbers
    Given my calculator is running
    When I add the following numbers
      | firstNum | secondNum |
      | 1        | 2         |
      | 2        | 3         |
    Then result should be equal to
      | result |
      | 3      |
      | 5      |

  @wip
  Scenario: Should subtract two positive numbers
    Given my calculator is running
    When I subtract the following numbers
      | firstNum | secondNum |
      | 4        | 2         |
      | 10       | 3         |
    Then result should be equal to
      | result |
      | 2      |
      | 7      |


  @wip
  Scenario: Should multiply a number by itself a given amount of times
    Given my calculator is running
    When I multiply the firstNum by itself secondNum times
      | firstNum | secondNum |
      | 2        | 8         |
      | 5        | 2         |
    Then result should be equal to
      | result   |
      | 256      |
      | 25       |

  @wip
  Scenario: Should divide two numbers and get the residue
    Given my calculator is running
    When I divide the firstNum between the secondNum and obtain the residue
      | firstNum | secondNum |
      | 4        | 2         |
      | 5        | 2         |
    Then result should be equal to
      | result   |
      | 0       |
      | 1       |
