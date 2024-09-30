
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends Test_Base
{
    //1- hat al Page
    Orange_Page Orange;

    //2- 7ot al Test
    @Test
    public void TestCaseName()
    {
        Orange = new Orange_Page(AlyDriver);

        //Page
        String PageTitle = AlyDriver.getTitle();
        String URL = AlyDriver.getCurrentUrl();

        Assert.assertEquals(URL,"www.hhhh.com");
        System.out.println("Text Box Displayed: " + Orange.TextBox.isDisplayed());

        //Mouse and Keyboard actions in the page
        Orange.TextBox.click();
        Orange.TextBox.sendKeys();
        Orange.TextBox.clear();

        Actions actions = new Actions(AlyDriver);      // lazm abl ay 7aga mn elly gya
        actions.contextClick(Orange.TextBox).build().perform(); //Right click on el webelement TextBox in Orange
        actions.moveToElement(Orange.TextBox).click().perform(); // left click 3adya 5als
        actions.moveToElement(Orange.TextBox).perform(); //Hover over el webelement TextBox in Orange
        actions.doubleClick(Orange.TextBox).build().perform(); //Double click 3adya
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform(); //scroll to top (Press on "Ctrl" + press on "Home" in Keyboard)
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform(); //scroll to buttom
        Orange.TextBox.sendKeys(Keys.PAGE_UP);
        Orange.TextBox.sendKeys(Keys.PAGE_DOWN);
        Orange.TextBox.sendKeys(Keys.ARROW_UP);
        Orange.TextBox.sendKeys(Keys.ARROW_DOWN);
        Orange.TextBox.sendKeys(Keys.ARROW_LEFT);
        Orange.TextBox.sendKeys(Keys.ARROW_RIGHT);

        //Drop Down List (DDL)
        Select DDL = new Select(AlyDriver.findElement(By.xpath("xpath el DDL")));
        DDL.selectByIndex(0);
        DDL.selectByValue("1");
        DDL.selectByVisibleText("Mango");

        //Alerts & Frames
        AlyDriver.switchTo().alert().accept();
        AlyDriver.switchTo().alert().dismiss();
        AlyDriver.switchTo().alert().sendKeys("text you want to enter");
        AlyDriver.switchTo().alert().getText();
        AlyDriver.switchTo().frame(0);
        AlyDriver.switchTo().frame("frame ID or name");
        AlyDriver.switchTo().parentFrame();
        AlyDriver.switchTo().defaultContent();

        //Navigations & Window managing
        AlyDriver.get("www.hhhhh.com");
        AlyDriver.navigate().to("www.hhhhh.com");
        AlyDriver.navigate().forward();
        AlyDriver.navigate().back();
        AlyDriver.navigate().refresh();
        AlyDriver.manage().window().setPosition(new Point(0,0));
        AlyDriver.manage().window().minimize();
        AlyDriver.manage().window().maximize();
        AlyDriver.manage().window().fullscreen();

        //Javascript Executor
        JavascriptExecutor js = (JavascriptExecutor) AlyDriver;
        js.executeScript(Script, Arguments);
        js.executeScript(return something);





    }

}