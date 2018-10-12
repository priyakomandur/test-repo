package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AvoidStaleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//stale element exception occurs when there is no element in DOM or element is deleted. To catch this exception we can write below code
		WebDriver driver=new FirefoxDriver();
	}
		public boolean  catchstale(WebDriver driver,By by)
		
		{
			int attempts=0;
			boolean result=false;
			while(attempts<2)
			try
			{
			driver.findElement(by).click();
			result=true;
			break;
			}
			catch(Exception e)
			{
				
			}
			attempts++;
			return result;
		}
		
		
		
	}

	
	

