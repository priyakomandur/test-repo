	package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Paytmframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://paytm.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
		driver.switchTo().frame(driver.findElement(By.id("main-container")));
		driver.switchTo().frame(driver.findElement(By.id("login-container")));
		driver.findElement(By.id("input_0")).click();

	}

}
