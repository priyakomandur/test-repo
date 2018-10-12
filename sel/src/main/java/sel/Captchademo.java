package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Captchademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.finalwebsites.com/demosnew/custom-captcha-image-script/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("textarea[class='form-control']")).click();
		driver.findElement(By.cssSelector("textarea[class='form-control']")).sendKeys("captcha test");
		int number=switchframeutility(driver,By.cssSelector("div.recaptcha-checkbox-checkmark"));
		
		driver.switchTo().frame(number);
		driver.findElement(By.cssSelector("div.recaptcha-checkbox-checkmark")).click();
		int number2=switchframeutility(driver,By.cssSelector("#recaptcha-verify-button"));
		driver.switchTo().frame(number2);
		driver.findElement(By.cssSelector("#recaptcha-verify-button")).click();

	}
	
	public static int switchframeutility(WebDriver driver,By by)
	{
		int totalframes=driver.findElements(By.tagName("iframe")).size();
		System.out.println("totalframes is:"+totalframes);
		int i;
		for(i=0;i<totalframes;i++)
		{
			driver.switchTo().frame(i);
			int count=driver.findElements(by).size();
			
			if(count!=0)
			{
				driver.findElement(by).click();
				break;
			}
			else
			{
				System.out.println("continue looping");
				
				
			}
			
		}
		driver.switchTo().defaultContent();
		return i;
	}

}
