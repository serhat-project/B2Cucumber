Feature: background feature

  Scenario: matematik islem
    Given baslangic sayisi 3 olsun
    When  kullanici 2 eklediginde
    And   kullanici 3 cikardiginda
    Then  sonuc 2 olmalidir


  Scenario: islemler
    Given baslangic sayisi 3 olsun
    When  kullanici 2 eklediginde
    And   kullanici 1 cikardiginda
    Then  sonuc 4 olmalidir



