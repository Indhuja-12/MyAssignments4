package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(Men).perform();
		driver.findElement(By.xpath("(//ul[@class='desktop-navBlock']/li/a[text()='Jackets'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
