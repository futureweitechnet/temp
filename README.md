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


public class admin_test {
  WebDriver driver;
  @Test(groups = { "sit", "smoke" })
  public void admin1() {
    System.out.println("-----admin1 start");
	System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.9.17.252:7001/spring-petclinic/");
	driver.findElement(By.xpath("//a[@title='home page']")).click();
	String current_url= driver.getCurrentUrl();
	String target_url="http://10.9.17.252:7001/spring-petclinic/";
	Assert.assertEquals(current_url, target_url);
  }
  @Test(groups = { "uat" })
  public void admin2() {
    System.out.println("-----admin2 start");
	System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.9.17.252:7001/spring-petclinic/");
	driver.findElement(By.xpath("//a[@title='home page']")).click();
	String current_url= driver.getCurrentUrl();
	String target_url="http://10.9.17.252:7001/spring-petclinic/admin1";
	Assert.assertEquals(current_url, target_url);
  }
  @Test(groups = { "uat", "smoke" })
  public void admin3() {
    System.out.println("-----admin3 start");
	System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.9.17.252:7001/spring-petclinic/");
	driver.findElement(By.xpath("//a[@title='home page']")).click();
	String current_url= driver.getCurrentUrl();
	String target_url="http://10.9.17.252:7001/spring-petclinic/admin2";
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
    System.out.println("-----Admin Test Start-----");
  }

  @AfterTest(groups = { "must"})
  public void afterTest() {
    System.out.println("-----Admin Test Finish-----");
  }

}
