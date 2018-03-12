package makemytrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFromCityNAmes {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//a[text()='flights']")).click();
		driver.findElement(By.xpath("//label[text()='one way']")).click();
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).click();
		Thread.sleep(1000);
		List<WebElement> lst=driver.findElements(By.xpath("//input[@id='hp-widget__sfrom']|//span[contains(@class,'label')]"));
		for(WebElement ele:lst)
		{
			String text=ele.getText();
			System.out.println(text);
		}

}
}