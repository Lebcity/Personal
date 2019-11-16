import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    public static WebDriver startBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" http://www.way2automation.com/angularjs-protractor/webtables/ ");
        return driver;
    }
}
