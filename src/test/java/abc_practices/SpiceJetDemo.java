package abc_practices;

//import org.junit.Assert;
import org.testng.Assert;
import org.apache.xpath.operations.Div;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SpiceJetDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/mokte/Utilities/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).getTagName());
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).is);
		
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).getAttribute("value").contains("Oneway"));
		driver.getWindowHandles();
		
//		s.selectByIndex(5);
		
		if(driver.getPageSource().contains("BOOK"))
			System.out.println("The test passed");
		else
			System.out.println("The test failed");
		
		Thread.sleep(2000);
		driver.close();
	

	}

}
