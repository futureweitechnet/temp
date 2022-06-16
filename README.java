package DSB_tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class functional_test {
	WebDriver driver;

  @Test(groups = { "sit", "smoke" })
  public void fun1() {
  System.out.println("-----fun1 start");
	System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");

	driver = new ChromeDriver();
  
  /* 
  ChromeOptions chromeOptions = new ChromeOptions();
  try {
    driver = new RemoteWebDriver(new URL("http://10.9.17.252:4444/wd/hub"), chromeOptions);
  } catch (MalformedURLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
*/

	driver.get("http://10.9.17.252:7001/spring-petclinic/");
	driver.findElement(By.xpath("//a[@title='trigger a RuntimeException to see how it is handled']")).click();
	String current_url= driver.getCurrentUrl();
	String target_url="http://10.9.17.252:7001/spring-petclinic/oups";
	Assert.assertEquals(current_url, target_url);
  driver.quit();
  }
  @Test(dataProvider = "dp",groups = { "sit" })
  public void fun2(Integer n, String s) {
    System.out.println("-----fun2 start");
	System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.9.17.252:7001/spring-petclinic/");
	driver.findElement(By.xpath("//a[@title='find owners']")).click();
	String current_url= driver.getCurrentUrl();
	String target_url="http://10.9.17.252:7001/spring-petclinic/owners/find";
	Assert.assertEquals(current_url, target_url);
  }
  @Test(dataProvider = "dp",groups = { "uat" })
  public void fun3(Integer n, String s) {
    System.out.println("-----fun3 start");
	System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.9.17.252:7001/spring-petclinic/");
	driver.findElement(By.xpath("//a[@title='veterinarians']")).click();
	String current_url= driver.getCurrentUrl();
	String target_url="http://10.9.17.252:7001/spring-petclinic/vets.html";
	Assert.assertEquals(current_url, target_url);
  }
  
  
  @BeforeMethod(groups = { "must"})
  public void beforeMethod() {
  }

  @AfterMethod(groups = { "must"})
  public void afterMethod() {
    System.out.println("-----quit driver");
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest(groups = { "must"})
  public void beforeTest() {
    System.out.println("-----Functional Test Start-----");
  }

  @AfterTest(groups = { "must"})
  public void afterTest() {
    System.out.println("-----Functional Test Finish-----");
  }

}
