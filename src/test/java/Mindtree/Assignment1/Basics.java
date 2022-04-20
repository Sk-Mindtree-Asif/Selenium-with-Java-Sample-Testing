package Mindtree.Assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class Basics {
        private static final String Assert = null;

		public static void main(String[] args)
        {
			
			//Chrome
        	
    		//Create Driver Object from chrome browser.
    		//invoke chrome browser
    		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
    		WebDriver driver1=new ChromeDriver();
    		//hit the url.
    		driver1.get("http://google.com");
    		
    		//vaidate the title page is corrrect
           System.out.println(driver1.getTitle());
    	    
           //validate to landed on current url.
           System.out.println(driver1.getCurrentUrl());
           
           //naviagte another url
           
           driver1.navigate().to("https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en_IN&gl=US");
           
   		  //vaidate the title page is corrrect
           String s1=driver1.getTitle();
           System.out.println(s1);
           
           
           
        	
        	
        	
        	//Fire Fox
        	
    		//Create Driver Object from firefox browser.
    		//invoke firefox browser
    		System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver.exe");
    		WebDriver driver2=new FirefoxDriver();
    		//hit the url.
    		driver2.get("http://google.com");
    		
    		//vaidate the title page is corrrect
           System.out.println(driver2.getTitle());
    	    
           //validate to landed on current url.
           System.out.println(driver2.getCurrentUrl());
           
           //naviagte another url
           
           driver2.navigate().to("https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en_IN&gl=US");
           
   		  //vaidate the title page is corrrect
           String s2=driver1.getTitle();
           System.out.println(s2);
           
           
           
           
        	
        	//Edge Browser
           
    		//Create Driver Object from edge browser.
    		//invoke edge browser
    		System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
    		WebDriver driver3=new EdgeDriver();
    		//hit the url.
    		driver3.get("http://google.com");
    		
    		//vaidate the title page is corrrect
           System.out.println(driver3.getTitle());
    	    
           //validate to landed on current url.
           System.out.println(driver3.getCurrentUrl());
           
           //naviagte another url
           
           driver3.navigate().to("https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en_IN&gl=US");
           
   		  //vaidate the title page is corrrect
           String s3=driver1.getTitle();
           System.out.println(s3);
           
           String Actual="Facebook – Apps on Google Play";
           
           if(s1.equals(Actual) && s2.equals(Actual) && s3.equals(Actual))
           {
        	   System.out.println("The test Cases is passed");
           }else
           {
        	   System.out.println("failed");
           }
           
          
        	
        }
}
