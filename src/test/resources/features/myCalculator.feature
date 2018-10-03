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
    When I multiplied the following numbers
      | firstNum | secondNum |
      | 7        | 4         |
      | 2       | 12         |
    Then result should be equal to
      | result |
      | 28      |
      | 24      |

  @wip
  Scenario: Should return the natural logarithm of a positive number
    Given my calculator is running
    When I make de logarithm of the following numbers
      | firstNum |
      | 1        |
      | 2        |
    Then result should be equal to
      | result                  |
      | 0                       |
      | 0.693147180559945       |
