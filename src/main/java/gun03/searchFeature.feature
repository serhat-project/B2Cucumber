Feature: Website Search

  Scenario:
    Given   user on opencart main page
    When    user search "mac"
    Then    product count should be 4

  Scenario:
    Given   user on opencart main page
    When    user search "iPhone"
    Then    product count should be 1