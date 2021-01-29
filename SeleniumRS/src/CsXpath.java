import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsXpath {
	
	public static void main(String[] main)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.life360.com/circles/#/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("2085551032");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("lie360");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//h1[contains(@class='ng-binding')]")).getText());

	}

}
