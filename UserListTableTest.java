import io.qameta.allure.Story;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class UserListTableTest {

    UserListTablePage user;

    @Test
    @Story("Verify The UserList Table")
    public void verifyUserListTable(){
        WebDriver driver = BrowserFactory.startBrowser();
        user = PageFactory.initElements(driver, UserListTablePage.class);
        user.waitForUserListTable();
        Assert.assertTrue(user.userListTable.isDisplayed());
    }

    @Test
    @Story("Add User To Table and verify user is added to the table")
    public void addUserToTable(){
        WebDriver driver = BrowserFactory.startBrowser();
        user = PageFactory.initElements(driver, UserListTablePage.class);
        user.addUser1();
        Assert.assertEquals(user.getAddedUser1(),TestData.userDetails.FIRST_NAME);
        //driver.quit();
    }
}