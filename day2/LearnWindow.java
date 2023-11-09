package week4.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List <String> lstWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstWindow.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(lstWindow.get(0));
		driver.close();
       
	}
}

