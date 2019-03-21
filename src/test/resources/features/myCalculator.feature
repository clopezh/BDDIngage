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
  Scenario: Should divide two positive numbers
    Given my calculator is running
    When I divide the following numbers
      | firstNum | secondNum |
      | 4        | 2         |
      | 10       | 2         |
    Then result should be equal to
      | result |
      | 2      |
      | 5      |

  @wip
  Scenario: Should multiply two positive numbers
    Given my calculator is running
    When I multiply the following numbers
      | firstNum | secondNum |
      | 5        | 2         |
      | 10       | 2         |
    Then result should be equal to
      | result  |
      | 10      |
      | 20      |

  @wip
  Scenario: Should get any logarithm of a positive number
    Given my calculator is running
    When I get the logarithm of the following numbers
      | firstNum | secondNum | thirdNum |
      | 123      | 5         | 2        |
      | 32       | 10        | 4        |
    Then result should be equal to
      | result   |
      | 2.98     |
      | 1.5051   |

  @wip
  Scenario: Should get the square of a positive number
    Given my calculator is running
    When I get the square of the following numbers
      | firstNum | secondNum |
      | 89       | 4         |
      | 9        | 0         |
    Then result should be equal to
      | result   |
      | 9.4339   |
      | 3        |

  @wip
  Scenario: Should get the n root of a positive number
    Given my calculator is running
    When I get the nth root of the following numbers
      | firstNum | secondNum | thirdNum |
      | 243      | 5         | 0        |
      | 546      | 8         | 4        |
    Then result should be equal to
      | result  |
      | 3       |
      | 2.1986  |
