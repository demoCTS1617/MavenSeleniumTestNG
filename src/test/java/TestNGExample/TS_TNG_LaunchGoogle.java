package TestNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_TNG_LaunchGoogle {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();

		// Launch Google
		driver.get("https://www.google.com/");

		// Maxi Browser
		driver.manage().window().maximize();
	}

	@Test
	public void verifytitle() throws InterruptedException {

		// title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);

		// verify title
		if (title.equalsIgnoreCase("google")) {
			System.out.println("Title is matched");
		} else {
			System.out.println("Title is mismatched");
		}
		// pause
		Thread.sleep(2000);

	}

	@AfterTest
	public void teardown() {
		// close - single instance
		driver.close();
	}
}
