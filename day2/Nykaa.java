package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='brands']"))).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'oreal Paris");
		driver.findElement(By.xpath("//a[contains(text(),'Oréal Paris')]")).click();
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("Title contains L'Oreal Paris" );
		}
			else
			{
				System.out.println("Title does not contain L'Oreal Paris" );
			}
			driver.findElement(By.xpath("//span[@class='sort-name']")).click();
			driver.findElement(By.xpath("//span[text()='customer top rated']/following::div")).click();
			driver.findElement(By.xpath("//span[text()='Category']")).click();
			driver.findElement(By.xpath("//span[text()='Hair']")).click();
			driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
			driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		}
		

	}


