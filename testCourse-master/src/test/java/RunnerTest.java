import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "",
        tags = "@all",
        plugin = { "pretty", "html:target/cucumber-reports" },
        snippets = SnippetType.UNDERSCORE,
        monochrome = true
)
public class RunnerTest {
}