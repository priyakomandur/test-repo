package sel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.weather.com");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement term=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/footer/div/div/div/section[2]/div[1]/div/ul[1]/li[1]/a/strong")));
		term.click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>ids=driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String>iter=ids.iterator();
		
		while(iter.hasNext())
		{
			String child=iter.next();
			if(!parent.equals(child))
			{
				System.out.println(driver.switchTo().window(child).getTitle());
				//driver.close();
			}
		}
		System.out.println(driver.switchTo().window(parent));
	}
		
//		for(String winhandle:driver.getWindowHandles())
//		{
//			driver.switchTo().window(winhandle);
//		}
//		String child=driver.getWindowHandle();
//		System.out.println(driver.getTitle());
//		driver.close();
//		driver.switchTo().window(parent);
		
	

}
