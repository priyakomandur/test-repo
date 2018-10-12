package sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		int count=driver.findElements(By.cssSelector("label.guestlbl")).size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			driver.findElements(By.id("hrefIncAdt")).get(i).click();
			driver.findElements(By.id("hrefIncChd")).get(i).click();
			driver.findElements(By.id("hrefIncInf")).get(i).click();
			break;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		boolean enabled=driver.findElement(By.xpath("//*[@value='OneWay']")).isEnabled();
		System.out.println(enabled);
		driver.findElement(By.xpath("//*[@value='RoundTrip']")).click();
		driver.findElement(By.xpath("//*[@value='Departure City']")).click();
		
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		
	driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
	
	
		
	}

}
