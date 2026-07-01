package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicSeleniumTests {
  WebDriver driver;
  By logoLocator=By.cssSelector("section[class='header_headerLeft__n53WM header_headerSection___Ammb']");
  By SearchFiled=By.id("searchbox_input");
  By FirstLinkURl=By.xpath("//div[@class=\"pAgARfGNTRe_uaK72TAD\"]//a[@href='https://www.selenium.dev/documentation/webdriver/']");

  @BeforeMethod
  public void beforeMethod() {
    //Test implementation
    driver= new ChromeDriver();}

  @AfterMethod
   public void afterMethod() {
    driver.quit();

  }
  @Test
    public void basicSeleniumTests() {
      driver.navigate().to("https://www.google.com");


    }

   @Test
   public void assertPageTitle() {
      driver.navigate().to("https://duckduckgo.com/");
      String CurrentTitle =driver.getTitle();
      Assert.assertEquals(CurrentTitle,"Google");

    }

   @Test
   public void assertLogoIsDisplayed() {
      driver.navigate().to("https://duckduckgo.com/");
     WebElement logo = driver.findElement(logoLocator);
      Assert.assertTrue(logo.isDisplayed());
}
   @Test
   public void assertaFristaLink() {
      driver.navigate().to("https://duckduckgo.com/");
      driver.findElement(SearchFiled).sendKeys("Selenium WebDriver", Keys.ENTER);
      String ActualFirstLinkURl="https://www.selenium.dev/documentation/webdriver/";
      Assert.assertEquals(driver.findElement(FirstLinkURl).getAttribute("href"),ActualFirstLinkURl);




}}
