Feature: DemoQA

  Scenario Outline: WebTable gidis
    Given kullanici "https://demoqa.com" adresine gider
    And   kullanici Elements linkine tiklar
    And   kullanici WebTables linkine tiklar
    When  kullanici formu asagidaki bilgilerle doldurdugunda
      | FirstName  | <firstName>  |
      | LastName   | <lastName>   |
      | Email      | <email>      |
      | Age        | <age>        |
      | Salary     | <salary>     |
      | Department | <department> |

    Then  kayit eklenmis olmali

    Examples:
      | firstName | lastName | email          | age | salary | department |
      | ali       | ali      | ali@gmail.com  | 20  | 200    | A          |
      | ali1      | ali1     | ali1@gmail.com | 20  | 200    | A          |
      | ali2      | ali2     | ali2@gmail.com | 20  | 200    | B          |
      | ali3      | ali3     | ali3@gmail.com | 20  | 200    | A          |
      | ali4      | ali4     | ali4@gmail.com | 20  | 200    | C          |
      | ali5      | ali5     | ali5@gmail.com | 20  | 200    | A          |
      | ali6      | ali6     | ali6@gmail.com | 20  | 200    | D          |



