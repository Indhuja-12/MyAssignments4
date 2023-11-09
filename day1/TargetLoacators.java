package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetLoacators {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		String text1 = driver.findElement(By.id("result")).getText();
		System.out.println(text1);
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("TestLeaf");
		alert2.accept();
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text2);
		
	}

}
