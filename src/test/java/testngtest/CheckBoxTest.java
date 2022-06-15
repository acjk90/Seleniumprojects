package testngtest;

import org.testng.annotations.Test;

import utility.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CheckBoxTest extends WebDriverManager{
WebDriver driver;
  @Test

  
	  public void CheckboxDemo() throws InterruptedException {
			WebElement inputForm = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
			 inputForm.click();
			 Thread.sleep(3000);
			 
			 WebElement checkbox =driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[2]/a"));
		     checkbox.click();
		     Thread.sleep(3000);
		     
		     WebElement checkboxselect = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/label"));
		     checkboxselect.click();
		     Thread.sleep(3000);
		     
		     
		    WebElement Showmessage = driver.findElement(By.id("message-one"));
		    String message1 =Showmessage.getText();
		    Thread.sleep(3000);
		    String outputmsg="Success - Check box is checked";
		    
		    if((message1 ).contains(outputmsg)) {
		    	Assert.assertTrue(true);
		    }
		    else {
		    	Assert.assertTrue(false,"check box selection failed");
		    }
		    
		
		}
  
  @BeforeTest
  public void beforeTest() {
	  this.driver=launchBrowser("chrome","https://selenium.obsqurazone.com/index.php");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
