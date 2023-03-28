package gun01;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/java/gun01/myFirstFeature.feature"},
        glue = {"gun01"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
