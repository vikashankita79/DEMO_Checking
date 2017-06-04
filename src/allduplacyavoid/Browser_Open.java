package allduplacyavoid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class Browser_Open

{
	WebDriver driver;
	@BeforeClass
public void setUp()
{
driver=new FirefoxDriver();
driver.get("http://www.gmail.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
WebDriverWait wait=new WebDriverWait(driver,20);

//wait.until(Expected.Condition.);
}

public static void main(String args[])
{
	
	ToCheck_Modifier mod= new ToCheck_Modifier();
	
	
	
	
	
	
}







}
