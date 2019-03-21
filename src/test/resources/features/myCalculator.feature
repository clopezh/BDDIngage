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
  Scenario: Should multiply two positive numbers
    Given my calculator is running
    When I multiply the following numbers
      | firstNum | secondNum |
      | 2        | 10        |
      | 45       | 3         |
    Then result should be equal to
      | result |
      | 20     |
      | 135    |

  @wip
  Scenario: Should divide two positive numbers
    Given my calculator is running
    When I divide the following numbers
      | firstNum | secondNum |
      | 15       | 5         |
      | 80       | 20        |
    Then result should be equal to
      | result |
      | 3      |
      | 4      |