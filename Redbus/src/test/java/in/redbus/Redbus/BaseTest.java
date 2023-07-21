package in.redbus.Redbus;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.chrome.ChromeOptions;
    import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class BaseTest {
	    private WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");//Turning off the notification
	        // Initialize WebDriver
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testRedbusBooking() throws InterruptedException {
	        driver.get("https://www.redbus.in/");
	        driver.findElement(By.id("src")).sendKeys("Bengaluru");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//li[@class='selected']")).click();
	        driver.findElement(By.id("dest")).sendKeys("Kolkata");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//li[@class='selected']")).click();
	        driver.findElement(By.xpath("//td[text()='15']")).click();

	     
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


