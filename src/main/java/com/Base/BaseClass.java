package com.Base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	private static final Logger LOGGER=LogManager.getLogger(BaseClass.class);

	public static void browserLaunch(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static boolean deleteCookies() {

		driver.manage().deleteAllCookies();
		return true;
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	// Navigate//
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigate(String input) {
		if (input.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (input.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (input.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}

	public static void launchUrl(String Url) {
		driver.get(Url);
	}

	public static void elementClick(WebElement element) {
		element.click();
	}

	// sendkeys
	public static void Input(WebElement element, String input) {
		element.sendKeys(input);
	}

	// TakesScreenshot
	public static void takeScreenshot(String Filename) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Lenovo\\eclipse-workspace\\new workspace\\OrangeProject\\screenshot.png");

		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// WindowHandles
	public static void switchToWindow(int index) {
		Set<String> tabId_set = driver.getWindowHandles();
		List<String> tabId_list = new ArrayList<>(tabId_set);
		String tab_id = tabId_list.get(index);
		driver.switchTo().window(tabId_list.get(index));

	}

	// Dropdown
	public static void selectDropdown(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equals("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if (option.equals("value")) {
			s.selectByValue(value);
		} else if (option.equals("text")) {
			s.selectByVisibleText(value);
		} else if (option.equalsIgnoreCase("getfirstselectedoption")) {
			WebElement sop = s.getFirstSelectedOption();
			System.out.println("Text of Selected Option: " + sop.getText());
		}

		// getOptions
		else if (option.equalsIgnoreCase("getoptions")) {
			List<WebElement> op = s.getOptions();
			for (int i = 0; i < op.size(); i++) {
				String options = op.get(i).getText();
				System.out.println("GetOptions: " + options);
			}
		}

		// Is Multiple
		else if (option.equalsIgnoreCase("ismultiple")) {
			if (s.isMultiple()) {
				System.out.println("Multiple Selection Supported");
			} else {
				System.out.println("Multiple Selection Not Supported");
			}
		}

		// Get All Selected Options

		else if (option.equalsIgnoreCase("getallselectedoptions")) {
			List<WebElement> op = s.getAllSelectedOptions();
			for (int i = 0; i < op.size(); i++) {
				String options = op.get(i).getText();
				System.out.println("All Selected Options: " + options);
			}
		}

		else if (option.equalsIgnoreCase("deselectall")) {
			s.deselectAll();
		}
	}

	// Alert
	public static void alert(String value) {
		if (value.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (value.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		} else if (value.equalsIgnoreCase("getText"))
			;
		{
			System.out.println("Alert Text: " + driver.switchTo().alert().getText());
		}
	}

	public static void sendAlert(String input) {
		driver.switchTo().alert().sendKeys(input);
	}

	// Actions
	public static void actionWebElement(WebElement Element, String input) {

		Actions act = new Actions(driver);

		if (input.equalsIgnoreCase("click WebElement")) {
			act.click(Element).build().perform();
		}

		else if (input.equalsIgnoreCase("clickandhold WebElement")) {
			act.clickAndHold(Element).build().perform();
		} else if (input.equalsIgnoreCase("contextclick WebElement")) {
			act.contextClick(Element).build().perform();
		} else if (input.equalsIgnoreCase("doubleclick WebElement")) {
			act.doubleClick(Element).build().perform();
		} else if (input.equalsIgnoreCase("Move to Webelement")) {
			act.moveToElement(Element).build().perform();
		} else if (input.equalsIgnoreCase("Release on Webelement")) {
			act.release(Element).build().perform();
		}
	}

	// Actions
	public static void actionSimple(String input) {

		Actions as = new Actions(driver);

		if (input.equalsIgnoreCase("click")) {
			as.click().build().perform();
		} else if (input.equalsIgnoreCase("click and hold")) {
			as.clickAndHold().build().perform();
		} else if (input.equalsIgnoreCase("context click")) {
			as.contextClick().build().perform();
		} else if (input.equalsIgnoreCase("double click")) {
			as.doubleClick().build().perform();
		} else if (input.equalsIgnoreCase("Release")) {
			as.release().build().perform();
		}
	}

	// Frame
	public static void frameofInex(int index) {
		driver.switchTo().frame(index);
	}

	public static void frameIdorName(String IdorName) {
		driver.switchTo().frame(IdorName);
	}

	public static void frameWebelement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void defaultWindow() {
		driver.switchTo().defaultContent();
	}

	// Robot
	public static void robotClass(String input) throws Throwable {
		Robot r = new Robot();
		if (input.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
		} else if (input.equalsIgnoreCase("escape")) {
			r.keyPress(KeyEvent.VK_ESCAPE);
		} else if (input.equalsIgnoreCase("tab")) {
			r.keyPress(KeyEvent.VK_TAB);
		} else if (input.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
		} else if (input.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
		} else if (input.equalsIgnoreCase("pageup")) {
			r.keyPress(KeyEvent.VK_PAGE_UP);
		} else if (input.equalsIgnoreCase("pagedown")) {
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
		} else if (input.equalsIgnoreCase("cancel")) {
			r.keyPress(KeyEvent.VK_CANCEL);
		} else if (input.equalsIgnoreCase("window")) {
			r.keyPress(KeyEvent.VK_WINDOWS);
		} else if (input.equalsIgnoreCase("printscreen")) {
			r.keyPress(KeyEvent.VK_PRINTSCREEN);
		}
	}

	// Method For is Enabled

	public static void isEnabled(String input, String element) {

		if (input.equalsIgnoreCase("classname")) {
			boolean enable = driver.findElement(By.className(element)).isEnabled();
			System.out.println("Boolean Value: " + enable);
		}

		else if (input.equalsIgnoreCase("id")) {
			boolean enable = driver.findElement(By.id(element)).isEnabled();
			System.out.println("Boolean Value: " + enable);
		}

		else if (input.equalsIgnoreCase("cssselector")) {
			boolean enable = driver.findElement(By.cssSelector(element)).isEnabled();
			System.out.println("Boolean Value: " + enable);
		}

		else if (input.equalsIgnoreCase("xpath")) {
			boolean enable = driver.findElement(By.xpath(element)).isEnabled();
			System.out.println("Boolean Value: " + enable);
		} else if (input.equalsIgnoreCase("tagname")) {
			boolean enable = driver.findElement(By.tagName(element)).isEnabled();
			System.out.println("Boolean Value: " + enable);
		} else if (input.equalsIgnoreCase("name")) {
			boolean enable = driver.findElement(By.name(element)).isEnabled();
			System.out.println("Boolean Value: " + enable);
		}
	}
	// Method For is Displayed

	public static void isDisplayed(String input, String element) {

		if (input.equalsIgnoreCase("classname")) {
			boolean display = driver.findElement(By.className(element)).isDisplayed();
			System.out.println("Boolean Value: " + display);
		}

		else if (input.equalsIgnoreCase("id")) {
			boolean display = driver.findElement(By.id(element)).isDisplayed();
			System.out.println("Boolean Value: " + display);
		}

		else if (input.equalsIgnoreCase("cssselector")) {
			boolean display = driver.findElement(By.cssSelector(element)).isDisplayed();
			System.out.println("Boolean Value: " + display);
		}

		else if (input.equalsIgnoreCase("xpath")) {
			boolean display = driver.findElement(By.xpath(element)).isDisplayed();
			System.out.println("Boolean Value: " + display);
		} else if (input.equalsIgnoreCase("tagname")) {
			boolean display = driver.findElement(By.tagName(element)).isDisplayed();
			System.out.println("Boolean Value: " + display);
		} else if (input.equalsIgnoreCase("name")) {
			boolean display = driver.findElement(By.name(element)).isDisplayed();
			System.out.println("Boolean Value: " + display);
		}
	}

	// Method For is Selected

	public static void isSelected(String input, String element) {

		if (input.equalsIgnoreCase("classname")) {
			boolean selected = driver.findElement(By.className(element)).isSelected();
			System.out.println("Boolean Value: " + selected);
		}

		else if (input.equalsIgnoreCase("id")) {
			boolean selected = driver.findElement(By.id(element)).isSelected();
			System.out.println("Boolean Value: " + selected);
		}

		else if (input.equalsIgnoreCase("cssselector")) {
			boolean selected = driver.findElement(By.cssSelector(element)).isSelected();
			System.out.println("Boolean Value: " + selected);
		}

		else if (input.equalsIgnoreCase("xpath")) {
			boolean selected = driver.findElement(By.xpath(element)).isSelected();
			System.out.println("Boolean Value: " + selected);
		} else if (input.equalsIgnoreCase("tagname")) {
			boolean selected = driver.findElement(By.tagName(element)).isSelected();
			System.out.println("Boolean Value: " + selected);
		} else if (input.equalsIgnoreCase("name")) {
			boolean selected = driver.findElement(By.name(element)).isSelected();
			System.out.println("Boolean Value: " + selected);
		}
	}
	// get Title

	public static void getTitle() {
		System.out.println("Title : " + driver.getTitle());
	}

	// get Current URL

	public static void getCurrentUrl() {
		System.out.println("Current URL: " + driver.getCurrentUrl());
	}

	// get Text

	public static void getText(String input, String element) {
		if (input.equalsIgnoreCase("class")) {
			String GetText = driver.findElement(By.className(element)).getText();
			System.out.println("Text of Element:" + GetText);
		} else if (input.equalsIgnoreCase("id")) {
			String GetText = driver.findElement(By.id(element)).getText();
			System.out.println("Text of Element:" + GetText);
		}

		else if (input.equalsIgnoreCase("xpath")) {
			String GetText = driver.findElement(By.xpath(element)).getText();
			System.out.println("Text of Element:" + GetText + "\n");
		}

		else if (input.equalsIgnoreCase("class")) {
			String GetText = driver.findElement(By.className(element)).getText();
			System.out.println("Text of Element:" + GetText);
		}

		else if (input.equalsIgnoreCase("tagname")) {
			String GetText = driver.findElement(By.tagName(element)).getText();
			System.out.println("Text of Element:" + GetText);
		}

		else if (input.equalsIgnoreCase("cssselector")) {
			String GetText = driver.findElement(By.cssSelector(element)).getText();
			System.out.println("Text of Element:" + GetText);
		}
	}

	public static void scrolling(String input, int a) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (input.equalsIgnoreCase("scroll")) {
			js.executeScript("window.scrollBy(0," + a + ")");
		}
	}
	// SendKeys Method

	public static void locators(String input, String element, String sendkeys) {
		if (input.equalsIgnoreCase("id")) {
			driver.findElement(By.id(element)).sendKeys(sendkeys);
		} else if (input.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(element)).sendKeys(sendkeys);
		} else if (input.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(element)).sendKeys(sendkeys);
		} else if (input.equalsIgnoreCase("cssselector")) {
			driver.findElement(By.cssSelector(element)).sendKeys(sendkeys);
		}

		else if (input.equalsIgnoreCase("tagname")) {
			driver.findElement(By.tagName(element)).sendKeys(sendkeys);
		} else if (input.equalsIgnoreCase("name")) {
			driver.findElement(By.name(element)).sendKeys(sendkeys);
		} else if (input.equalsIgnoreCase("linktext")) {
			driver.findElement(By.linkText(element)).sendKeys(sendkeys);
		} else if (input.equalsIgnoreCase("partiallinktext")) {
			driver.findElement(By.partialLinkText(element)).sendKeys(sendkeys);
		}
	}

	// Clicking WebElement

	public static void Click(String input, String element) {
		if (input.equalsIgnoreCase("id")) {
			driver.findElement(By.id(element)).click();
		} else if (input.equalsIgnoreCase("class")) {
			driver.findElement(By.className(element)).click();
		} else if (input.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(element)).click();
		} else if (input.equalsIgnoreCase("cssselector")) {
			driver.findElement(By.cssSelector(element)).click();
		}

		else if (input.equalsIgnoreCase("tagname")) {
			driver.findElement(By.tagName(element)).click();
		} else if (input.equalsIgnoreCase("name")) {
			driver.findElement(By.name(element)).click();
		} else if (input.equalsIgnoreCase("linktext")) {
			driver.findElement(By.linkText(element)).click();
		} else if (input.equalsIgnoreCase("partiallinktext")) {
			driver.findElement(By.partialLinkText(element)).click();
		}
	}
}
