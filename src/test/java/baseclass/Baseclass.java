package baseclass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Baseclass {
	
		public static WebDriver driver;

		@BeforeMethod()
		public void set_up() {
			driver = new ChromeDriver();
			driver.get("https://practice.expandtesting.com/login");
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,700)");
		}

		public Baseclass(WebDriver driver) {
			Baseclass.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public Baseclass() {

		}

		@AfterMethod()
		public void Tear_down() {
			driver.close();
		}
}
