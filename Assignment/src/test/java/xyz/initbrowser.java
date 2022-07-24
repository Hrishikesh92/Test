package xyz;

import org.openqa.selenium.firefox.FirefoxDriver;

import ABC.Test1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class initbrowser extends Test1 {
	 String url="https://www.wikipedia.org/";
	 String url1="https://www.imdb.com/";
	
	public void init() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		d= new FirefoxDriver();
		d.manage().window().maximize();
		Thread.sleep(10000);
	}
}
