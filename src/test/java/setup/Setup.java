package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class Setup {
    protected WebDriver driver;
    //Pages
    protected  HomePage homePage;
    String  URL ="https://www.moneycontrol.com/";
    @BeforeTest
    public void funSetup(){
        driver=new ChromeDriver();
        driver.get(URL);
        homePage=new HomePage(driver);
    }

//    @AfterTest
//    public void tearDown(){
//        driver.quit();
//    }
}
