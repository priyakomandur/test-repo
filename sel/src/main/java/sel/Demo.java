package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		int size=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("the  size is:"+size);
		//WebElement iframe=driver.findElement(By.xpath("//*[@id='homepage']/div[5]/div[2]/div/div/div/span/div/div[1]/div/div/div"));
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		driver.switchTo().frame(driver.findElement(By.id("sumome-jquery-iframe")));
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/span/div/div[6]/div/div/button")).click();
		
		
}

	

}
