package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame
{
public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/frame.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	String inside = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
	System.out.println(inside);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(2);
	WebElement findElement = driver.findElement(By.xpath("//iframe[@id='frame2']"));
	driver.switchTo().frame(findElement);
	driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	driver.switchTo().parentFrame();
	//String nestedInside = driver.findElement(By.xpath("(//button[@id='Click'])[3]")).getText();
	//System.out.println(nestedInside);
	}
}