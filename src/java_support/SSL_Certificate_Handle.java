package java_support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Certificate_Handle {
static WebDriver driver;
	public static void main(String[] args) {
		
    FirefoxProfile profile=new FirefoxProfile();
	profile.setAcceptUntrustedCertificates(false);
	driver=new FirefoxDriver(profile);
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
	driver=new ChromeDriver(cap);
	driver=new FirefoxDriver(cap);
	driver.switchTo().frame(driver.findElement(By.name("hrllo")));
	
	}

}
