package week4.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args){
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement table = driver.findElement(By.xpath("//div[@id='divTrainsList']/table"));
		//String text = driver.findElement(By.xpath("//div[@id='divTrainsList']/table//tr[1]/th[2]")).getText();
		//System.out.println(text);
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		List<WebElement> columnCount = table.findElements(By.tagName("th"));
		for (int i = 1; i < rowCount.size(); i++) 
		{
			String trainNames = driver.findElement(By.xpath("//div[@id='divTrainsList']/table//tr["+i+"]/td[2]")).getText();
			System.out.println(trainNames);
		}
		
}
}