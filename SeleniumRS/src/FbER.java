import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbER 
{
	public static void main(String[] main)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[contains(@name,'emai')]")).sendKeys("779986543");
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("lie360");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@class='_9ay7']")).getText());

	}

}



