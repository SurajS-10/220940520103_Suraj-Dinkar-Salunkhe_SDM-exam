package exam_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class exam_220940520103 {
	ChromeDriver driver;
	
	String facebook = "https://www.facebook.com";
	
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj\\Documents\\Eclipse\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(facebook);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String Title=driver.getTitle();
		System.out.println("Title of page"+Title);
		String urlFromBrowser = driver.getCurrentUrl();
		System.out.println("URL of page"+urlFromBrowser);
	
	}
	
	public void signup()
	{
		driver.navigate().to("https://www.facebook.com/signup");
 
		driver.findElement(By.name("firstname")).sendKeys("Suraj");
		driver.findElement(By.name("lastname")).sendKeys("Salunkhe");
		driver.findElement(By.name("reg_email__")).sendKeys("8451920040");
		driver.findElement(By.id("password_step_input")).sendKeys("Suraj@123");
		
		Select selDate = new Select(driver.findElement(By.id("day")));
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
		
		selDate.selectByVisibleText("20");
		selMonth.selectByVisibleText("Aug");
		selYear.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		driver.navigate().back();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exam_220940520103 o = new exam_220940520103();
		o.open();
		o.signup();
	}

}


