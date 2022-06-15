package testngtest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class titleVerfication extends WebDriverManager {

WebDriver driver;
@Test(priority=1)
public void titlecheck() {
 // test case to verify title

String titleexpected ="Obsqura Testing";
String titleactual = driver.getTitle();

//Hard assert implemnattion
// Assert.assertEquals(titleactual, titleexpected);
// System.out.println("print after assert");

SoftAssert objassert = new SoftAssert();
objassert.assertEquals(titleactual, titleexpected);
System.out.println("print after assert");
objassert.assertAll();
}
 
  @Test(priority=2)
  public void urlCheck() {
 // test case to verify title
String urlexpected ="https://selenium.obsqurazone.com/index.php";
String urlactual = driver.getCurrentUrl();
if(urlexpected.equals(urlactual)) {

System.out.println("Test passed");
}else {

System.out.println("Testfailed");
}
}
 
  @BeforeTest
  public void beforeTest() {  
 this.driver =launchBrowser("firefox","https://selenium.obsqurazone.com/index.php");

  }

  @AfterTest
  public void afterTest() {
 
 driver.close();

  }

}
