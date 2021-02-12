package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	private WebDriver driver;

	// private Common common = new Common(driver);

	private By searchIcons = By.cssSelector("a.landing-tickers__search span");
	private By searchField = By.cssSelector("input[placeholder='Search']");
	private By searchResults = By.cssSelector("td.symbol-cell");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSearchIcon() {
		driver.findElements(searchIcons).get(1).click();
		;
	}

	public void enterSearchText(String text) {
		driver.findElements(searchField).get(1).sendKeys(text);
	}

	public void clickResult(int resultNum) {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", driver.findElements(searchResults).get(resultNum - 1));

	}

}
