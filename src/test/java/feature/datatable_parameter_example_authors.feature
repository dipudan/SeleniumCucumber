Feature: I search for the author.

  @parameter_test
  Scenario: Finding author
    Given I map the below books and orders into my shelf.
          |   BookName          | Author        |
          |   Alchemist         |Paulo Coelho   |
          |A tale of two cities | Charles Dicken|
    Then I verify the author of book Alchemist is Paulo Coelho


  @parameter_test
  Scenario Outline: Finding author
    Given I map the below books and orders into my shelf.
      |   BookName          | Author        |
      |   Alchemist         |Paulo Coelho   |
    Then I verify the author of book Alchemist is Paulo Coelho

    Examples:
      |   BookName          | Author        |
      |   Alchemist         |Paulo Coelho   |
      |A tale of two cities | Charles Dicken|