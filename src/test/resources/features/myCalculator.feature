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
  Scenario: Should take a percentage of numbers
    Given my calculator is running
    When I take a percentage of the following numbers
      | firstNum | secondNum |
      | 200      | 20        |
      | -1       | 25        |
      | 0       | 25        |
    Then result should be equal to
      | result |
      | 40     |
      | 0      |
      | 0      |

  @wip
  Scenario: Should take log base 10 of a number
    Given my calculator is running into log10
    When I take log10
      | firstNum |
      | 10       |
      | 5        |
      | 0        |
    Then result should be equal to log10
      | resultLog              |
      | 1     |
      | 0.6989700043360189     |
      | 0     |
