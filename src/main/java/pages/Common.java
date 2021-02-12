package pages;

import org.openqa.selenium.WebDriver;

public class Common {
	
	private WebDriver driver;
	
	
	
	public Common(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	
	
	

}
