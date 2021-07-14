import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage{
    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(className = "logout")
    private WebElement logoutButton;

    public ProfilePage logoutBtn() {
        getLogoutButton().click();
        return new ProfilePage(getWebDriver());
    }

    public WebElement getLogoutButton() {return logoutButton;}
}
