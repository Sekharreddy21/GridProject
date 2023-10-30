package gridTest;

public class OrangeHRM 
{

	
	public static WebDriver driver;
	public static String url = "http://orangehrm.qedgetech.com";
	
	@BeforeSuite
	public static void launchApp()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);		
	}
	
	@AfterSuite
	public static void closeApp()
	{
		driver.close();
	}
	
	
}
