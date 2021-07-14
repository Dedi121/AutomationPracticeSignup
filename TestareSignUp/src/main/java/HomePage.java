import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    public HomePage(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(className = "login")
    WebElement loginBtn;
    @FindBy(id = "email_create")
    WebElement emailInput;
    @FindBy(id = "SubmitCreate")
    WebElement goToRegister;

    public HomePage clickSignUp(){
        getLoginBtn().click();
        return new HomePage(getWebDriver());
    }

    public void emailVerification(String email) {getAddEmail().sendKeys(email);}
    public RegisterPage sendToRegister(){
        getGoToRegister().click();
        new WebDriverWait(getWebDriver(), 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
        return new RegisterPage(getWebDriver());
    }

    public WebElement getLoginBtn() {return loginBtn;}
    public WebElement getAddEmail() {return emailInput;}
    public WebElement getGoToRegister() {return goToRegister;}

}
