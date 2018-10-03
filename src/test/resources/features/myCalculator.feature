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
      | 5        | 2         |
      | 10       | 4         |
      | 15       | 0         |

    Then result should be equal to
      | result |
      | 1      |
      | 2      |
      | 500    |

  @wip
  Scenario: get nth root of number
    Given my calculator is running
    When Get the first number's nth_root, n being the second number
      | firstNum | secondNum |
      | 4        | 2         |
      | 27       | 3         |
      | 125      | 0         |
    Then result should be equal to
      | result |
      | 2      |
      | 3      |
      | 500    |


