Feature: scenari outline example

  Scenario Outline:
    Given kullanici "<url>" sayfasinda


    When  kullanici asagidaki verilerle giris yapitiginda
      | username | <kullanicadi> |
      | password | <sifre>       |

    And kullanici "<kullanicadi>" ve sifre "<sifre>" ile giris yaptiginda

    Then  giris durumu "<status>" olmali



    Examples:
      | url  | kullanicadi | sifre | status |
      | url  | ali11       | 121   | false  |
      | ali2 | ali12       | 122   | false  |
      | ali3 | ali13       | 123   | true   |
      | ali4 | ali14       | 124   | false  |
      | ali5 | ali15       | 125   | false  |
      | ali6 | ali16       | 126   | false  |

