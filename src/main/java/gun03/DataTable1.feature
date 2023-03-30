Feature: Data table samples


  # List<String>
  Scenario: sablon 1, list
    Given my list 10
      | 1 |
      | 2 |
      | 3 |

    Then conclution




      # List<List<String>>
  Scenario: sablon 2, lists
    Given my lists, list of list
      | 1 | 11 | 21 | 31 | 41 |
      | 2 | 12 | 22 | 32 | 42 |
      | 3 | 13 | 23 | 33 | 43 |
      | 4 | 14 | 24 | 34 | 44 |
      | 5 | 15 | 25 | 35 | 45 |
      | 5 | 15 | 25 | 35 | 45 |



    # Map<String, String>
  Scenario: sablon 3, map
    Given my map
      | key1 | 1  |
      | key2 | 6  |
      | key3 | 21 |
      | key4 | 23 |
