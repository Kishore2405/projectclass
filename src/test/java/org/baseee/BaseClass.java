package org.baseee;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	  public static WebDriver driver;
	  
	  public static WebDriver browserlaunch(String browsername) {
		
		  switch(browsername) {
		  
		  case "chrome":
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
			  break;
		  case "edge":
			  WebDriverManager.edgedriver().setup();
			  driver=new EdgeDriver();
			  break;
			  
		  }
         return driver;
	}
	  
	   public static void urllaunch(String url) {
		   driver.get(url);

	}
	 
	   public static String getCurrenturl() {
		 String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		   
	}
	   
	   public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	   
	   public static void quit() {
		   driver.quit();

	}
	   
	   public static void close() {
		driver.close();

	}
	   
	   public static void sendkeys(WebElement e,String data) {
		  e.sendKeys(data);

	}
	   
	   public static void click(WebElement e) {
		e.click();

	}
	  
	   public static void maximize() {
		driver.manage().window().maximize();

	}
	   
	   
	   public static void implicitlyWait(int sec) {
		  driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		  
	}
	   
	   public static String getText(WebElement e) {
		String text = e.getText();
		return text;

	}
	  
	   public static String getAttribute(WebElement e) {
		 String text = e.getAttribute("value");
		 return text;
		  
	}
	   
	   public static void moveToElement(WebElement target) {
		 Actions a=new Actions(driver);
		 a.moveToElement(target).perform();

	}
	   
	   public static void dragAndDrop(WebElement src,WebElement des) {
		   Actions a=new Actions(driver);
		   a.dragAndDrop(src, des).perform();
		   
	}
	   
	   public static  void clickAndHold(WebElement target) {
		   Actions a=new Actions(driver);
		   a.clickAndHold(target).perform();
           
	}
	   
	   public static void contextClick(WebElement target) {
		   Actions a=new Actions(driver);
		   a.contextClick(target).perform();
		   
	}
	   
	   public static void doubleClick(WebElement target) {
		   Actions a=new Actions(driver);
           a.doubleClick(target).perform();
           
	}
	   public static  void release(WebElement target) {
		   Actions a=new Actions(driver);
		   a.release(target).perform();
	}
	   
	   
//	   public static void takeScreenshot(WebElement e) {
//		   TakesScreenshot tk=new (TakesScreenshot)driver;
//		   File screenshotAs = e.getScreenshotAs(OutputType.FILE);
//		   
//	}
	   
	   
	   
	   public static void selectByIndex(WebElement dropdown,int index) {
	        Select s=new Select(dropdown);
	        s.selectByIndex(index);

	}
	   
	   public static void selectByValue(WebElement dropdown,String value ) {
		   Select s=new Select(dropdown);
           s.selectByValue(value);
           
	}
	  
	   public static void selectByvisibleText(WebElement dropdown,String visibleText) {
		   Select s=new Select(dropdown);
		   s.selectByVisibleText(visibleText);

	}
	   
	   public static void frameByIndex(int index) {
		driver.switchTo().frame(index);
		
	}
	   
	   public static void frameById(String id) {
		driver.switchTo().frame(id);
		
	}
	   
	   
		

	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	     
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
	  
	  
	  


