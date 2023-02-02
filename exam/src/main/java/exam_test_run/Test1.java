package exam_test_run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

		ChromeDriver driver;
		
		
		public void open()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Documents\\Eclipse\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/v4/");
			driver.manage().window().maximize();
			
		}
		
		public void login()
		{
			WebElement usnm = driver.findElement(By.name("uid"));
			usnm.sendKeys("mngr474778");
			
			driver.findElement(By.name("password")).sendKeys("UmErAna");
			driver.findElement(By.name("btnLogin")).click();
			driver.findElement(By.linkText("New Customer")).click();
		}
		
		public void addcustomer()
		{
			driver.findElement(By.linkText("Edit Customer")).click();
			driver.findElement(By.linkText("New Customer")).click();
			driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("CDAC");
			driver.findElement(By.xpath("//input[@value='m']")).click();
			//html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]
			driver.findElement(By.name("dob")).sendKeys("20/08/1996");
			driver.findElement(By.name("addr")).sendKeys("Complex name");
			driver.findElement(By.name("city")).sendKeys("Mumbai");
			driver.findElement(By.name("state")).sendKeys("maharashtra");
			driver.findElement(By.name("pinno")).sendKeys("4332233");
			driver.findElement(By.name("telephoneno")).sendKeys("8451920040");
			driver.findElement(By.name("emailid")).sendKeys("ancti@saa.com");
			driver.findElement(By.name("password")).sendKeys("pr@123");
			driver.findElement(By.name("sub")).click();
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Test1 o = new Test1();
			o.open();
			o.login();
			o.addcustomer();
		}

	}

