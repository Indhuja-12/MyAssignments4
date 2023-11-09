package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroungWindowHandles {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>lstwindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstwindow.get(1));
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.switchTo().window(lstwindow.get(0));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String>lstwindow1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(lstwindow1.get(1));
		driver.switchTo().window(lstwindow.get(0));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>lstwindow2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(lstwindow2.get(1));
		driver.switchTo().window(lstwindow.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String>lstwindow3=new ArrayList<String>(windowHandles3);
		driver.switchTo().window(lstwindow3.get(1));
		driver.switchTo().window(lstwindow.get(0));
	
	}

}
