package features;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.*;


@RunWith(SerenityRunner.class)
public class BaseTest {
@Managed(uniqueSession = true)
public WebDriver driver;



    @Steps
    protected ProductSteps productSteps;

    @Steps LoginSteps loginSteps;

    @Steps
    protected HeaderNavbar1Steps headerNavbar1Steps;

    @Steps
    protected HeaderNavbar2Steps headerNavbar2Steps;

    @Steps
    protected HeaderNavbar3Steps headerNavbar3Steps;

    @Steps
    protected HomeSteps homeSteps;

    @Steps
    protected ContactSteps contactSteps;

    @Steps
    protected MyAccountSteps myaccountSteps;

    @Steps
    protected SearchSteps searchSteps;




    @Before
    public void init() {
       // System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
        driver.manage().getCookies();
        driver.manage().window().maximize();
        driver.get("https://test.shopoteque.com/");

    }
}
