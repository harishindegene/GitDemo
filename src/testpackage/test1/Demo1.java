package testpackage.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {

	
	@Test
	
	public void openbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\My Files\\Softwares & Files\\chromedriver_win32_1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tricentis.com/");
		driver.manage().window().maximize();
		driver.close();
		
		System.out.println("Testing git");

	

}
}
