package demoblaze.packages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TC_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\ChromeTest115\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		String name = opt.getBrowserName();
		System.out.println(name);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		//loginfumctions
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		String Logoutname = driver.findElement(By.id("logout2")).getText();
		System.out.println(Logoutname);
		//Nextpagefumctions
		driver.findElement(By.xpath("//*[@id=\"next2\"]")).click();
		String Nextpagename = driver.findElement(By.className("page-link")).getText();
		System.out.println(Nextpagename);
		
	
	
	}

}
