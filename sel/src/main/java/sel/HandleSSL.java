package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//general profile chrome setting
DesiredCapabilities dc=DesiredCapabilities.chrome();
dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//local browser setting through chromeoptions
ChromeOptions c=new ChromeOptions();
c.merge(dc);

WebDriver driver=new ChromeDriver(c);
driver.get("");
	}

}
