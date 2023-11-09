package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//if the table is static follow these steps
		//step1:Find the table and store it in web element
		WebElement table = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table"));
		//step2:find the rows<tr> and store it 
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		System.out.println("rowCount"+rowCount.size());
		//step3:find the column<td> and store it 
		List<WebElement> columnCount = table.findElements(By.tagName("th"));
		System.out.println("columnCount"+columnCount.size());
		//to get specific values of row
		System.out.println(rowCount.get(2).getText());
		//to get specific values of column
		System.out.println(columnCount.get(3).getText());
		//to get particular data from the table
		String text = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr[3]/td[3]")).getText();
		System.out.println(text);
		//if the table is dynamic follow these steps
		//to print rows/columns,full table
		for (int i = 1; i <rowCount.size() ; i++) 
		{
			for (int j = 1; j <columnCount.size() ; j++) 
			{
			
			String country= driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr["+i+"]/td[2]")).getText();
			System.out.println(country);
		}
	}
		
		
		
		
		
		
		
	}
}
