package sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
boolean month=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/span[1]")).getText().contains("October");
while(!month)
{
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a")).click();
	break;
}
int count=driver.findElements(By.xpath("/html/body/div[2]/div[1]")).size();
for(int i=0;i<count;i++)
{
	String text=driver.findElements(By.xpath("/html/body/div[2]/div[1]")).get(i).getText();
	if(text.equals("23"))
	{
		driver.findElements(By.xpath("/html/body/div[2]/div[1]")).get(i).click();
	}
}

	}
	}


