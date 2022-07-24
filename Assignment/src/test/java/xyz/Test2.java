package xyz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ABC.Test1;

public class Test2 extends Test1 {

	@BeforeTest
	public void initialize(String url1) throws InterruptedException {
		d.get(url1);
		d.manage().window().maximize();
		Thread.sleep(10000);
	}
	@Test(priority=0)
	public void film() throws InterruptedException {
		List<WebElement> ls1=d.findElements(By.xpath("//*[@id=\"typeahead-suggestions\"]/div/a/div[1]/h3"));
		for(WebElement l1: ls1) {
			String list1=l1.getText();
			System.out.println(list1);
		}
	}	
	@Test(priority=1)
	public void date() {
		d.findElement(By.xpath("//*[@id=\"typeahead-suggestions\"]/div/a[1]/div[1]/h3")).click();
		String date=release.getText();
		System.out.println("Release Date: "+date);
	}
	@Test(priority=2)
	public void country() {
		String country=rcountry.getText();
		System.out.println("Country: "+country);
	}
}


