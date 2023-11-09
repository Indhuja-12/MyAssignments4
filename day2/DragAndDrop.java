package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public  void DragAndDrop()
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement drag = driver.findElement(By.id("form:conpnl_header"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 100, 200).perform();
		System.out.println("drag:"+" "+drag.getLocation().getX());
		WebElement drag1 = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement drop = driver.findElement(By.id("form:conpnl_header"));
		Actions builder1=new Actions(driver);
		builder1.dragAndDrop(drag1, drop).perform();
		System.out.println("drag and drop:"+" "+drag1.getLocation().getX());
		
		
		
	}

}
