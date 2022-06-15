package testngtest;

import org.testng.annotations.Test;

import excel.ExelCodeInstance;
import pagefactory.HomePage;
import utility.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TextVerify extends WebDriverManager{
WebDriver driver;
ExelCodeInstance object ;

  @Test(priority=1,enabled=true)
  public void CheckText() throws InterruptedException {
	  String expected = object.readData(0,1);

 /*WebElement inputForm = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
 inputForm.click();
 Thread.sleep(3000);
 WebElement enterMessage = driver.findElement(By.xpath("//*[@id=\"single-input-field\"]"));
 enterMessage.sendKeys("hello");*/
	 
	  HomePage objhome = new HomePage(driver);
	  	  objhome.inputform.click();
	  	  Thread.sleep(3000);
	  	  objhome.enterMessage.sendKeys(expected);

 Thread.sleep(3000);
 WebElement showMessage = driver.findElement(By.xpath("//*[@id=\"button-one\"]"));
 showMessage.click();
 Thread.sleep(3000);
 WebElement appltext = driver.findElement(By.xpath("//*[@id=\"message-one\"]"));
 String apptextvalue = appltext.getText();
 if(apptextvalue.contains(expected)) {
 Assert.assertTrue(true);
 }else {
 Assert.assertTrue(false, "text value comparison failed");
 }
  }
  @Test(priority=2,enabled=true)
  public void addition() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement enterValueA = driver.findElement(By.xpath("//*[@id=\"value-a\"]"));
	  int a=25;
	  enterValueA.sendKeys(String.valueOf(a));
	  Thread.sleep(3000);
	  
	  WebElement enterValueB = driver.findElement(By.xpath("//*[@id=\"value-b\"]"));
	  int b=32;
	  enterValueB.sendKeys(String.valueOf(b));
	  Thread.sleep(3000);
	  
	  WebElement getTotal = driver.findElement(By.xpath("//*[@id=\"button-two\"]"));
	  getTotal.click();
	  Thread.sleep(3000);
	  
	  WebElement addValue = driver.findElement(By.xpath("//*[@id=\"message-two\"]"));
	  String result = addValue.getText();
	  int output = a+b;
	  
	  if((result).contains(String.valueOf(output))){
		  Assert.assertTrue(true); 
	 
  } else{ 
	  Assert.assertTrue(false, "Result value is not same");
      }
		  
	  }
	  
	  
 
  @BeforeTest
  public void beforeTest() throws IOException {  
 
 this.driver =launchBrowser("chrome","https://selenium.obsqurazone.com/index.php");
 object =new ExelCodeInstance();

  }

  @AfterTest
  public void afterTest() {
 
 driver.close();

  }

}
