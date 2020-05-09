package locators;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;

public class Locators {
  driver.findElement(By.xpath("//*[@id='header-search-field']")).sendKeys("Web Development",Keys.RETURN);
	
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div/div/div/ul/li[1]/a/span")).click();                                                                                                                               
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,400)");
	driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div[1]/button[1]")).click();

}
