package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class a {

	private static Object textfield;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Step1:Navigate to the FitPeo Homepage:
		driver.get("https://www.fitpeo.com/");
		driver.manage().window().maximize();
		
		//step2:Navigate to the Revenue Calculator Page
		driver.navigate().to("https://www.fitpeo.com/revenue-calculator");
		Thread.sleep(2000);
		
		//step3:Scroll Down to the Slider section
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,360);"); //scroll down pixels
		
		
		//step4:Adjust the Slider:
		WebElement slider = driver.findElement(By.xpath("//input[@data-index='0']"));
	    Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 93, 0).perform();
		Thread.sleep(4000);
//		5. Update the Text Field:
		   driver.findElement(By.xpath("//input[contains(@aria-invalid,'false')]")).sendKeys("110");

		driver.quit();
		
	}

}
