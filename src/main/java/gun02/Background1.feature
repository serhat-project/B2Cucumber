Feature: background feature

  # Her senaryo öncesi yapilacak islem varsa
  # Background'a yazilir

  Background: her senaryo öncesi yapilacaklar
    Given baslangic sayisi 3 olsun
    When  kullanici 2 eklediginde


  Scenario: matematik islem
    When  kullanici 3 cikardiginda
    Then  sonuc 2 olmalidir


  Scenario: islemler
    When  kullanici 1 cikardiginda
    Then  sonuc 4 olmalidir




