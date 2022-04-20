package Mindtree.Assignment1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Driver Object from chrome browser.
		//invoke chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//hit the url.
		driver.get("http://google.com");
		
		//vaidate the title page is corrrect
       System.out.println(driver.getTitle());
	    
       //validate to landed on current url.
       System.out.println(driver.getCurrentUrl());
       
       driver.navigate().to("https://www.amazon.in/");
       
       //search box id element
       //tagName[@attribute='value']
       driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("refrigerators");
       
       //click on submit button icon magnifite glass.
       driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
       
     //retrive the data title listed over refregarator (i retrive as the third data in listed). 
       String r1=driver.findElement(By.xpath("//a[contains(@href,'Whirlpool-Refrigerator-WDE-205-CLS')]//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
       
       
       String r2=driver.findElement(By.xpath("//a[contains(@href,'Whirlpool-Refrigerator-WDE-205-CLS')]//span[@class='a-price-whole']")).getText();
       

       
       //printing the title.
       System.out.println(r1);
       System.out.println(r2);
       
       driver.findElement(By.xpath("//a[contains(@href,'Whirlpool-Refrigerator-WDE-205-CLS')]")).click();
       
       String parenthandle=driver.getWindowHandle();
       //System.out.println(parenthandle);
       Set<String> handles=driver.getWindowHandles();
       for(String handle: handles)
       {
    	   System.out.println(handle);
    	   if(!handle.equals(parenthandle))
    	   {
    		   driver.switchTo().window(handle);
    		   String p2=driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']//span[@aria-hidden='true']")).getText();
    		   System.out.println(p2.substring(1));
    	   }
       }
       
       
       
       System.out.println("Pass");
	}

}
