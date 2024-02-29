package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    //Driver
  private WebDriver driver ;
    // Locators
   private By locLoginIco=By.xpath("//a[text()=\"Hello, Login\"]");
public HomePage(WebDriver driver){
    this.driver=driver;
}
public void funClickOnLogin(){
    WebElement element=driver.findElement(locLoginIco);
    element.click();
}

}
