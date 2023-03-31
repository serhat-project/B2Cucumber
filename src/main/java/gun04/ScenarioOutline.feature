Feature: scenari outline example

  Scenario Outline:
    Given ogrencinin adi "<name>"
    When  ogrencinin soyadi "<lastname>"
    Then  ogrencinin yasi <age>


    Examples:
      | name | lastname | age |
      | ali1 | ali11    | 121 |
      | ali2 | ali12    | 122 |
      | ali3 | ali13    | 123 |
      | ali4 | ali14    | 124 |
      | ali5 | ali15    | 125 |
      | ali6 | ali16    | 126 |

