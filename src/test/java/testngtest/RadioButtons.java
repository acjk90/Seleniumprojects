package testngtest;

import org.testng.annotations.Test;

import utility.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class RadioButtons extends WebDriverManager {
	WebDriver driver;
	  By inputform = By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a");
	  By radio = By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[3]/a");
	  By choice = By.xpath("//*[@id=\"inlineRadio1\"]");
	  By show = By.id("button-one");
	  By message = By.id("message-one");
  @Test(priority=1,enabled=true)
  
  
  public void RadiobuttonTest() throws InterruptedException, IOException {
		/*WebElement inputForm = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		 inputForm.click();
		 Thread.sleep(3000);
		 
		 WebElement radiobutton=driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[3]/a"));
		 radiobutton.click();
		 Thread.sleep(3000);
		 
		 WebElement option = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div[1]/label"));
		 option.click();
		 Thread.sleep(3000);
		 
		 WebElement value = driver.findElement(By.id("button-one"));
		 value.click();
		 Thread.sleep(3000);
		 
		 WebElement showMessage = driver.findElement(By.id("message-one"));
		String message2 = showMessage.getText();
		 Thread.sleep(3000);
		 String outputvalue="Success - Radio button 'Male' is checked";
		 */
	  click(inputform);
	  Screenshot();
	  click(radio);
	  click(choice);
	  click(show);
	  highlightelement(show);
	  Screenshot();
	  String exptxt = getText(message);
	  String acttxt = "Male";
	  
	  
		 /*if((message2).contains(outputvalue)) {
		 Assert.assertTrue(true);
		 }
         else{
	    	Assert.assertTrue(false,"No selection enabled");
		 
         }
  }
  */
	  if ((exptxt).contains(acttxt)) {
		  Assert.assertTrue(true);
		  } else {
		  Assert.assertTrue(false, "radio button selection failed");
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
