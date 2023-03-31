Feature: opencat add products to cart

"""
  Scenario: login
    Given user on "" page
    When  user clicks MyAccount
    And   user clicks Login
    And   user fills the loginform as follows
      | username | deneme@deneme.com |
      | password | deneme            |
    And   user clicks Submit button
    Then  login should be successfull
"""

  Scenario: login
    Given user on "" page
    And   user login with the foolowing credentials
      | username | deneme@deneme.com |
      | password | deneme            |
    Then  login should be successfull



  Scenario Outline: add products to cart
    Given user search for "<searchTerm>"
    When  user add "<product>" to the cart
    Then  product should be added

    Examples:
      | searchTerm | product            |
      | mac        | MacBook            |
      | mac        | MacBook Pro        |
      | iPhone     | iPhone             |
      | Samsung    | Samsung SyncMaster |

