package sel;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("fromPlaceName")).click();
		driver.findElement(By.id("fromPlaceName")).sendKeys("hyd");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById('fromPlaceName').value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		//to select the element from autosuggestive box
		
		while(!text.equalsIgnoreCase("hyderabad"))
		{
					
					driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
					 text=(String) js.executeScript(script);
					System.out.println(text);
		}
		//int i=0;
		
		//to find that element is not present in the loop
		/*while(!text.equalsIgnoreCase("raj"))
{
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			 text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>5)
			{
				break;
			}
}
			if(i>5)
			
				{
				System.out.println("element not found");
				}*/
			}
}
		
		
	


