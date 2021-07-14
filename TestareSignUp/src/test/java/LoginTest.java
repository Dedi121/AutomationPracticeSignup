import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseTest{

    private WebDriver webDriver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @After
    public void after() throws InterruptedException {
        Thread.sleep(2000);
        webDriver.quit();
    }

    @Test
    public void clickLogin() throws InterruptedException {
        webDriver.get("http://automationpractice.com/index.php");
        HomePage homePage = new HomePage(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        homePage.clickSignUp();
        Thread.sleep(2000);
        loginPage.insertCredentials("dedi.alex.121@gmail.com", "parola123");
        Thread.sleep(1000);
        loginPage.clickLogin();
        Thread.sleep(2000);
    }

}
