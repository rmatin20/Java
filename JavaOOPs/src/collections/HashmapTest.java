package collections; //Naveen Automation

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HashmapTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Test\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.freecrm.com");
		System.out.println("page displayed successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String adminCredentials = HashMapInfo.getUserLoginInfo().get("admin");//HashMapInfo is static, so you can access their methods
		String adminInfo [] = adminCredentials.split("_");
		
		driver.findElement(By.name("username")).sendKeys(adminInfo[0]);
		driver.findElement(By.name("password")).sendKeys(adminInfo[1]);

		WebElement loginBtn = driver.findElement(By.xpath("//input[@type = 'submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

}
