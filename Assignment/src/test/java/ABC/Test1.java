package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	public static WebDriver d=null;
	
	public static WebElement rdate=d.findElement(By.xpath("(//div[contains(@class,'ipc-metadata-list-item__content-container')])[17]/ul/li/a"));
	public static WebElement rcountry=d.findElement(By.xpath("//table[contains(@class,'infobox vevent')]/tbody/tr[14]/td"));
	public static WebElement rcountry1=d.findElement(By.xpath("(//div[contains(@class,'ipc-metadata-list-item__content-container')])[18]/ul/li/a"));
	public static WebElement release=d.findElement(By.xpath("(//div[contains(@class,'plainlist')])[4]/ul/li"));

		
}
