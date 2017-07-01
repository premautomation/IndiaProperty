
package LeadReportOptimized.LeadValidationOptimized;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import org.apache.bcel.classfile.Constant;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;

public class GenericWrappers2 extends ProjectWrapper implements Wrappers3 {

	public static String strLong;
	
	

	public static int a;
	public static String searchPageTitle;
	
	public static String localityInfoHomePage;
	public static String lead_details = "";
	
	public static String homePageTitle;
	WebDriverWait wait;
	
	RemoteWebDriver driver;
	int i = 1;
	String ids;
	List<WebElement> listings;
	String ListingsValue = "";
	String vdpUrl;

	String currentSystemDate;
	public static String listingid1;
	
	int j;
	String currentDate;

	ArrayList<String> str = new ArrayList<String>();
	ArrayList<String> dateInFreshEnqTable = new ArrayList<String>();
	
	ArrayList<String> str4 = new ArrayList<String>();
	
	ArrayList<String> strcombined= new ArrayList<String>();
	public static WebElement Popup1 =null;
	
	
	public static WebElement Popup2 =null;
	
	ArrayList<String> listingIdsInDuplicateEnqTable = new ArrayList<String>();
	
	ArrayList<String> listingIdCollection = new ArrayList<String>();
	ArrayList<String> dateInDuplicateEnqTable = new ArrayList<String>();

	ArrayList<String> enquiryTableDateCollection = new ArrayList<String>();
	ArrayList<String> str9 = new ArrayList<String>();
	ArrayList<String> str10 = new ArrayList<String>();
	
	
	

	
	
	public void invokeApp(String browser, String Url) {

		try {
					
		
		 
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
            
			driver = new ChromeDriver();
			
		
			test=extent.startTest("Browser Launch and IP Home Page Navigation");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			driver.get(Url);
			
			
			wait = new WebDriverWait(driver, 30);
			
			
			System.out.println("The browser " + browser + " is launched with URL " + Url);
			
		homePageTitle=driver.getTitle();
			
			System.out.println(homePageTitle);
			
			String expectedHomepageTitle="Property in India, Buy, Sell, Rent Properties, Real Estate India, Online Property Sites in India";
			
			
			if(homePageTitle.contains("Search Properties")){
			test.log(LogStatus.PASS, "Check whether user navigated to the Home Page", "User sucessfully land to the Home Page");
			
			
			String screenShotPath =Capturescreeshots.capture(driver,"HomePage-Pass");
			
		   test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
		    
		    
			
			
		
		    
			}
			
			else{
				
				test.log(LogStatus.FAIL, "Check whether user navigated to the Home Page", "User not logged to  the Home Page");
				
				
				
				String screenShotPath =Capturescreeshots.capture(driver,"HomePage-Fail");
				
				   test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				
				
			}
			
		
		} catch (WebDriverException e) {
			

			
			
			System.err.println("The Browser could not be found " + e.getMessage());
			
			
			throw new RuntimeException("FAILED");
			
			
		} catch (Exception e) {
			
			
			System.err.println("Unexpected exception occured in invokeApp() " + e.getMessage());
			

			throw new RuntimeException("FAILED");
			
		} 
		
		
		
		finally {
			takeSnap();
		}
	}

	
	
	public void enterById(String idValue, String data) {
		try {
		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idValue))).sendKeys(data);
	 		System.out.println("The value " + data + " is entered at element " + idValue);
			test.log(LogStatus.INFO, "User enter the following data in the form  " + " :  " +data);
			
			String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
		    
		     test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
			
			
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + idValue + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in entering value" + data
					+ " into element with id value : " + idValue + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}
	
	
	public void enterByIdAthenticate(String idValue, String data) {
		try {
		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idValue))).sendKeys(data);
	 		System.out.println("The value " + data + " is entered at element " + idValue);
			
			
			
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + idValue + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in entering value" + data
					+ " into element with id value : " + idValue + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	
	public void enterById4(String idValue, String data) {
		try {
			
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idValue))).sendKeys(data);
			System.out.println("The value " + data + " is entered at element " + idValue);
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + idValue + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in entering value" + data
					+ " into element with id value : " + idValue + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	

	public void enterById5(String idValue, String data) {
		try {
			
			
			
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idValue))).sendKeys(data);
			System.out.println("The value " + data + " is entered at element " + idValue);
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + idValue + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in entering value" + data
					+ " into element with id value : " + idValue + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}
	
	
	public void enterByIdCityEntryCityTextBox(String idValue, String data) {
		try {
			
			
			test=extent.startTest("Enter City Alangudi in the City Textbox");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idValue))).sendKeys(data);
			
			
			

			
			if(idValue.isEmpty())
			{
			   test.log(LogStatus.FAIL, "Check whether the user is able to enter the City Name in the City Textbox", "User not able to  enter the City Name in the City Textbox");
			   
				String screenShotPath = Capturescreeshots.capture(driver, "City-Name-Pass");
			    
			     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			}
			
			else{
			
				test.log(LogStatus.PASS, "Check whether the user is able to enter the City Name in the City Textbox", "User sucessfully enter the City Name Alangudi in the City Textbox");
				
			System.out.println("The value " + data + " is entered at element " + idValue);
			
			String screenShotPath = Capturescreeshots.capture(driver, "City-Name-Fail");
		    
		     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
			}
			
			
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + idValue + " doesn't exists " + e.getMessage());
			
			
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			
			
			
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in entering value" + data
					+ " into element with id value : " + idValue + "\n" + e.getMessage());
			
		
			
			
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}
	
	
	
	
	public void enterByName(String nameValue, String data) {
		try {
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(nameValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(nameValue))).sendKeys(data);
			System.out.println("The value " + data + " is entered at element " + nameValue);
		} catch (TimeoutException e) {
			System.err.println("The element with name :" + nameValue + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in entering value" + data
					+ " into element with Name value : " + nameValue + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	
	public void enterByXpath(String xpathValue, String data) {
		try {
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).sendKeys(data);
			System.out.println("The value " + data + " is entered at element " + xpathValue);
		} catch (TimeoutException e) {
			System.err.println("The element with xpath value :" + xpathValue + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in entering value" + data + " into element with Xpath : "
					+ xpathValue + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");

		}finally {
			takeSnap();
		}

	}

	
	public boolean verifyTitle1(String title) {
		try {
		
			if (wait.until(ExpectedConditions.titleIs(title))) {
				System.out.println("Actual Title is matched with expected title");
			} else {
				System.out.println("Actual Title doesnot matches with expected title");

			}
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in verifying title with expected tilte :" + title + " \n"
					+ e.getMessage());
			throw new RuntimeException("FAILED");

		} finally {
			takeSnap();
		}
		return true;

	}

	
	public void verifyTextById(String id, String text) {
		try {
			// wait = new WebDriverWait(driver, 30);
			if (wait.until(ExpectedConditions.textToBe(By.id(id), text))) {
				System.out.println("Actual text is matched with expected text");
			} else {
				System.out.println("Actual text doesnot matches with expected text");
			}
		} catch (TimeoutException e) {
			System.err.println("The element with id value: " + id + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in verifying Text " + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}

	}

	
	public void verifyTextByXpath(String xpath, String text) {
		try {
			
			if (wait.until(ExpectedConditions.textToBe(By.xpath(xpath), text))) {
				System.out.println("Actual text is matched with expected text");
			} else {
				System.out.println("Actual text doesnot matches with expected text");
			}
		} catch (TimeoutException e) {
			System.err.println("The element with xpath value : " + xpath + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println(
					"unexpected exception occured in verifying expected text with actual text " + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	
	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			// wait = new WebDriverWait(driver, 30);
			if (wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpath), text))) {
				System.out.println("The Actual text contains the provided text");
			} else {
				System.out.println("The Actual text doesn't contains the provided text");
			}
		} catch (TimeoutException e) {
			System.err.println("The element with xpath value :" + xpath + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println(
					"unexpected exception occured in verifying  actual text contains expected text " + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	
	public void verifyTextContainsById(String id, String text) {
		try {
			
			if (wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id(id), text))) {
				System.out.println("The Actual text contains the provided the text");
			} else {
				System.out.println("The Actual text doesn't contains the provided the text");
			}
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + id + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in verifying Text contains :" + text + " in webElement by id :"
					+ id + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}

	}

	
	public void clickById2(String id) throws InterruptedException {
		try {
			
			
			wait.until(ExpectedConditions.elementToBeClickable((By.id(id)))).click();
			System.out.println("Element clicked successfully");
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + id + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by id :" + id + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
		
		 Thread.sleep(3000);
	}
	
	public void clickById(String id) {
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable((By.id(id)))).click();
			System.out.println("Element clicked successfully");
			
			test.log(LogStatus.INFO, "User Sucessfully click/submit the form");
			
			String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
		    
		     test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + id + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by id :" + id + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}
	
	
	public void clickById1(String id) throws InterruptedException {
		try {
			
		
			wait.until(ExpectedConditions.elementToBeClickable((By.id(id)))).click();
			System.out.println("Element clicked successfully");
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + id + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by id :" + id + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
		
		Thread.sleep(10000);
	}

	
	
	public void clickByIdHomePageSearchButton(String id) {
		try {
			
			test=extent.startTest("Landing to Alangudi Search Page ");
			
			
			wait.until(ExpectedConditions.elementToBeClickable((By.id(id)))).click();
			
			Thread.sleep(3000);
			searchPageTitle=driver.getTitle();
			
			System.out.println(searchPageTitle);
			
			String expectedsearchPageTitle="Buy All Residential in Alangudi";
			
			if(searchPageTitle.contains(expectedsearchPageTitle)){
				
				test.log(LogStatus.PASS, "Check whether user navigated to the search page", "User Sucessfully Land to the Alangudi Search Page");
				
				test.log(LogStatus.INFO, "Search Page Title"+"  "+searchPageTitle);
				
				Thread.sleep(3000);
				
				String screenShotPath = Capturescreeshots.capture(driver, "SearchButton-Pass");
			    
			     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			}
			else{
	
				test.log(LogStatus.FAIL, "Check whether user navigated to the search page", "User unable to  Land to the Alangudi Search Page");
	
				test.log(LogStatus.INFO, "Search Page Title"+searchPageTitle);
				
				
				Thread.sleep(3000);

			String screenShotPath = Capturescreeshots.capture(driver, "SearchButton-Pass-fail");
				    
				     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
}
			
			
			
			System.out.println("Home Page Search Button is clicked successfully");
			
			
			
			
			
			
			
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + id + " doesn't exists " + e.getMessage());
			
			
			
			
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			
			
			
			
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by id :" + id + "\n" + e.getMessage());
			
			
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}


	
	public void clickByClassName(String classVal) {
		try {
			// wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable((By.className(classVal)))).click();
			System.out.println("Element clicked successfully");
		} catch (TimeoutException e) {
			System.err.println("The element with classNmae :" + classVal + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by classname :" + classVal + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}

	}

	
	public void clickByName(String name) {
		try {
			// wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable((By.name(name)))).click();
			System.out.println("Element clicked successfully");
		} catch (TimeoutException e) {
			System.err.println("The element with Name :" + name + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by name :" + name + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	
	public void clickByLink(String linkText) {
		try {
			// wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable((By.linkText(linkText)))).click();
			System.out.println("Element clicked successfully");
		} catch (TimeoutException e) {
			System.err.println("The element with Link :" + linkText + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by Link :" + linkText + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	
	public void clickByXpath(String xpathVal) {
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpathVal)))).click();
			System.out.println("City link clicked successfully");
			
			
			
			
		} catch (TimeoutException e) {
			System.err.println("The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by xpath :" + xpathVal + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}


	
	public void clickByXpathCityClose(String xpathVal) {
		try {
			
			
			test=extent.startTest("Closing of Change City Link");
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpathVal)))).click();
			
			if(driver.findElements(By.xpath("xpathVal")).isEmpty()){
				test.log(LogStatus.PASS, "Check whether the user able to close change City Strip", "User sucessfully closed the change city strip ");
				
				
				
				String screenShotPath = Capturescreeshots.capture(driver, "ChangeCity-Close-Pass");
											
				    
				     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
			
			}else{
				test.log(LogStatus.FAIL, "Check whether the user able to close change City Strip", "User is unable to close the change City strip");
				
				
				String screenShotPath = Capturescreeshots.capture(driver, "ChangeCity-Close-Fail");
				
			    
			     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				
				
				
			}
			
			
				
				
			
			
			
		} catch (TimeoutException e) {
			System.err.println("The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
			
			
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by xpath :" + xpathVal + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	
	public void clickByXpathClickSelectCity(String xpathVal) {
		try {
			
			
			test=extent.startTest("Clicking of the City Link to change City");
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpathVal)))).click();
			
			if(driver.findElements(By.xpath("xpathVal")).isEmpty()){
				test.log(LogStatus.PASS, "Check whether the user able click the Select City link", "User sucessfully Click the Select City Link ");
				System.out.println("Change City link is closed successfully");
				
				String screenShotPath = Capturescreeshots.capture(driver, "SelectCity-pass");
			    
			     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
			}else{
				test.log(LogStatus.FAIL, "Check whether the user able to close change City Strip", "User unable to Click the Select City Link");
				
				
				String screenShotPath = Capturescreeshots.capture(driver, "SelectCity-fail");
			    
			     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			}
			
			
		
			
			
		} catch (TimeoutException e) {
			System.err.println("The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
			
			
			
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			
			
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by xpath :" + xpathVal + "\n" + e.getMessage());
			
			
			
			
			
			
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}
	
	
	public String getTextById(String idVal) {
		String text = null;
		try {
			
			text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idVal))).getText();
			System.out.println("Returning Actual Text " + text);
		} catch (TimeoutException e) {
			System.err.println("The element with id :" + idVal + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in geting text by locator id :" + idVal + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
		return text;

	}

	public String getTextByXpath(String xpathVal) {
		String text = null;
		try {
			
			text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathVal))).getText();
			System.out.println("Returning Actual Text " + text);
		} catch (TimeoutException e) {
			System.err.println("The element with xpath value :" + xpathVal + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println(
					"Unexpected exception in geting text by locator xpath :" + xpathVal + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
		return text;
	}

	
	public void selectVisibileTextById(String id, String value) {

		try {
			
			Select selectJob = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))));
			selectJob.selectByVisibleText(value);
			System.out.println("DropDown option " + value + " is selected at element " + id);
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + id + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in selecting visible option by id:" + id + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	
	public void selectIndexById(String id, int Index) {
		try {
			
			Select selectJob = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))));
			selectJob.selectByIndex(Index);
			System.out.println("The option  at index " + Index + " is selected");
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + id + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in selecting by index by id:" + id + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}

	}

	
	public void switchToParentWindow() {
		try {
			Set<String> windowhandleSet = driver.getWindowHandles();
			System.out.println("count of opened windows :" + windowhandleSet.size());
			for (String windowhandle : windowhandleSet) {
				System.out.println("navigating windows :" + windowhandle);
				driver.switchTo().window(windowhandle);
				break;
			}
			System.out.println("control is switched to parent window");
		} catch (NoSuchWindowException e) {
			System.err.println("Exception occured while switching to parent window  " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in switching to parent window:" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	
	public void switchToParentWindow(int totalWindowExpected) {
		try {
			
			wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindowExpected));
			Set<String> windowhandleSet = driver.getWindowHandles();
			System.out.println("count of opened windows :" + windowhandleSet.size());
			for (String windowhandle : windowhandleSet) {
				System.out.println("navigating windows :" + windowhandle);
				driver.switchTo().window(windowhandle);
				break;
			}
			System.out.println("control is switched to parent window");
		} catch (TimeoutException e) {
			System.err.println("Expected no of windows doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (NoSuchWindowException e) {
			System.err.println("Exception occured while switching to parent window  " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in switching to parent window:" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	
	public void switchToLastWindow() {
		try {
			Set<String> windowhandleSet = driver.getWindowHandles();
			System.out.println("count of opened windows :" + windowhandleSet.size());
			for (String windowhandle : windowhandleSet) {
				System.out.println("navigating windows :" + windowhandle);
				driver.switchTo().window(windowhandle);
			}
			System.out.println("control is switched to last window");
		} catch (NoSuchWindowException e) {
			System.err.println("Exception occured while switching window  " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in switching to Last Window:" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	
	public void switchToLastWindow(int totalWindowExpected) {
		try {
			
			wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindowExpected));
			Set<String> windowhandleSet = driver.getWindowHandles();
			System.out.println("count of opened windows :" + windowhandleSet.size());
			for (String windowhandle : windowhandleSet) {
				
				driver.switchTo().window(windowhandle);
			}
			System.out.println("control is switched to last window");
		} catch (TimeoutException e) {
			System.err.println("Expected no of windows doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (NoSuchWindowException e) {
			System.err.println("Exception occured while switching window  " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in switching to Last Window:" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}

	public void acceptAlert() {
		try {
			wait.until(ExpectedConditions.alertIsPresent()).accept();
			System.out.println("Alert accepted ");
		} catch (TimeoutException e) {
			System.err.println("Alert is not present" + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (NoAlertPresentException e) {
			System.err.println("Exception occured in accepting alert " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in accepting alert:" + e.getMessage());
			throw new RuntimeException("FAILED");
		}
	}

	public void takeSnap() {
		try {
			File src = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./snaps/snap" + i + ".jpeg"));
			System.out.println("Snapshot Taken");
		} catch (IOException e) {
			System.err.println("IOException occured in taking snap " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in taking snap :" + e.getMessage());
			throw new RuntimeException("FAILED");
		}
		i++;

	}

	public void clickByPartialLink(String linkText) {
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(linkText))).click();
			System.out.println("Element clicked successfully");
		} catch (TimeoutException e) {
			System.err.println("The element with partail link Text :" + linkText + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println(
					"Unexpected exception in clicking by Partial Link Text :" + linkText + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		}

		takeSnap();

	}

	public void clickByXpathNoSnap(String xpathVal) {
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpathVal)))).click();
			System.out.println("Element clicked successfully");
		} catch (TimeoutException e) {
			System.err.println("The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by xpath :" + xpathVal + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		}
	}

	public void clickByLinkNoSnap(String linkText) {
		try {
			
			wait.until(ExpectedConditions.elementToBeClickable((By.linkText(linkText)))).click();
			System.out.println("Element clicked successfully");
		} catch (TimeoutException e) {
			System.err.println("The element with Link :" + linkText + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by Link :" + linkText + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		}
	}

	public void dismissAlert() {
		try {
			wait.until(ExpectedConditions.alertIsPresent()).dismiss();
			System.out.println("Alert dismissed");
		} catch (TimeoutException e) {
			System.err.println("Alert is not present" + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in dismissing alert:" + e.getMessage());
			throw new RuntimeException("FAILED");
		}
	}

	public String getAlertText() {
		String text = null;
		try {
		
			text = wait.until(ExpectedConditions.alertIsPresent()).getText();
			System.out.println("Returning Alert Text " + text);
		} catch (TimeoutException e) {
			System.err.println("Alert is not present" + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in retriving text from alert:" + e.getMessage());
			throw new RuntimeException("FAILED");
		}
		return null;
	}

	public void closeBrowser() {

		try {
			driver.close();
			System.out.println("Browser closed");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in Close browser:" + e.getMessage());
			throw new RuntimeException("FAILED");
		}

	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("All browsers closed");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in Quit browser:" + e.getMessage());
			throw new RuntimeException("FAILED");
		}

	}

	public boolean verifyTitle(String title) {
		return false;
	

	}

	public void enterByXpathSendKeys() {
		// TODO Auto-generated method stub

	}

	public void clickByListClassName(String value) {
		// TODO Auto-generated method stub

	}

	public void clickByXpathgetText() {
		// TODO Auto-generated method stub

	}

	public void clickByXpathgetText(String value) {
		// TODO Auto-generated method stub

	}

	public void clickByClassNameListings(String value) {
		// TODO Auto-generated method stub

	}

	

	public void clickByClassNames(String classVal) {
		try {

			WebElement cityNames = driver.findElementsByClassName(classVal).get(0);

			cityNames.click();
			
			System.out.println("Element clicked successfully");
		} catch (TimeoutException e) {
			System.err.println("The element with classNmae :" + classVal + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by classname :" + classVal + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}

	}
	

	public void clickByClassNamesCitySelectFromList(String classVal) {
		try {

			test=extent.startTest("Landing to Alangudi HomePage ");
			
			
			
			WebElement cityNames = driver.findElementsByClassName(classVal).get(0);

			cityNames.click();
			
			String alangudiHomePageTitle=driver.getTitle();
			
			System.out.println(alangudiHomePageTitle);
			
			
			String CityHomePage=driver.findElementByClassName("select-city").getText();
			
			System.out.println(CityHomePage);
			
			 
			 if(CityHomePage.contains("Alangudi"))
			    	
			    {
			    	test.log(LogStatus.PASS, "Check whether the user land to the Alangudi City Page", "User Sucessfully land to the Alangudi City Page");
			    	
			    	String screenShotPath = Capturescreeshots.capture(driver, "City-Selection-dropdown");
				    
				     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				     
				     
			    	
			    	
			    }
			    
			    else{
			    	
			    	test.log(LogStatus.FAIL, "Check whether the user land to the Alangudi City Page", "User not land to the Alangudi City Page");
			    	
			    	String screenShotPath = Capturescreeshots.capture(driver, "City-Selection-dropdown-fail");
				    
				     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			    }
			
	
			System.out.println("City is  clicked successfully from the List");
			

			
			
		} catch (TimeoutException e) {
			System.err.println("The element with classNmae :" + classVal + " doesn't exists " + e.getMessage());
			
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			
			
			
			
			
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by classname :" + classVal + "\n" + e.getMessage());
			
			
			
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}

	}
	

	

	public String getAttributeByXpath(String xpathVal) {
		String text = null;
		int i = 1;

		while (i <= 10) {

			try {

			
				text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathVal)))
						.getAttribute("href");
				System.out.println("Returning Actual Text " + text);

			} catch (TimeoutException e) {
				System.err.println("The element with xpath value :" + xpathVal + " doesn't exists " + e.getMessage());
				throw new RuntimeException("FAILED");
			} catch (WebDriverException e) {
				System.err.println("The Browser could not be found " + e.getMessage());
				throw new RuntimeException("FAILED");
			} catch (Exception e) {
				System.err.println(
						"Unexpected exception in geting text by locator xpath :" + xpathVal + "\n" + e.getMessage());
				throw new RuntimeException("FAILED");
			} finally {
				takeSnap();
			}
			return text;
		}
		return text;
	}

	

	public void getAttributeValueByXpath(String xpathVal) {

		String[] arr = new String[12];

		int y = 0;
		String[] ids1 = new String[12];

		String[] idv = new String[12];

		try {

		   
			listings = driver.findElements(By.xpath(xpathVal));

			

			System.out.println("Total Listing :" + listings.size());
			for (j = 0; j <= listings.size() - 1; j++) {

				ListingsValue = listings.get(j).getAttribute("onclick");

				arr[y] = ListingsValue;

				String[] parts = arr[y].split("(?=,)");
				String part1 = parts[0];

				ids1[j] = part1.replaceAll("[^0-9]", "");

				System.out.println("**************************");
				System.out.println(ids1[j]);

			}
			
			Thread.sleep(4000);
			
			if(driver.findElements(By.xpath("//button[@class='close palert-close']/span")).size() != 0){
				System.out.println("Property Alert Form is Displayed");
				driver.findElements(By.xpath("//button[@class='close palert-close']/span")).get(0).click();

				}else{
				System.out.println("Property Alert Form is not Displayed");
				}

			
			
			Random r = new Random();
			int select = r.nextInt(ids1.length);
			System.out.println(select);

			System.out.println(ids1[select]);

			listingid1 = ids1[select];

			System.out.println(listingid1);

			String parent = driver.getWindowHandle();

			Thread.sleep(2000);
			listings.get(select).click();
			Thread.sleep(3000);
			Set<String> childwindow = driver.getWindowHandles();

			for (String newWindow : childwindow) {

				if (newWindow != parent) {

					driver.switchTo().window(newWindow);

					Thread.sleep(5000);

					System.out.println(driver.getTitle());

					vdpUrl = driver.getCurrentUrl();

					System.out.println(vdpUrl);
					
					

					

				}
			}
		
			
		} catch (TimeoutException e) {
			System.err.println("The element with xpath value :" + xpathVal + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println(
					"Unexpected exception in geting text by locator xpath :" + xpathVal + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}

	}
	
	
	
	public void getAttributeValueOfListingsByXpath(String xpathVal) throws NoSuchWindowException {
		
		test=extent.startTest("Landing to View Detail Page ");
		

		String[] arr = new String[12];

		int y = 0;
		String[] ids1 = new String[12];

		String[] idv = new String[12];

		try {

			listings=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathVal)));
			
			
            System.out.println("Listings are visible " + listings);
			
			

			System.out.println("Total Listing :" + listings.size());
			for (j = 0; j <= listings.size() - 1; j++) {

				ListingsValue = listings.get(j).getAttribute("onclick");

				arr[y] = ListingsValue;

				String[] parts = arr[y].split("(?=,)");
				String part1 = parts[0];

				ids1[j] = part1.replaceAll("[^0-9]", "");

				System.out.println("**************************");
				System.out.println(ids1[j]);
				
				
				
				

			}
			
			Thread.sleep(4000);
			
			if(driver.findElements(By.xpath("//button[@class='close palert-close']/span")).size() != 0){
				System.out.println("Property Alert Form is Displayed");
				driver.findElements(By.xpath("//button[@class='close palert-close']/span")).get(0).click();

				}else{
				System.out.println("Property Alert Form is not Displayed");
				}

			
			Random r = new Random();
			int select = r.nextInt(ids1.length);
			System.out.println(select);

			System.out.println(ids1[select]);

			listingid1 = ids1[select];

			System.out.println(listingid1);

			String parent = driver.getWindowHandle();

			Thread.sleep(2000);
			
		
			listings.get(select).click();
			
			
			Thread.sleep(5000);
			
			driver.switchTo().window(parent).close();
			
			Set<String> childwindow = driver.getWindowHandles();

			for (String newWindow : childwindow) {
				
				

		     if (newWindow != parent) {
		    	 
		    	 
		    	 
		    	 
		    	 Thread.sleep(5000);
					
				

					driver.switchTo().window(newWindow);
					
					System.out.println("control is switched to child window");

					Thread.sleep(10000);
					
					

					System.out.println(driver.getTitle());
					
                    vdpUrl = driver.getCurrentUrl();
					
					

					System.out.println(vdpUrl);
					
					Thread.sleep(15000);
					
					if(vdpUrl.contains(listingid1)){
					
				
						
						test.log(LogStatus.PASS, "Check whether user land to the respective view detail page" , "User sucessfuly Land to the VDP page" + "  "+ listingid1);
						test.log(LogStatus.INFO, "User Landing URL"+vdpUrl);
						
					
						String screenShotPath = Capturescreeshots.capture(driver, "SearchListings-pass");
					    
					     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
					}
					
					else{
						
						test.log(LogStatus.FAIL, "Check whether user land to the respective view detail page" , "User not able to land to respective   VDP page" + "  "+ listingid1);
						test.log(LogStatus.INFO, "User Landing URL"+vdpUrl);
						
						
						String screenShotPath = Capturescreeshots.capture(driver, "SearchListings-fail");
					    
					     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
						
					}
					
				

					
					
					

					
					Thread.sleep(5000);

				}
			}
		
			
			
			
			
			
		} catch (TimeoutException e) {
			System.err.println("The element with id :" + xpathVal + " doesn't exists " + e.getMessage());
			
			
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			
			
			
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in geting text by locator id :" + xpathVal + "\n" + e.getMessage());
			
			
			
			
			throw new RuntimeException("FAILED");
			
		}
			
			
			
		
		
		finally {
			takeSnap();
		}

	}

	
	
	
	
	public void enterById1(String idValue, String data) {
		try {
			
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idValue))).sendKeys(data);
			System.out.println("The value " + data + " is entered at element " + idValue);
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + idValue + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in entering value" + data
					+ " into element with id value : " + idValue + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}
	


	public void enterById2(String idValue, String data) {
		try {
			
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idValue))).sendKeys(data);
			System.out.println("The value " + data + " is entered at element " + idValue);
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + idValue + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in entering value" + data
					+ " into element with id value : " + idValue + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}
	
	
	
	public void enterById3(String idValue, String data) {
		try {
		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idValue))).sendKeys(data);
			System.out.println("The value " + data + " is entered at element " + idValue);
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + idValue + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in entering value" + data
					+ " into element with id value : " + idValue + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}
		
	public void openNewTab(String a, int wincount) {
		
		try {
			test=extent.startTest("Landing of Onboarding Interface Login Page ");
			
			((JavascriptExecutor) driver).executeScript(a);

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(wincount));
			
			String onboardingLoginPage =driver.getCurrentUrl();
			Thread.sleep(3000);
			
			System.out.println(onboardingLoginPage);
			
			
			
			if(!onboardingLoginPage.equalsIgnoreCase("http://onboarding.indiaproperty.com/")){
			
			
				test.log(LogStatus.FAIL, "Check whether user land to onboarding login Page", "User unable to  land on Onboarding Login Page");
			
				String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
			    
			     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
			}
			
			else  {
		
				test.log(LogStatus.PASS, "Check whether user land to onboarding login Page", "User sucessfully land to Onboarding Login Page");	
				
				

				String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
			    
			     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				
		}
				
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void openNewTab2(String a, int wincount) {

		try {
			
			
			((JavascriptExecutor) driver).executeScript(a);

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(wincount));
			
			
			String onboardingCustomerPage =driver.getCurrentUrl();
			Thread.sleep(3000);
			
			System.out.println(onboardingCustomerPage);
			
			if(!onboardingCustomerPage.equalsIgnoreCase("http://onboarding.indiaproperty.com/customervalidation/1641391")){
				
				
				test.log(LogStatus.FAIL, "Check whether user land to respective Customer Lead Page", "User unable to  land on Customer Lead Page");
			
				
				String screenShotPath = Capturescreeshotsfull.capture(driver, "Enqinfo-pass");
			    
			     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
			}
			
			else  {
		
				test.log(LogStatus.PASS, "Check whether user land to respective Customer Lead Page", "User sucessfully land on Customer Lead Page");	
				
				
				

				String screenShotPath = Capturescreeshotsfull.capture(driver, "Enqinfo-fail");
			    
			     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		}
			
			
			
			
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	public void sysDate() {
		
		test=extent.startTest("Verify of Current Date");

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy ");

		Date date = new Date();

		// Now format the date
		currentSystemDate = dateFormat.format(date);
		currentDate = currentSystemDate.trim();
		// Print the Date
		
		test.log(LogStatus.INFO, "Verify of Current date" + "  "+ currentDate);
		
		System.out.println(currentDate);

	}
	
	public void onbTableFreshenq(String xpathValue) {
		
		
		

		String leadInfo1 = "";

		int m = 0;
		int n = 0;

		ArrayList<String> ar = new ArrayList<String>();

		List<WebElement> data1 = driver.findElementsByXPath(xpathValue);

		for (m = 0; m <= data1.size() - 1; m++) {

			leadInfo1 = data1.get(m).getText();

			ar.add(leadInfo1);

			String parts = leadInfo1.replaceAll(".*\\(|\\).*", "");

			str.add(parts);
			str.toString().trim();
			System.out.println(str);

		}

		
		System.out.println(str.size());
	}
	


	public void onbTableDuplicateEnq(String xpathValue) {
		
		
		String leadInfo1 = "";

		int m = 0;
		int n = 0;

		ArrayList<String> ar = new ArrayList<String>();

		List<WebElement> data1 = driver.findElementsByXPath(xpathValue);

		for (m = 0; m <= data1.size() - 1; m++) {

			leadInfo1 = data1.get(m).getText();

			ar.add(leadInfo1);

			String parts = leadInfo1.replaceAll(".*\\(|\\).*", "");

			listingIdsInDuplicateEnqTable.add(parts);
			listingIdsInDuplicateEnqTable.toString().trim();
			System.out.println(listingIdsInDuplicateEnqTable);

		}

		
		System.out.println(listingIdsInDuplicateEnqTable.size());
	}
	
	
	public void onbTableCombined() {
		

		

	
		listingIdCollection.addAll(str);
		
		listingIdCollection.addAll(listingIdsInDuplicateEnqTable);
		
		
		listingIdCollection.toString().trim();
			System.out.println(listingIdCollection);
			
			System.out.println(listingIdCollection.size());
			
			

		}

	
	
	
	

	
	public void onbTableDate(String xpathValue) {
		
		
		

		String dateInfo1 = "";

		int q = 0;

		List<WebElement> data2 = driver.findElementsByXPath(xpathValue);

		for (q = 0; q <= data2.size() - 1; q++) {

			dateInfo1 = data2.get(q).getText();
			String[] dateFreshEnq=dateInfo1.split(" ");
			
			String Date = dateFreshEnq[0];
			

			System.out.println("*****************************");
		
			dateInFreshEnqTable.add(Date);
			
			

			dateInFreshEnqTable.toString().trim();
			
			System.out.println(dateInFreshEnqTable);

		}
			
		
	}
	

	
	public void onbTableDateDuplicate(String xpathValue) {

		
		
		
		String dateInfo2 = "";

		int q = 0;

		List<WebElement> data3 = driver.findElementsByXPath(xpathValue);

		for (q = 0; q <= data3.size() - 1; q++) {

			dateInfo2 = data3.get(q).getText();
			String[] dateFreshEnq=dateInfo2.split(" ");
			String Date = dateFreshEnq[0];
			
		

			System.out.println("*****************************");
		
			dateInDuplicateEnqTable.add(Date);
			
			

			dateInDuplicateEnqTable.toString().trim();
			
			System.out.println(dateInDuplicateEnqTable);

		}
			
		
	}
	
	

public void onbTableDateCombined() {
		

		

	
		enquiryTableDateCollection.addAll(dateInFreshEnqTable);
		
		System.out.println(enquiryTableDateCollection);
		
		enquiryTableDateCollection.addAll(dateInDuplicateEnqTable);
		
		
		enquiryTableDateCollection.toString().trim();
			System.out.println(enquiryTableDateCollection);
			
			System.out.println(enquiryTableDateCollection.size());
			
			

		}
	
	
	
	
	
	
	
	
	

	public void leadValidation() throws IOException {

		test=extent.startTest("Validating the Posted Lead in Onboarding Interface");
		
		boolean flag_lead = false;
	
		if(!enquiryTableDateCollection.contains(currentDate)) {
			
			
			System.out.println("Current Date Not Captured and Hence Enquiry is not captured in Onboarding Interface ");
			
		driver.quit();
		}
		
		else{
			
			
		
		for ( a = 0; a <=listingIdCollection.size()-1; a++) {

		
		
			if(listingid1.equalsIgnoreCase(listingIdCollection.get(a))&&(currentDate.equalsIgnoreCase(enquiryTableDateCollection.get(a)))){
					
			
				
				flag_lead = true;
				
				lead_details="Lead has  Capured in Onboarding Interface:" +"Listing Id : " +" "+listingIdCollection.get(a)+" "+"Last Enquired Date :"+" "+enquiryTableDateCollection.get(a);
				break;
				
			}
		
			else{
				flag_lead = false;
				
				lead_details="Lead has not Capured in Onboarding Interface:" +"Listing Id : " +" "+listingIdCollection.get(a)+" "+"Last Enquired Date :"+" "+enquiryTableDateCollection.get(a);

			}
			
			}
		
		
		
		if (flag_lead) {
			System.out.println(lead_details);
			
			test.log(LogStatus.PASS, "Check whether Today posted enquiry is captured in boarding interface", "Lead has  Capured in Onboarding Interface:" +"Listing Id : " +" "+listingIdCollection.get(a)+" "+"Last Enquired Date :"+" "+enquiryTableDateCollection.get(a));
			

			String screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName");
		    
		     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
		} else {
			
			test.log(LogStatus.FAIL, "Check whether Today posted enquiry is captured in boarding interface", "Lead has  Capured in Onboarding Interface:" +"Listing Id : " +" "+listingIdCollection.get(a)+" "+"Last Enquired Date :"+" "+enquiryTableDateCollection.get(a));
			System.out.println(lead_details);
			
			String screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName");
		    
		     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		}
		
		
	driver.quit();
				
				
			
		}		
		
			
	}
	
	
	public void verifypopup() throws IOException, InterruptedException{
		
		 Thread.sleep(5000);
	
	
		if(driver.findElements(By.xpath("//h2[text()='Thank you, for Showing Interest in this Property.']")).size() != 0){
			System.out.println("Thank You Popup is displayed");
			
			
			
			test.log(LogStatus.INFO, "Thank you, for Showing Interest in this Property Pop is displayed");
			

			String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
		    
		     test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		     
		     Thread.sleep(5000);
			
		}
		
		
		
		
		else if(driver.findElements(By.xpath("//p[text()='You Have Already Requested / Enquired About This Property']")).size() != 0){
			
			 Thread.sleep(5000);
			System.out.println("Already enquired about this property is displayed");
			//driver.quit();
			
			test.log(LogStatus.INFO, "You Have Already Requested / Enquired About This Property popup is displayed");
			
			String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
		    
		     test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		     
		     Thread.sleep(5000);
			
			driver.quit();
         
			}
		

		else if (driver.findElements(By.xpath("//h2[@class='modal-title h1 text-center font-light']")).size() != 0){
			
			 Thread.sleep(5000);
			System.out.println("Reached Maximam enquiry of the day is displayed");
			test.log(LogStatus.INFO, "Reached Maximam enquiry of the day is displayed popup is displayed");
			
			String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
		    
		     test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		     
		     Thread.sleep(5000);
			
			driver.quit();
			

			}else{
			System.out.println("Popup Element is not displayed");
			
		     Thread.sleep(5000);
			}
		
	
		
	
	}

	public boolean verifyTitle11(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	public void takeSnap1() {
		// TODO Auto-generated method stub
		
	}

	public void openNewTab() {
		// TODO Auto-generated method stub
		
	}

	public void onbTable(String xpathValue1, String xpathValue2) {
		// TODO Auto-generated method stub
		
	}

	public void alreadyenqpopup(String xpathVal1, String xpathVal2) {
		// TODO Auto-generated method stub
		
	}

	public boolean isPresent() {
		
		return false;
	}
	
		
	
	}
	

	

