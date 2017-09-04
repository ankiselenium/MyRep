package com.tnf.util;

import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IndexOfIframe {
public static void main(String[] args) {
	    WebDriver driver = new InternetExplorerDriver();
	    driver.get("http://inappdev02:8010/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//*[@id='_ctl0_ContentPlaceHolder1_txtLogin']")).sendKeys("rastogia");
	    driver.findElement(By.xpath("//*[@id='_ctl0_ContentPlaceHolder1_txtPassword']")).sendKeys("pass@123");
	    driver.findElement(By.xpath("//*[@id='_ctl0_ContentPlaceHolder1_btnSubmit']")).click();
	    driver.findElement(By.xpath("//*[@id='_ctl0_CreateLink']")).click();
	    

		//selenium.SelectFrame("//*[@id='_ctl0_ContentPlaceHolder1_RadEditor1Center']"); //Selecting the iframe
	    //selenium.Type("//html/body","Thank you"); //Inserting the text
	    //driver.findElement(By.xpath("//*[@id='_ctl0_ContentPlaceHolder1_RadEditor1Center']")).click();
	    //driver.findElement(By.xpath("//*[@id='_ctl0_ContentPlaceHolder1_RadEditor1Center']")).sendKeys("pass@123");
	    driver.findElement(By.id("_ctl0_ContentPlaceHolder1_RadEditor1Center")).sendKeys("Hello World!");
}
}




		/*int size = driver.findElements(By.tagName("iframe")).size();
	    for(int i=0; i<=size; i++){
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();}}}*/