#Senaryo ;
#1- siteyi açınız.
#2- username ve password u gönderin ve Login butonuna tıklatın.
#3- Login olduğunuzu doğrulayın.

  #- Sonra Yukarıdaki Senaryoyu Gherkin dilinde yazdık.

Feature: Register Functionality

    Scenario: Register a new accaunt
    Given Navigate to ParaSoft
    When  click register link
    And   Enter valid user information to form and click registir button
    Then User should be register successfuly

