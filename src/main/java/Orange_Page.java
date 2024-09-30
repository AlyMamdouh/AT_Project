import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orange_Page extends Base_Main
{

    public Orange_Page(WebDriver AlyDriver) {super(AlyDriver);}

    @FindBy(id = "displayed-text")
    public WebElement TextBox;
//   or WebElement TextBox = AlyDriver.findElement(By.xpath("displayed-text"));


    @FindBy (id = "hide-textbox")
    public WebElement Hidebtn;

    @FindBy(id = "show-textbox")
    public WebElement Showbtn;



}