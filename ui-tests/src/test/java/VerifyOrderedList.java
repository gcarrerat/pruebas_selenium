import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class VerifyOrderedList {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "chromedriver_97");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testVerifyOrderedList() throws Exception {
    driver.get("https://www.saucedemo.com/");
    driver.findElement(By.id("user-name")).click();
    driver.findElement(By.id("user-name")).clear();
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    try {
      assertEquals("Name (A to Z)\nName (Z to A)\nPrice (low to high)\nPrice (high to low)", driver.findElement(By.xpath("//div[@id='header_container']/div[2]/div[2]/span/select")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Sauce Labs Backpack", driver.findElement(By.xpath("//a[@id='item_4_title_link']/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("$29.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Sauce Labs Bike Light", driver.findElement(By.xpath("//a[@id='item_0_title_link']/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("$9.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[2]/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Sauce Labs Bolt T-Shirt", driver.findElement(By.xpath("//a[@id='item_1_title_link']/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("$15.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[3]/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Sauce Labs Fleece Jacket", driver.findElement(By.xpath("//a[@id='item_5_title_link']/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("$49.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[4]/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Sauce Labs Onesie", driver.findElement(By.xpath("//a[@id='item_2_title_link']/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("$7.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[5]/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Test.allTheThings() T-Shirt (Red)", driver.findElement(By.xpath("//a[@id='item_3_title_link']/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("$15.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[6]/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//div[@id='header_container']/div[2]/div[2]/span/select")).click();
    new Select(driver.findElement(By.xpath("//div[@id='header_container']/div[2]/div[2]/span/select"))).selectByVisibleText("Price (low to high)");
    try {
      assertEquals("$7.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("$9.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[2]/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("$15.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[3]/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("$15.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[4]/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("$29.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[5]/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("$49.99", driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[6]/div[2]/div[2]/div")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
