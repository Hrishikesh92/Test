package xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 extends ABC.Test1{
		public String country, country1;
		public String date, date1;
		@BeforeTest
		public void initialize(String url) throws InterruptedException {
			d.get(url);
			d.manage().window().maximize();
			Thread.sleep(10000);
		}
		@Test(priority=1)
		public void date() {
			d.findElement(By.xpath("//*[@id=\"react-autowhatever-1--item-0\"]/a/div[2]/div[1]")).click();
			String date1=rdate.getText();
			System.out.println("Release Date: "+date1);
		}
		@Test(priority=2)
		public void country() {
			String country1=rcountry1.getText();
			System.out.println("Country: "+country1);
		}
		
		@Test(priority=3)
		public void verify_country() {
			boolean country_verify= country.equals(country1);
			boolean date_verify=date.equals(date1);
			Assert.assertTrue(country_verify);
			Assert.assertTrue(date_verify);
			}
		
	}




	

