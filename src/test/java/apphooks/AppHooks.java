package apphooks;

import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

//import org.junit.Before;
//import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class AppHooks {

	private BaseDriver baseDriver;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	
	
	
	

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();

	}

	@Before(order = 1)
	public void launchBrowser() {
		baseDriver = new BaseDriver();
		System.out.println("Driver Used: " + prop.getProperty("browser"));
		driver = baseDriver.initDriver(prop.getProperty("browser"));
	}

	@After(order = 0)	
	public void driverQuit() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario sc)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		String screenShotFileName = sc.getName().replace(" ", "_");
		byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(sourcePath, "image/png", screenShotFileName);

		
		System.out.println("Project Folder: " + System.getProperty("user.dir"));
		
	}
	

}
