import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver webDriver;

    public BaseTest() {
    }

    @Before
    public void init(){
        try {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

    @After
    public void after() throws InterruptedException {
        webDriver.quit();
    }

}
