package TestngParalleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleltest1 {

	
	public WebDriver driver;
	@Parameters("mybrowser")
	@BeforeClass
	public void launchBrowser(String mybrowser){
		if(mybrowser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\All_Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		
			
		}else if (mybrowser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\All_Driver\\chromedriver.exe");
			driver=new ChromeDriver();
				
		}
		
	}
	
	
	
	
	
	@Test
	public void tc1(){
    driver.get("http://www.google.com.in");
    //driver.findElement(By.xpath(xpathExpression))
	
	}
	
	
	
	
	
	/*@Test
	public void tc2(){
		System.out.println("this is 2nd test case");
	
}
	@Test
	public void tc3(){
		System.out.println("this is3rd test case");
	}*/
}