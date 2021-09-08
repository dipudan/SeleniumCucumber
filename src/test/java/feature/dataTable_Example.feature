Feature: DataTable Conversion for Cucumber-JVM 4

  Scenario: No.1 DataTable scenario List<List<String>>
    Given the list string lecture details are
      | Jane | 40 | Assistant |
      | Doe  | 30 | Associate |

  Scenario: No.2 DataTable scenario primitive List<LecturePrimitive>
    Given the list primitive lecture details are
      | profName | size | profLevel |
      | Jane     |   40 | ASSISTANT |
      | Doe      |   30 | ASSOCIATE |