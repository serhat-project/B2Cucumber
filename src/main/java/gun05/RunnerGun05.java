package gun05;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;


@CucumberOptions(
        //features = {"c:/features"},                   // feature'lar genellikle test/resources altinda olur
        features = {"src/main/java/gun05/gun05.feature"},         // feature yolu alinirken content rootdan baslanir
        glue = {"gun05"},        // glue'lar, stepdefs ve hooks classlarinin yeridir, sourceroot'dan baslar
        dryRun = false,           // sadece step defsler düzgün hazirlanmismi, yapilandirma uygun mu
        tags = "@login",         // @login tagli senaryolar calistirilin
        plugin = {"pretty",
                "html:test-output/report.html",
                "json:test-output/report.json"
        }

)
public class RunnerGun05 extends AbstractTestNGCucumberTests {

    @Parameters("browser")
    @BeforeTest
    public void beforeTest(@Optional("chrome") String browser){
        System.out.println("TESTNG beforeTest");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("TESTNG after suite");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("TESNG before suite");
    }

}
