package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://amazon.com");
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
Actions action=new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-prime']/span[2]"))).build().perform();
action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("household").build().perform();
	}

}
