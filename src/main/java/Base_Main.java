import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Main
{
    public static WebDriver AlyDriver;
    public Base_Main(WebDriver  AlyDriver)
    {
        PageFactory.initElements(AlyDriver, this);
    }
}



// for Allure report (video :https://www.youtube.com/watch?v=5b4ZMAjHitw&t=1315s)
// 1- delete the "allure-results" file
// 2- execute the tests you want to make allure report for
// 3- get the path of allure result   (C:\Users\aabdelhamid\IdeaProjects\TCoETraining\allure-results)
// 4- write in CMD --> allure serve C:\Users\aabdelhamid\IdeaProjects\TCoETraining\allure-results

// to check the version of Java you have .. write in CMD --> java -version
// to check the version of allure you have .. write in CMD --> allure --version

// to run the test XML file through the CMD .. add the XML name in the pom plug-in, then write "mvn clean test" in CMD and enter

