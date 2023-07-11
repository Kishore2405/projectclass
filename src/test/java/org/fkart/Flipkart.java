package org.fkart;

import java.util.Collection;
import java.util.List;

import org.baseee.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Flipkart extends BaseClass {
	
	public static void main(String[] args) {
		
		
		browserlaunch("chrome");
		
		urllaunch("https://www.flipkart.com/");
		
		maximize();
		
		implicitlyWait(10);
		
		WebElement clsbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clsbtn.click();
		
		WebElement srcbox = driver.findElement(By.name("q"));
		srcbox.sendKeys("iphone");
		
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		
		System.out.println("----Mobile Model List-----");
		
		List<WebElement> mblname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		for(WebElement m:mblname) {
			
			String text = m.getText();
			System.out.println(text);
			
			
		}
		
		
		System.out.println("----Mobile Price----");
		
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for(WebElement p:price) {
			
			String text = p.getText();
			System.out.println(text);
			
		}
		
	   
	   
	   
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
