package demo_pack_html;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Code {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http");
	
	WebElement wait = new FluentWait<WebDriver>(driver).withTimeout(20,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
	wait.click();
	
	}

}
