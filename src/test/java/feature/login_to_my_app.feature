Feature: Login to the application and verify home page.

  Scenario: User login to application successfully.

    Given I navigate to the "Amazon" application
    And Click on the login button
    Then The login page is displayed with Username and Password textbox
    When I enter the username and password from datatable and click on login button
          | username | password     |
          | dipudan1 | password@123 |
          | dipudan2 | password@123 |
          | dipudan3 | password@123 |
          | dipudan4 | password@123 |
          | dipudan5 | password@123 |
          | dipudan6 | password@123 |
          | dipudan7 | password@123 |
          | dipudan8 | password@123 |
          | dipudan9 | password@123 |
          | dipudan10 | password@123 |
          | dipudan11 | password@123 |
          | dipudan12 | password@123 |
          | dipudan13 | password@123 |
          | dipudan14 | password@123 |
          | dipudan15 | password@123 |
          | dipudan16 | password@123 |
          | dipudan17 | password@123 |
          | dipudan18 | password@123 |
          | dipudan19 | password@123 |
          | dipudan20 | password@123 |
          | dipudan21 | password@123 |
          | dipudan22 | password@123 |
          | dipudan23 | password@123 |
          | dipudan24 | password@123 |
    Then I should navigate to the homepage.


#  Scenario: User login to application successfully.
#
#    Given I navigate to the eCommerce application
#      | application |
#      | Amazon      |
#    And Click on the login button
#    Then The login page is displayed with Username and Password textbox
#    When I enter the username and password and click on login button
#      |username | password     |
#      | dipudan | password@123 |
#    Then I should navigate to the homepage.*/

