package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//step1: Launch https://www.snapdeal.com/
		driver.get(" https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//step2: Go to Mens Fashion
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='catText']"))).perform();
		//step3: Go to Sports Shoes
		driver.findElement(By.xpath("(//span[@class='linkTest'])[1]")).click();
		//step4:Get the count of the sports shoes
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println(count);
		//step5:Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		//step6:Sort by Low to High
		driver.findElement(By.className("sort-selected")).click();
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		//step8:Select the price range (900-1200)
		WebElement left = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll left-handle')]"));
		Thread.sleep(2000);
		action.dragAndDropBy(left,58,0).release().perform();
		WebElement right = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll right-handle')]"));
		Thread.sleep(1000);
		action.dragAndDropBy(right,-55, 0).release().perform();
		Thread.sleep(2000);
		WebElement range = driver.findElement(By.xpath("//input[@class='input-filter']"));
		range.clear();
		range.sendKeys("900");
		Thread.sleep(2000);
		WebElement range1 = driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
		range1.clear();
		range1.sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		//Mouse Hover on first resulting Training shoes
		WebElement element = driver.findElement(By.className("product-title"));
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		//click QuickView button
		driver.findElement(By.xpath("//div[contains(@class, 'center quick-view-bar' )]")).click();
		//Print the cost and the discount percentage
		String price = driver.findElement(By.className("payBlkBig")).getText();
		System.out.println(price);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println(discount);
		//Take the snapshot of the shoes.
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./snap/snapdeal.png");
		FileUtils.copyFile(source,target);
	
		
		
	}	
}
/*1. Launch https://www.snapdeal.com/
2. Go to Mens Fashion
3. Go to Sports Shoes
4. Get the count of the sports shoes
5. Click Training shoes
6. Sort by Low to High
7. Check if the items displayed are sorted correctly
8.Select the price range (900-1200)
9.Filter with color Navy 
10 verify the all applied filters 
11. Mouse Hover on first resulting Training shoes
12. click QuickView button
13. Print the cost and the discount percentage
14. Take the snapshot of the shoes.
15. Close the current window
16. Close the main window*/