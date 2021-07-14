import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "email")
    private WebElement emailLogIn;
    @FindBy(id = "passwd")
    private WebElement pwdLogIn;
    @FindBy(id = "SubmitLogin")
    private WebElement loginBtn;

    public void insertCredentials(String email, String pwd){
        getEmailLogIn().sendKeys(email);
        getPwdLogIn().sendKeys(pwd);
    }

    public LoginPage clickLogin(){
        getLoginBtn().click();
        return new LoginPage(getWebDriver());
    }


    public WebElement getLoginBtn() {return loginBtn;}
    public WebElement getEmailLogIn() {return emailLogIn;}
    public WebElement getPwdLogIn() {return pwdLogIn;}
}
