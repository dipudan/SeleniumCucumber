Feature: I am searching for cheese.
          Did you find it?

  @ui-test
  Scenario: Finding some cheese
    Given I am on the Google search page
    When I search for "Cheese!"
    Then the page title should start with "cheese"


  @ui-test
  Scenario: Finding some cheese
    Given I am on the Google search page
    When I search for "Peace!"
    Then the page title should start with "peace"