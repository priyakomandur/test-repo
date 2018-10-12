package sel;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		//1.count of links in web page
		//2.count of links only in footer section
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		System.out.println("links in complete page in the website");
		System.out.println(driver.findElements(By.tagName("a")).size());
		System.out.println("links only in the footer of the page");
		WebElement footerdriver=driver.findElement(By.id("navFooter"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3.count of links only in first column of footer
		WebElement columndriver=footerdriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div[1]"));
		int count=columndriver.findElements(By.tagName("a")).size();
		System.out.println(count);
		
		//4.click on every link in the footer column
		
		for(int i=0;i<count;i++)
		{
			String clickontab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
			
		
		}
		Set<String>allwindows=driver.getWindowHandles();
		Iterator<String>iter=allwindows.iterator();
	while(iter.hasNext())
	{
		
		System.out.println(driver.switchTo().window(iter.next()).getTitle());
	}
		
		
	}
}
	

