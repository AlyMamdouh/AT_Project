import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class Test_Base
{

    public static WebDriver AlyDriver;


    @BeforeClass
    @Parameters("Browser")
    public void startDriver(@Optional("Edge") String BrowserName) {
        if (BrowserName.equalsIgnoreCase("Chrome")) {
            AlyDriver = new ChromeDriver();

        } else if (BrowserName.equalsIgnoreCase("Firefox")) {
            AlyDriver = new FirefoxDriver();
        } else if (BrowserName.equalsIgnoreCase("IE")) {
            AlyDriver = new InternetExplorerDriver();
        } else if (BrowserName.equalsIgnoreCase("Safari")) {
            AlyDriver = new SafariDriver();
        } else if (BrowserName.equalsIgnoreCase("Edge")) {
            AlyDriver = new EdgeDriver();
        }

        
        AlyDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        AlyDriver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        AlyDriver.manage().window().maximize();

    }

    /////**************************************************************************************************************/////

    @AfterMethod

    public void logout() {
        AlyDriver.quit();
    }

}
