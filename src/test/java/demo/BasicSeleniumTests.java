package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicSeleniumTests {
  @Test
    public void basicSeleniumTests() {
      WebDriver driver ;
      //Test implementation
      driver= new ChromeDriver();
      driver.navigate().to("https://www.google.com");
      driver.quit();

    }

    
}
