import cucumber.api.java8.En;

import static org.junit.Assert.assertEquals;

public class DecompressorTest implements En {

    private Decompressor decompressor;

    private String input;
    private String actual;

    public DecompressorTest() {
        Given("^the DecompressorTest input is (.*)", (String input) -> {
            decompressor = new Decompressor();
            this.input = input;
        });

        When("^processed$", () -> actual = decompressor.process(input));

        Then("^the output is (.*)", (String output) -> assertEquals(output, actual));
    }

}
