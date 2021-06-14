
package test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

  static WebDriver driver;
  String URL = "https://www.google.com";

  @BeforeClass
  public static void init() {
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().fullscreen();
  }
  

  @Before
  public void setup() {
	driver.get(URL);  
  }


  @Test
  public void testOne() throws InterruptedException {
	WebElement searchBar = driver.findElement(By.name("q"));  
    searchBar.sendKeys("messi");
    searchBar.submit();
    System.out.println(driver.getTitle());
    Assert.assertEquals(driver.getTitle(), "messi - Buscar con Google");
  }



  @AfterClass
  public static void tearDown() {
	 driver.quit(); 
  }
  


}
















