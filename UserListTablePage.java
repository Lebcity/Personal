import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.print.DocFlavor;
import java.io.IOException;

public class UserListTablePage {

    WebDriver driver;
    private final WebDriverWait wait;

    public UserListTablePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(how = How.XPATH ,using = "/html/body/table")
    public WebElement userListTable;
    @FindBy(how = How.XPATH,using = "/html/body/table/thead/tr[2]/td/button")
    public WebElement addUserButton;
    @FindBy(how = How.XPATH,using = " /html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")
    public WebElement firstNameField;
    @FindBy(how = How.XPATH,using = " /html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")
    public WebElement lastNameField;
    @FindBy(how = How.XPATH,using = "/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")
    public WebElement userName;
    @FindBy(how = How.XPATH,using = "/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")
    public WebElement password;
    @FindBy(how = How.XPATH,using = "/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input")
    public WebElement companyAAA;
    @FindBy(how = How.XPATH,using = "/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]/input")
    public WebElement companyBBB;
    @FindBy(how = How.XPATH,using = "/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[4]")
    public WebElement adminRole;
    @FindBy(how = How.XPATH,using = "/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")
    public WebElement emailField;
    @FindBy(how = How.XPATH,using = "/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")
    public WebElement cellphone;
    @FindBy(how = How.XPATH,using = "/html/body/div[3]/div[3]/button[2]")
    public WebElement saveUserButton;
    @FindBy(how = How.XPATH,using = "/html/body/table/tbody/tr[1]/td[1]")
    public WebElement addedUser1;

    private ReadTestData readExcel;


    public void waitForUserListTable(){
        wait.until(ExpectedConditions.visibilityOf(userListTable));
    }


    public String  getAddedUser1(){
       return wait.until(ExpectedConditions.visibilityOf(addedUser1)).getText();
    }

    public void addUser1(){
        wait.until(ExpectedConditions.elementToBeClickable(addUserButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(TestData.userDetails.FIRST_NAME);

        lastNameField.sendKeys(TestData.userDetails.LAST_NAME1_NAME);
        userName.sendKeys(TestData.userDetails.FIRST_USERNAME);
        password.sendKeys(TestData.userDetails.PASSWORD_1);
        companyAAA.click();
        adminRole.click();
        emailField.sendKeys(TestData.userDetails.EMAIL);
        cellphone.sendKeys(TestData.userDetails.CellNumber);
        saveUserButton.click();
    }
}
