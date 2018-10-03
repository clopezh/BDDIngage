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
  Scenario: Should divide two numbers
    Given my calculator is running for division
    When I divide the following numbers
      | firstNum | secondNum |
      | 4        | 2         |
      | 9        | 3         |
      | 12       | 5         |
    Then resultDiv should be equal to
      | result |
      | 2      |
      | 3      |
      | 2.4    |

  @wip
  Scenario: Should calculate the square root of the given number
    Given my calculator is running for square root
    When I calculate the square root of the following numbers
      | firstNum |
      | 4        |
      | 9        |
      | -5       |
    Then resultSqrt should be equal to
      | result |
      | 2      |
      | 3      |
      | 0      |