package makemytrip;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Script {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//a[text()='flights']")).click();
		driver.findElement(By.xpath("//label[text()='one way']")).click();
		WebElement from=driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']"));
		from.click();
//		Select select=new Select(from);
//		select.selectByIndex(2);
		Actions actions=new Actions(driver);

		WebElement hyd=driver.findElement(By.xpath("(//span[contains(text(),'Hyderabad')])[1]"));
		actions.moveToElement(hyd).click().perform();
		Thread.sleep(1000);
		WebElement bang=driver.findElement(By.xpath("( //span[contains(text(),'Bangalore')])[2]"));
		actions.moveToElement(bang).click().perform();
		Thread.sleep(1000);
		String  ldate=LocalDate.now().plusDays(2).toString().split("-")[2];
		String tmr="";
		if(Integer.parseInt(ldate)<10){
			tmr=ldate.substring(1);
		}
		else
		tmr=ldate;	
		System.out.println(tmr);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='"+tmr+"'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@mt-id='PassCount']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='adult_counter']/li[text()='1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='child_counter']/li[text()='1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='infant_counter']/li[text()='1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Done'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@mt-id='class']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Business']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Search' and @id='searchBtn']")).click();
		Thread.sleep(1000);
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs("Flight Search"));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='9W-456']/../..//div[7]")).click();
		
		
	}

}
