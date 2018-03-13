package AllLinkCount;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class All_linkCountOnPage {
@Test
public void alllinkCount(){
	
	System.setProperty("webdriver.gecko.driver", "D:\\All_Driver\\geckodriver.exe");
	FirefoxDriver fd=new FirefoxDriver();
	fd.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	fd.navigate().to("https://www.amazon.com");
	//fd.manage().window().maximize();
	List<WebElement> AllLink=fd.findElements(By.tagName("a"));
	System.out.println("Total number of link is "+AllLink.size());
	WebElement fifthlink=AllLink.get(1);
	System.out.println("The fifth link is: " + fifthlink.getText());
	
	/*for (int i=0; i<AllLink.size(); i++){
		System.out.println(AllLink.get(i).getText()+"-----------"+AllLink.get(i).isDisplayed());
	}*/
	
	
	fd.quit();

}
}
