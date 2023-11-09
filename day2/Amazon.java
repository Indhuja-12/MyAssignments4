package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		String price = driver.findElement(By.xpath("(//span[text()='61,999'])[1]")).getText();
		System.out.println("price:"+" "+price);
		String ratings = driver.findElement(By.xpath("(//span[text()='4,449'])[2]")).getText();
		System.out.println("ratings:"+" "+ratings);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./snap/amazon.png");
		FileUtils.copyFile(source,target);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
		String subtotal = driver.findElement(By.xpath("(//span[text()='₹61,999.00'])[6]")).getText();
		System.out.println("subtotal:"+" "+subtotal);
		if(price==subtotal)
				 {
					System.out.println("The price is match");
				 }
		else
				{
					System.out.println("The price is not match");
				}
		driver.quit();
	}

}
