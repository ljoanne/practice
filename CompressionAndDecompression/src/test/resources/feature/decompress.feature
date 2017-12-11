Feature: Process input

  Scenario Outline: DecompressorTest
    Given the DecompressorTest input is <input>
    When processed
    Then the output is <output>

    Examples:
      | input        | output             |
      | 3[abc]4[ab]c | abcabcabcababababc |
      | 10[a]        | aaaaaaaaaa         |
      | 2[3[a]b]     | aaabaaab           |
      | abc10[a]     | abcaaaaaaaaaa      |