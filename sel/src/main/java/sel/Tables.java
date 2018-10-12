package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
WebDriver driver = new FirefoxDriver();

		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20828/nep-vs-oman-2nd-match-asia-cup-qualifier-2018");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
System.out.println("total count is:"+count);
for(int i=0;i<count-2;i++)
{
	String values=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	System.out.println(values);
	int valueinteger=Integer.parseInt(values);
	 sum=sum+valueinteger;
	 System.out.println("sum is:"+sum);
	
	
}
String Extras=table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
String Total=table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
System.out.println(Extras);
int noofExtras=Integer.parseInt(Extras);
System.out.println(Total);
int totalnoofruns=sum+noofExtras;
System.out.println("totalnoofruns is:"+totalnoofruns);

	}

	

}
