Feature: User Registration
@list
  Scenario: Register New User with List
    # Given I am on the registration page of the application
    # Then I enter firstname
    # And I enter lastname
    # 3 And I enter phone-number
    # And I enter email
    # Note Scenario Outline is at Scenario Level - for complete scenario - see example MultiLogin.feature
    # But DataTable is at the Step level only for a particular steps

    Given I am on the registration page of the application
    Then I enter data into the fields and click on submit button
      | shantosh | kumar     | 98393930    | shan@gmail.com             |
      | Rajani   | Choudhary | 9144262064  | rajaniusaindia@gmail.com   |
      | Keshav   | Choudhary | 914426-1028 | keshav_choudhary@gmail.com |

    Then I should see the success message

@map
  Scenario: Register new User with Map
    # Given I am on the registration page of the application
    # Then I enter firstname
    # And I enter lastname
    # 3 And I enter phone-number
    # And I enter email

    # in Test Runner - change dryRun = True to generate the missing step definition
    # and add in step definition file
    # String.class - String, String.class - value passed as String  - convert number to String and pass

    Given I am on the registration page of the application
    When I enter data into the field and click on submit
      | firstname | lastname  | phone       | email                      |
      | shantosh  | kumar     | 98393930    | shan@gmail.com             |
      | Rajani    | Choudhary | 9144262064  | rajaniusaindia@gmail.com   |
      | Keshav    | Choudhary | 914426-1028 | keshav_choudhary@gmail.com |

    Then I should see the success message


