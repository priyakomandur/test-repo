package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		
driver.get("http://amazon.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[@id='nav-link-shopall']/span[2]")).click();
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
driver.findElement(By.xpath("//div[@class='fsdDeptCol']/a[5]")).click();
driver.close();
	}

}
