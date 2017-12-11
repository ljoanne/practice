Feature: Find Inner-most left bracket position

  Scenario Outline: RepetitionIndexFinderTest
    Given the RepetitionIndexFinderTest input is <input>
    When analyzed
    Then the position is <output>

    Examples:
      | input        | output |
      | 3[abc]4[ab]c | 6      |
      | 10[a]        | 0      |
      | 2[3[a]b]     | 2      |
      | abc10[a]     | 3      |