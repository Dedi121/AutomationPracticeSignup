import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpTest extends BaseTest{

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
    public void clickSignUp() throws InterruptedException {
        webDriver.get("http://automationpractice.com/index.php");

        HomePage homePage = new HomePage(webDriver);
        homePage.clickSignUp();
        Thread.sleep(2000);
        homePage.emailVerification("dedi.alex.121@gmail.com");
        RegisterPage registerPage = homePage.sendToRegister();
        Thread.sleep(2000);
        registerPage.selectGender();
        Thread.sleep(2000);
        registerPage.insertKeys("Dedi", "Alex", "parola123", "Endava",
                "Saint Piters, number 56, Calofornia", "California", "23223", "1234123423",
                "DN7, Bucuresti");
        registerPage.selectDay();
        registerPage.selectMonth();
        registerPage.selectYear();
        registerPage.selectState();
        Thread.sleep(20000);

        ProfilePage profilePage = registerPage.clickRegister();
        Thread.sleep(5000);
        profilePage.logoutBtn();

        Thread.sleep(5000);








    }

}
