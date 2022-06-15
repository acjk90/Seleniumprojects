package javaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitialTestCase {


	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//driver.close();*/
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String titleexpected ="Obsqura Testing";
		String titleactual = driver.getTitle();
		if(titleexpected.equals(titleactual)) {
			
			System.out.println("Test passed");
		}else {
			
			System.out.println("Testfailed");
		}

		driver.close();

	}

}

