import cucumber.api.java8.En;

import static org.junit.Assert.assertEquals;

public class RepetitionIndexFinderTest implements En {

    private RepetitionIndexFinder repetitionIndexFinder;

    private String input;
    private Integer actual;


    public RepetitionIndexFinderTest() {
        Given("^the RepetitionIndexFinderTest input is (.*)", (String input) -> {
            this.input = input;
            repetitionIndexFinder = new RepetitionIndexFinder();
        });

        When("^analyzed$", () -> actual = repetitionIndexFinder.findIndexOfRep(input));

        Then("^the position is (\\d+)$", (Integer output) -> assertEquals(output, actual));

    }

}
