import cucumber.api.java.en.Given;

public class MainSteps {
    @Given("^I run my first program$")
    public void iTest() throws Exception {
        new Main().printMsg("my first program");
//        throw new Exception();
    }
}
