import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(getWebDriver(), this);
    }


    @FindBy(id = "id_gender1")
    private WebElement genderSelect;
    @FindBy(id = "customer_firstname")
    private WebElement firstNameInput;
    @FindBy(id = "customer_lastname")
    private WebElement lastNameInput;
    @FindBy(id = "passwd")
    private WebElement passwordInput;
    @FindBy(id = "days")
    private WebElement days;
    @FindBy(id = "months")
    private WebElement months;
    @FindBy(id = "years")
    private WebElement years;
    @FindBy(id = "company")
    private WebElement companyInput;
    @FindBy(id = "address1")
    private WebElement addressInput;
    @FindBy(id = "city")
    private WebElement cityInput;
    @FindBy(id = "id_state")
    private WebElement state;
    @FindBy(id = "postcode")
    private WebElement postalCodeInput;
    @FindBy(id = "phone_mobile")
    private WebElement mobilePhoneInput;
    @FindBy(id = "alias")
    private WebElement aliasAddressInput;
    @FindBy(id = "submitAccount")
    private WebElement register;

    public RegisterPage selectGender() {
        getGenderSelect().click();
        return new RegisterPage(getWebDriver());
    }
    public void selectDay() {
        Select day = new Select(getDays());
        day.selectByIndex(12);
    }

    public void selectMonth() {
        Select month = new Select(getMonths());
        month.selectByIndex(5);
    }

    public void selectYear() {
        Select year = new Select(getYears());
        year.selectByIndex(23);
    }

    public void selectState() {
        Select state = new Select(getState());
        state.selectByIndex(3);
    }

    public void insertKeys(String firstName, String lastName, String password, String company, String address, String city, String postalCode, String mobilePhone, String assignFutureAddress) {
        getFirstNameInput().sendKeys(firstName);
        getLastNameInput().sendKeys(lastName);
        getPasswordInput().sendKeys(password);
        getCompanyInput().sendKeys(company);
        getAddressInput().sendKeys(address);
        getCityInput().sendKeys(city);
        getPostalCodeInput().sendKeys(postalCode);
        getMobilePhoneInput().sendKeys(mobilePhone);
        getAliasAddressInput().clear();
        getAliasAddressInput().sendKeys(assignFutureAddress);
    }



    public ProfilePage clickRegister() {
        getRegister().click();
        new WebDriverWait(getWebDriver(), 5).until(ExpectedConditions.visibilityOfElementLocated(By.className("account")));
        return new ProfilePage(getWebDriver());
    }

    public WebElement getGenderSelect() {
        return genderSelect;
    }

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getDays() {
        return days;
    }

    public WebElement getMonths() {
        return months;
    }

    public WebElement getYears() {
        return years;
    }

    public WebElement getCompanyInput() {
        return companyInput;
    }

    public WebElement getAddressInput() {
        return addressInput;
    }

    public WebElement getCityInput() {
        return cityInput;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getPostalCodeInput() {
        return postalCodeInput;
    }

    public WebElement getMobilePhoneInput() {
        return mobilePhoneInput;
    }

    public WebElement getAliasAddressInput() {
        return aliasAddressInput;
    }

    public WebElement getRegister() {
        return register;
    }

}
