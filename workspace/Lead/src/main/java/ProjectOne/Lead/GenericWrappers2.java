
package ProjectOne.Lead;



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
import org.apache.poi.util.SystemOutLogger;
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
import org.openqa.selenium.interactions.Actions;
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







/**
 * @author Temp
 *
 */
public class GenericWrappers2 extends ProjectWrapper implements Wrappers3 {

	public static String strLong;
	
	//public static String newWindowtemp;
	
	
//ExtentReports extent;
	
	//ExtentTest test;
	
//ExtentReports extent;
	
	//ExtentTest test;
	/*ExtentReports report;
	ExtentTest logger;
	*/
	/**
	 * @author LOKESH KUMAR T
	 *
	 */
	public static int a;
	
	public static String freshenqListingStatus;
	ArrayList<String> fEnqListingStatus=new ArrayList<String>();
	
	public static String duplicateenqListingStatus;
	ArrayList<String> dEnqListingStatus=new ArrayList<String>();
	ArrayList<String> listingStatusCombined=new ArrayList<String>();
	
	ArrayList<String> expiredListing=new ArrayList<String>();
	
	ArrayList<String> expenqCount=new ArrayList<String>();
	
	public static String listingStatusout;
	
	public static  int countEnqTemp;
	
	ArrayList<Integer>   countEnq=new ArrayList<Integer>();
	public static String value;
	
	public static String value2;
	
	public static String searchPageTitle;
	
	public static String localityInfoHomePage;
	public static String lead_details = "";
	
	public static String homePageTitle;
	public static String recentLeadListing;
	
	WebDriverWait wait;
	// Declare Driver Class
	RemoteWebDriver driver;
	int i = 1;
	String ids;
	List<WebElement> listings;
	String ListingsValue = "";
	String vdpUrl;

	String currentSystemDate;
	public static String listingid1;
	// String parent;
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
	
	String listingStatus;
	
	
	
	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param browser
	 * @param Url
	 */
	
/*ExtentReports extent;
	
	ExtentTest test;*/
	/*
	@BeforeTest
	
	public void startTest(){
		
		
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-out/testReport1.html", true);
		
		extent.addSystemInfo("HostName", "Ip Test")
		
		.addSystemInfo("Type Of Testing", "Sanity")
		.addSystemInfo("Environment", "Production Site")
		.addSystemInfo("Author", "MPrem -QA");
	
		extent.loadConfig(new File(System.getProperty("D:/Template/PageObjectModel/src/main/resources/extent-config.xml")));
		
		//extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config1.xml"));
		
		
	}
*/
	
	
	
	public void invokeApp(String browser, String Url) {

		try {
			
			
			//String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
           // test.log(LogStatus.FAIL, result.getThrowable());
            //test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
        
			//invokeApp("chrome","http://www.indiaproperty.com/");
			/*report=new ExtentReports("C:\\Report\\LearnAutomation.html");
			
			logger=report.startTest("VerifyBrowserLaunch");*/
		//test=extent.startTest("Browser Launch", "Test for Launch the Browser");
			//extent.startTest("Browser Launch", "Test for Browser");
			//extent.config();
		
		 
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
            
			driver = new ChromeDriver();
			
			//test=extent.startTest("Browser Launch", "Test for Launch the Browser");
			test=extent.startTest("Browser Launch and IP Home Page Navigation");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//new ExtentTest(Url, Url);
		//	test=extent.startTest("Browser Launch";
			//test.log(LogStatus.INFO, "Browser Launch", "Chrome Browser is Launching and Maximized");
			/*logger.log(LogStatus.INFO, "Browser started ");*/
			driver.get(Url);
			
			//test.log(LogStatus.INFO, "IP url navigation", "IP url navigation in chrome browser");
			wait = new WebDriverWait(driver, 30);
			/*logger.log(LogStatus.INFO, "Application is up and running");*/
			//String title=driver.getTitle();
			
			//new DataReadAndWrite(driver,1,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The browser " + browser + " is launched with URL " + Url);

			//new DataReadAndWrite(driver,1,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","As Expected");
			
			//new DataReadAndWrite(driver,1,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","PASS");
			
			
			//DataReadAndWrite(0,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The browser " + browser + " is launched with URL " + Url,"As Expected","PASS");
			//writeDataFromExcel(0,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","As Expected");
			
			System.out.println("The browser " + browser + " is launched with URL " + Url);
			
		homePageTitle=driver.getTitle();
			
			System.out.println(homePageTitle);
			
			String expectedHomepageTitle="Property in India, Buy, Sell, Rent Properties, Real Estate India, Online Property Sites in India";
			
			
			if(homePageTitle.contains("Search Properties")){
			test.log(LogStatus.PASS, "Check whether user navigated to the Home Page", "User sucessfully land to the Home Page");
			
			
			String screenShotPath =Capturescreeshots.capture(driver,"HomePage-Pass");
			
		   test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
		    
		     //test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
		//String screenShotPath = Capturescreeshots.capture(driver, "Home Page");
			
			
		
		    
		     //test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
			//test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			}
			
			else{
				
				test.log(LogStatus.FAIL, "Check whether user navigated to the Home Page", "User not logged to  the Home Page");
				
				/*String screenShotPath = Capturescreeshots.capture(driver,number1);
			    
			     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
				//test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				/*String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
			    
			     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			          
			     
			     
				*/
				
				String screenShotPath =Capturescreeshots.capture(driver,"HomePage-Fail");
				
				   test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				
				
			}
			
		//	test.log(LogStatus.INFO, "User Land to the following City (but expected chennai city)"+"  "+homePageTitle);
			//extent.flush();
			
//Assert.assertTrue(true);
			
			//test.log(LogStatus.PASS, "User navigated to the IP site");
			
			/*Assert.assertTrue(title.contains("IndiaProperty"));
			
			logger.log(LogStatus.PASS, "Title verified");*/
			
			//test.log(LogStatus.PASS, "Launching the Browser is Sucessful", "Sanity Test");
			
			//extent.endTest(logger);
		} catch (WebDriverException e) {
			
//Assert.assertTrue(false);
			
			//test.log(LogStatus.FAIL, "The Browser could not be found " + e.getMessage());
			System.err.println("The Browser could not be found " + e.getMessage());
			//new DataReadAndWrite(0,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation", e.getMessage(),"Result is not as per expectation","FAIL");
			
			/*
			new DataReadAndWrite(driver,1,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The browser " + browser + " is launched with URL " + Url);
			
			new DataReadAndWrite(driver,1,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation",e.getMessage());
			
			new DataReadAndWrite(driver,1,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Fail");*/
			
			throw new RuntimeException("FAILED");
			
			
		} catch (Exception e) {
			
			// Assert.assertTrue(false);
				
				//test.log(LogStatus.FAIL, "Unexpected exception occured in invokeApp() " + e.getMessage());
			System.err.println("Unexpected exception occured in invokeApp() " + e.getMessage());
			
/*new DataReadAndWrite(driver,1,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The browser " + browser + " is launched with URL " + Url);
			
			new DataReadAndWrite(driver,1,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation",e.getMessage());
			
			new DataReadAndWrite(driver,1,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Fail");		
			*/
			//new DataReadAndWrite(0,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation", e.getMessage(),"Result is not as per expectation","FAIL");
			throw new RuntimeException("FAILED");
			
		} 
		
		
		
		finally {
			takeSnap();
		}
	}

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param idValue
	 * @param data
	 */
	
	public void enterById(String idValue, String data) {
		try {
		wait = new WebDriverWait(driver, 45);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(idValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(idValue))).sendKeys(data);
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
		// wait = new WebDriverWait(driver, 30);
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

	//@Test(priority=14)
	public void enterById4(String idValue, String data) {
		try {
			
			//enterById4("username", "premkumar.m@indiaproperty.com");
			// wait = new WebDriverWait(driver, 30);
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

	
	//@Test(priority=15)
	public void enterById5(String idValue, String data) {
		try {
			
			
			
			// enterById5("pass", "Elshaddaikr22");
			// wait = new WebDriverWait(driver, 30);
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
	
	//@Test(priority=4)
	public void enterByIdCityEntryCityTextBox(String idValue, String data) {
		try {
			
			
			test=extent.startTest("Enter City Alangudi in the City Textbox");
			//enterByIdCityEntryCityTextBox("searchval", "Alangudi");
			
			// wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idValue))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idValue))).sendKeys(data);
			
			
			

			// Check whether input field is blank
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
			/*new DataReadAndWrite(driver,4,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The City Name " + data + " should be entered at textbox " + idValue);

			new DataReadAndWrite(driver,4,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","As Expected");
			
			new DataReadAndWrite(driver,4,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","PASS");*/
			
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + idValue + " doesn't exists " + e.getMessage());
			/*new DataReadAndWrite(driver,4,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The City Name " + data + " should be entered at textbox " + idValue);

			new DataReadAndWrite(driver,4,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The element with id value :" + idValue + " doesn't exists " + e.getMessage());
			
			new DataReadAndWrite(driver,4,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			
			/*new DataReadAndWrite(driver,4,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The City Name " + data + " should be entered at textbox " + idValue);

			new DataReadAndWrite(driver,4,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The Browser could not be found " + e.getMessage());
			
			new DataReadAndWrite(driver,4,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");
			*/
			
			
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception occured in entering value" + data
					+ " into element with id value : " + idValue + "\n" + e.getMessage());
			
			
		/*	new DataReadAndWrite(driver,4,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The City Name " + data + " should be entered at textbox " + idValue);

			new DataReadAndWrite(driver,4,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Unexpected exception occured in entering value" + data
					+ " into element with id value : " + idValue + "\n" + e.getMessage());
			
			new DataReadAndWrite(driver,4,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
			
			
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}
	
	
	
	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param nameValue
	 * @param data
	 */
	public void enterByName(String nameValue, String data) {
		try {
			// wait = new WebDriverWait(driver, 30);
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param xpathValue
	 * @param data
	 */
	public void enterByXpath(String xpathValue, String data) {
		try {
			// wait = new WebDriverWait(driver, 30);
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param title
	 * @return
	 */
	public boolean verifyTitle1(String title) {
		try {
			// wait = new WebDriverWait(driver, 30);

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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param id
	 * @param text
	 */
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param xpath
	 * @param text
	 */
	public void verifyTextByXpath(String xpath, String text) {
		try {
			// wait = new WebDriverWait(driver, 30);
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param xpath
	 * @param text
	 */
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param id
	 * @param text
	 */
	public void verifyTextContainsById(String id, String text) {
		try {
			// wait = new WebDriverWait(driver, 30);
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param id
	 * @throws InterruptedException 
	 */
	//@Test(priority=16)
	public void clickById2(String id) throws InterruptedException {
		try {
			
			//clickById2("send");
			// wait = new WebDriverWait(driver, 30);
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
			// wait = new WebDriverWait(driver, 30);
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
	
	//@Test(priority=11)
	public void clickById1(String id) throws InterruptedException {
		try {
			
		//	clickById1("agent-enquiry-submit");
			// wait = new WebDriverWait(driver, 30);
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

	//@Test(priority=6)
	
	public void clickByIdHomePageSearchButton(String id) {
		try {
			
			test=extent.startTest("Landing to Alangudi Search Page ");
			
			//clickByIdHomePageSearchButton("home-searchbtn");
			
			// wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable((By.id(id)))).click();
			
			Thread.sleep(3000);
			searchPageTitle=driver.getTitle();
			
			System.out.println(searchPageTitle);
			
			String expectedsearchPageTitle="Buy All Residential in Alangudi";
			
			if(searchPageTitle.contains(expectedsearchPageTitle)){
				
				test.log(LogStatus.PASS, "Check whether user navigated to the search page", "User Sucessfully Land to the Alangudi Search Page");
				
				test.log(LogStatus.INFO, "Search Page Title"+"  "+searchPageTitle);
				
				//Clicking  of Sort Filter in Search page start of Code
				
				Thread.sleep(5000);
				
				//Click of Old Sort in search Page
				
				/*driver.findElementByXPath("//ul[@class='list-unstyled sorting-items']/li[3]/a").click();
				
				Thread.sleep(5000);
				
				driver.findElementByXPath("//ul[@class='list-unstyled sorting-items']/li[3]/a").click();
				
				
				Thread.sleep(5000);*/
				
				
				//driver.findElementByXPath("//ul[@class='list-unstyled sorting-items']/li[3]/a").click();
				
				//Thread.sleep(5000);
				
				//Clicking  of Sort Filter in Search page end of Code
				
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
			
			
			
			
			
			/*new DataReadAndWrite(driver,6,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Home Page Search Button is clicked successfully");

			new DataReadAndWrite(driver,6,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","As Expected");
						
			new DataReadAndWrite(driver,6,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","PASS");*/
			
			
		} catch (TimeoutException e) {
			System.err.println("The element with id value :" + id + " doesn't exists " + e.getMessage());
			
			
			/*new DataReadAndWrite(driver,6,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Home Page Search Button is clicked successfully");

			new DataReadAndWrite(driver,6,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The element with id value :" + id + " doesn't exists " + e.getMessage());
						
			new DataReadAndWrite(driver,6,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");
			*/
			
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			
			/*new DataReadAndWrite(driver,6,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Home Page Search Button is clicked successfully");

			new DataReadAndWrite(driver,6,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The Browser could not be found " + e.getMessage());
						
			new DataReadAndWrite(driver,6,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
			
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by id :" + id + "\n" + e.getMessage());
			
			/*new DataReadAndWrite(driver,6,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Home Page Search Button is clicked successfully");

			new DataReadAndWrite(driver,6,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Unexpected exception in clicking by id :" + id + "\n" + e.getMessage());
						
			new DataReadAndWrite(driver,6,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}


	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param classVal
	 */
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param name
	 */
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param linkText
	 */
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param xpathVal
	 */
	public void clickByXpath(String xpathVal) {
		try {
			// wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpathVal)))).click();
			System.out.println("City link clicked successfully");
			
			/*new DataReadAndWrite(driver,1,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","");

			new DataReadAndWrite(driver,1,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","As Expected");
						
			new DataReadAndWrite(driver,1,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","PASS");*/
			
			
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

	//@Test(priority=2)
	
	public void clickByXpathCityClose(String xpathVal) {
		try {
			
			//String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
			
			//clickByXpathCityClose("//*[@id='modalcity-close']");
			test=extent.startTest("Closing of Change City Link");
			// wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpathVal)))).click();
			
			if(driver.findElements(By.xpath("xpathVal")).isEmpty()){
				test.log(LogStatus.PASS, "Check whether the user able to close change City Strip", "User sucessfully closed the change city strip ");
				
				
				
				String screenShotPath = Capturescreeshots.capture(driver, "ChangeCity-Close-Pass");
											
				    
				     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				//test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				
				/*System.out.println("Change City link is closed successfully");
				
				String screenShotPath = Capturescreeshots.capture(driver,number1);*/
			   /* 
			     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
			}else{
				test.log(LogStatus.FAIL, "Check whether the user able to close change City Strip", "User is unable to close the change City strip");
				/*
				String screenShotPath = Capturescreeshots.capture(driver,number1);
			    
			     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
				
				//test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				

				/*String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
				    
				     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
				
				String screenShotPath = Capturescreeshots.capture(driver, "ChangeCity-Close-Fail");
				
			    
			     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				
				
				
			}
			
			
				
				
			
			//System.out.println("Change City link is closed successfully");
			
		/*	new DataReadAndWrite(driver,2,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Change City click is closed successfully");

			new DataReadAndWrite(driver,2,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","As Expected");
						
			new DataReadAndWrite(driver,2,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","PASS");*/
			//test.log(LogStatus.PASS, "Check whether user close the change city link", "User sucessfully closed the link");
			//extent.flush();
			
		} catch (TimeoutException e) {
			System.err.println("The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
			/*new DataReadAndWrite(driver,2,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Change City link should closed");

			new DataReadAndWrite(driver,2,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
						
			new DataReadAndWrite(driver,2,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
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
			
			//clickByXpathClickSelectCity("//div[@class='select-city']/a");
			test=extent.startTest("Clicking of the City Link to change City");
			// wait = new WebDriverWait(driver, 30);
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
			
			
		//	System.out.println("City link clicked successfully");
			
			/*new DataReadAndWrite(driver,3,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City link should be clicked");

			new DataReadAndWrite(driver,3,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","As Expected");
						
			new DataReadAndWrite(driver,3,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","PASS");*/
			
			
		} catch (TimeoutException e) {
			System.err.println("The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
			
			/*new DataReadAndWrite(driver,3,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City link should be clicked");

			new DataReadAndWrite(driver,3,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
						
			new DataReadAndWrite(driver,3,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			
			/*new DataReadAndWrite(driver,3,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City link should be clicked");

			new DataReadAndWrite(driver,3,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
						
			new DataReadAndWrite(driver,3,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");
			*/
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by xpath :" + xpathVal + "\n" + e.getMessage());
			
			
			/*new DataReadAndWrite(driver,3,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City link should be clicked");

			new DataReadAndWrite(driver,3,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Unexpected exception in clicking by xpath :" + xpathVal + "\n" + e.getMessage());
						
			new DataReadAndWrite(driver,3,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
			
			
			
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}
	
	
	//***************************************************************************************
	/*
	
	//@Test(priority=3)
	public void clickByXpathClickSelectCity(String xpathVal) {
		try {
			
			//clickByXpathClickSelectCity("//div[@class='select-city']/a");
			
			// wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpathVal)))).click();
			System.out.println("City link clicked successfully");
			
			new DataReadAndWrite(driver,3,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City link should be clicked");

			new DataReadAndWrite(driver,3,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","As Expected");
						
			new DataReadAndWrite(driver,3,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","PASS");
			
			
		} catch (TimeoutException e) {
			System.err.println("The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
			
			new DataReadAndWrite(driver,3,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City link should be clicked");

			new DataReadAndWrite(driver,3,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
						
			new DataReadAndWrite(driver,3,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");
			
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			
			new DataReadAndWrite(driver,3,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City link should be clicked");

			new DataReadAndWrite(driver,3,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The element with Xpath Value :" + xpathVal + " doesn't exists " + e.getMessage());
						
			new DataReadAndWrite(driver,3,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");
			
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by xpath :" + xpathVal + "\n" + e.getMessage());
			
			
			new DataReadAndWrite(driver,3,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City link should be clicked");

			new DataReadAndWrite(driver,3,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Unexpected exception in clicking by xpath :" + xpathVal + "\n" + e.getMessage());
						
			new DataReadAndWrite(driver,3,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");
			
			
			
			
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}
	}
	
	
	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param idVal
	 * @return
	 */
	public String getTextById(String idVal) {
		String text = null;
		try {
			// wait = new WebDriverWait(driver, 30);
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
			// wait = new WebDriverWait(driver, 30);
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param id
	 * @param value
	 */
	public void selectVisibileTextById(String id, String value) {

		try {
			// wait = new WebDriverWait(driver, 30);
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 * @param id
	 * @param Index
	 */
	public void selectIndexById(String id, int Index) {
		try {
			// wait = new WebDriverWait(driver, 30);
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 */
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 */
	public void switchToParentWindow(int totalWindowExpected) {
		try {
			// wait = new WebDriverWait(driver, 30);
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 */
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

	/**
	 * @author LOKESH KUMAR T
	 *
	 */
	public void switchToLastWindow(int totalWindowExpected) {
		try {
			// wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindowExpected));
			Set<String> windowhandleSet = driver.getWindowHandles();
			System.out.println("count of opened windows :" + windowhandleSet.size());
			for (String windowhandle : windowhandleSet) {
				// System.out.println("navigating windows :" + windowhandle);
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
			// wait = new WebDriverWait(driver, 30);
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
			// wait = new WebDriverWait(driver, 30);
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
			// wait = new WebDriverWait(driver, 30);
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
		// TODO Auto-generated method stub

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

	/***********************************************
	 * 
	 * 
	 */

	public void clickByClassNames(String classVal) {
		try {

			WebElement cityNames = driver.findElementsByClassName(classVal).get(0);

			cityNames.click();
			// wait = new WebDriverWait(driver, 30);
			// wait.until(ExpectedConditions.elementToBeClickable((By.className(classVal)))).click();
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
	
	//@Test(priority=5)
	public void clickByClassNamesCitySelectFromList(String classVal) {
		try {

			test=extent.startTest("Landing to Alangudi HomePage ");
			
			//clickByClassNamesCitySelectFromList("ui-menu-item");
			
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
			
			/*
			Thread.sleep(5000);
			//driver.findElementByClassName("AS_searchInpBox").click();
			
			
			
		
			
		   List<WebElement>localityInfo=driver.findElementsByClassName("AS_suggestBox_item");
		   
			for(int q=0;q<localityInfo.size()-1;q++){
				
				localityInfoHomePage=localityInfo.get(0).getText();
			}
		    
		   //int localityInfoHomePage=localityInfo.size();
		   
		   
		    
		    if(localityInfoHomePage.contains("Alangudi"))
		    	
		    {
		    	test.log(LogStatus.PASS, "Check whether the user land to the Alangudi City Page", "User Sucessfully land to the Alangudi City Page");
		    	
		    }
		    
		    else{
		    	
		    	test.log(LogStatus.FAIL, "Check whether the user land to the Alangudi City Page", "User not land to the Alangudi City Page");
		    }*/
			
		//	String expectedalangudiHomePageTitle;
			// wait = new WebDriverWait(driver, 30);
			// wait.until(ExpectedConditions.elementToBeClickable((By.className(classVal)))).click();
			System.out.println("City is  clicked successfully from the List");
			

			/*new DataReadAndWrite(driver,5,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City is  clicked successfully from the List");

			new DataReadAndWrite(driver,5,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","As Expected");
						
			new DataReadAndWrite(driver,5,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","PASS");*/
			
		} catch (TimeoutException e) {
			System.err.println("The element with classNmae :" + classVal + " doesn't exists " + e.getMessage());
			
			/*new DataReadAndWrite(driver,5,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City is  clicked successfully from the List");

			new DataReadAndWrite(driver,5,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The element with classNmae :" + classVal + " doesn't exists " + e.getMessage());
						
			new DataReadAndWrite(driver,5,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");
			*/
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			
			/*new DataReadAndWrite(driver,5,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City is  clicked successfully from the List");

			new DataReadAndWrite(driver,5,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The Browser could not be found " + e.getMessage());
						
			new DataReadAndWrite(driver,5,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
			
			
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in clicking by classname :" + classVal + "\n" + e.getMessage());
			
			/*new DataReadAndWrite(driver,5,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","City is  clicked successfully from the List");

			new DataReadAndWrite(driver,5,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Unexpected exception in clicking by classname :" + classVal + "\n" + e.getMessage());
						
			new DataReadAndWrite(driver,5,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
			throw new RuntimeException("FAILED");
		} finally {
			takeSnap();
		}

	}
	

	/*public void xpathiterate() {

		List<WebElement> listings = driver.findElements(By.className("col-xs-4"));

		List<WebElement> lis = driver
				.findElements(By.xpath("//div[@class='propety-item property-item-grid anchor-block']/child::div[1]"));

		for (int j = 0; j <= lis.size() - 1; j++) {

			System.out.println("l s :" + lis.size());
			System.out.println(lis.get(j).getAttribute("onclick"));

			String part = lis.get(j).getAttribute("onclick");

		}

	}*/

	public String getAttributeByXpath(String xpathVal) {
		String text = null;
		int i = 1;

		while (i <= 10) {

			try {

				// wait = new WebDriverWait(driver, 30);
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

	/*******************************************************************************/

	public void getAttributeValueByXpath(String xpathVal) {

		String[] arr = new String[12];

		int y = 0;
		String[] ids1 = new String[12];

		String[] idv = new String[12];

		try {

		   
			listings = driver.findElements(By.xpath(xpathVal));

			//Thread.sleep(5000);

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
				//System.out.println("Property Alert Form is Displayed");
				driver.findElements(By.xpath("//button[@class='close palert-close']/span")).get(0).click();

				}else{
				//System.out.println("Property Alert Form is not Displayed");
				}

			
			/*if(driver.findElementByXPath("//button[@class='close palert-close']/span").isEnabled()){
				
				driver.findElementByXPath("//button[@class='close palert-close']/span").click();
			}
			
			else{*/
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
					
					

					/*if(driver.findElements(By.xpath("/p[@class='cor-grn']")).size() != 0){
						System.out.println("Already enquired about this property");
						driver.quit();

						}else{
						System.out.println("Element is Absent");
						}
					

					if(driver.findElements(By.xpath("//h2[@class='modal-title h1 text-center font-light']")).size() != 0){
						System.out.println("Reached Maximam enquiry of trh day");
						driver.quit();

						}else{
						System.out.println("Element is Absent");
						}*/
					
					/*if (driver.findElementByXPath("/p[@class='cor-grn']").isEnabled()){
						
						driver.quit();
					}
							
					
					else if (driver.findElementByXPath("//h2[@class='modal-title h1 text-center font-light']").isEnabled()){
						
						driver.quit();
						
						}*/

				}
			}
		//}
			
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
	
	
	//@Test(priority=7)
	public void getAttributeValueOfListingsByXpath(String xpathVal,String xpathValOfContact) throws NoSuchWindowException {
		
		test=extent.startTest("Landing to View Detail Page ");
		//getAttributeValueOfListingsByXpath("//div[@class='propety-item property-item-grid anchor-block']/child::div[1]");

		String[] arr = new String[12];

		int y = 0;
		String[] ids1 = new String[12];

		String[] idv = new String[12];

		try {

			listings=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathVal)));
			
			
            System.out.println("Listings are visible " + listings);
			
			/*new DataReadAndWrite(driver,7,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Listings should be  visible " + listings);

			new DataReadAndWrite(driver,7,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","As Expected");
						
			new DataReadAndWrite(driver,7,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","PASS");*/
			
			
		   
			//listings = driver.findElements(By.xpath(xpathVal));

			//Thread.sleep(5000);

			System.out.println("Total Listing :" + listings.size());
			for (j = 0; j <= listings.size() - 1; j++) {

				ListingsValue = listings.get(j).getAttribute("onclick");

				arr[y] = ListingsValue;

				String[] parts = arr[y].split("(?=,)");
				String part1 = parts[0];

				ids1[j] = part1.replaceAll("[^0-9]", "");

				System.out.println("**************************");
				System.out.println(ids1[j]);
				
				//new DataReadAndWrite(driver,7,4,"./data/selenium__docs__automation testcase.xlsx","LeadValidation",ids1[j]);
				
				

			}
			
			Thread.sleep(4000);
			
			if(driver.findElements(By.xpath("//button[@class='close palert-close']/span")).size() != 0){
				//System.out.println("Property Alert Form is Displayed");
				driver.findElements(By.xpath("//button[@class='close palert-close']/span")).get(0).click();

				}else{
				//System.out.println("Property Alert Form is not Displayed");
				}

			
			/*if(driver.findElementByXPath("//button[@class='close palert-close']/span").isEnabled()){
				
				driver.findElementByXPath("//button[@class='close palert-close']/span").click();
			}
			
			else{*/
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
					
					//driver.switchTo().window(parent);
					
					//driver.close();

					driver.switchTo().window(newWindow);
					
					System.out.println("control is switched to child window");

					Thread.sleep(10000);
					
					//driver.switchTo().window(parent).close();
					
					
					
					//Thread.sleep(3000);

					System.out.println(driver.getTitle());
					
                    vdpUrl = driver.getCurrentUrl();
					
					

					System.out.println(vdpUrl);
					
					Thread.sleep(15000);
					
					if(vdpUrl.contains(listingid1)){
					
				//	if(vdpUrl.equalsIgnoreCase(listingid1)||(vdpUrl.equalsIgnoreCase("alangudi"))){
						
						//test.log(LogStatus.FAIL, "Check whether user land to the respective view detail page" , "User not navigated to respective  VDP page");
						
						test.log(LogStatus.PASS, "Check whether user land to the respective view detail page" , "User sucessfuly Land to the VDP page" + "  "+ listingid1);
						test.log(LogStatus.INFO, "User Landing URL"+vdpUrl);
						
					
						String screenShotPath = Capturescreeshots.capture(driver, "SearchListings-pass");
					    
					     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
					     
					     
					     
					     
					     if(!driver.findElements(By.xpath("//div[@class='lightV-top-blue-box']")).isEmpty()){
					     
					     //if(driver.findElementByXPath("//div[@class='lightV-top-blue-box']").isDisplayed()==true){
					    	 
					    	 System.out.println("View Map Element is displayed");
					    	 Thread.sleep(3000);
					    	enterById("strname", "prabhumarvin"); 
					 		enterById("stremail","prabhumarvin7@mailinator.com"); 
					 		enterById("mobileno", "9871276890");
					 		clickById("agent-enquiry-submit");
					    	 
					     }
					     
					     else{
					    	 
					    	 System.out.println("View Map Element is not displayed");
					    	 driver.findElementByXPath(xpathValOfContact).click();
					    	 
					    	  Thread.sleep(3000);
					    	    enterById("strname", "prabhumarvin"); 
						 		enterById("stremail","prabhumarvin7@mailinator.com"); 
						 		enterById("mobileno", "9871276890");
						 		clickById("enquiry-submit");
					     }
					     
					    // driver.findElementByXPath(xpathValOfContact).click();
					     
					     
					     
					     Thread.sleep(10000);
					     
					}
					
					else{
						
						test.log(LogStatus.FAIL, "Check whether user land to the respective view detail page" , "User not able to land to respective   VDP page" + "  "+ listingid1);
						test.log(LogStatus.INFO, "User Landing URL"+vdpUrl);
						
						
						String screenShotPath = Capturescreeshots.capture(driver, "SearchListings-fail");
					    
					     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
						
					}
					
					/*else{
						//test.log(LogStatus.FAIL, "Check whether user land to the respective view detail page" , "User not navigated to respective  VDP page");
						test.log(LogStatus.PASS, "Check whether user land to the respective view detail page" , "User sucessfuly Land to the VDP page" + "  "+ listingid1);
						test.log(LogStatus.INFO, "User Landing URL"+vdpUrl);
					}*/
					
					
					/*if(driver.findElements(By.className("icon-filter margin-right")).isEmpty()){
						test.log(LogStatus.PASS, "Check whether navigate to the View Detail Page", "User sucessfully Land to View Detail Page ");
						
						test.log(LogStatus.INFO, "User Landing URL"+vdpUrl);
						
						
						System.out.println("User sucessfully Land to View Detail Page");
					}else{
						test.log(LogStatus.PASS, "Check whether navigate to the View Detail Page", "User not  Land to View Detail Page ");
					}*/

					
					
					

					/*if(driver.findElements(By.xpath("/p[@class='cor-grn']")).size() != 0){
						System.out.println("Already enquired about this property");
						driver.quit();

						}else{
						System.out.println("Element is Absent");
						}
					

					if(driver.findElements(By.xpath("//h2[@class='modal-title h1 text-center font-light']")).size() != 0){
						System.out.println("Reached Maximam enquiry of trh day");
						driver.quit();

						}else{
						System.out.println("Element is Absent");
						}*/
					
					/*if (driver.findElementByXPath("/p[@class='cor-grn']").isEnabled()){
						
						driver.quit();
					}
							
					
					else if (driver.findElementByXPath("//h2[@class='modal-title h1 text-center font-light']").isEnabled()){
						
						driver.quit();
						
						}*/
					
					Thread.sleep(5000);

				}
			}
		//}
			
			
			
			/*System.out.println("Listings are visible " + listings);
			
			new DataReadAndWrite(driver,7,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Listings should be  visible " + listings);

			new DataReadAndWrite(driver,7,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","As Expected");
						
			new DataReadAndWrite(driver,7,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","PASS");*/
			
		} catch (TimeoutException e) {
			System.err.println("The element with id :" + xpathVal + " doesn't exists " + e.getMessage());
			/*new DataReadAndWrite(driver,7,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Listings should be  visible " + listings);

			new DataReadAndWrite(driver,7,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The element with id :" + xpathVal + " doesn't exists " + e.getMessage());
						
			new DataReadAndWrite(driver,7,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			/*new DataReadAndWrite(driver,7,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Listings should be  visible " + listings);

			new DataReadAndWrite(driver,7,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","The Browser could not be found " + e.getMessage());
						
			new DataReadAndWrite(driver,7,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
			
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println("Unexpected exception in geting text by locator id :" + xpathVal + "\n" + e.getMessage());
			
			/*new DataReadAndWrite(driver,7,5,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Listings should be  visible " + listings);

			new DataReadAndWrite(driver,7,6,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","Unexpected exception in geting text by locator id :" + xpathVal + "\n" + e.getMessage());
						
			new DataReadAndWrite(driver,7,7,"./data/selenium__docs__automation testcase.xlsx","LeadValidation","FAIL");*/
			
			
			throw new RuntimeException("FAILED");
			
		}
			
			
			
		/*} catch (TimeoutException e) {
			System.err.println("The element with xpath value :" + xpathVal + " doesn't exists " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (WebDriverException e) {
			System.err.println("The Browser could not be found " + e.getMessage());
			throw new RuntimeException("FAILED");
		} catch (Exception e) {
			System.err.println(
					"Unexpected exception in geting text by locator xpath :" + xpathVal + "\n" + e.getMessage());
			throw new RuntimeException("FAILED");
		} */
		
		finally {
			takeSnap();
		}

	}

	
	
	//@Test(priority=8)
	
	public void enterById1(String idValue, String data) {
		try {
			
			 //enterById1("strname", "melvin");
			
			// wait = new WebDriverWait(driver, 30);
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
	
	//@Test(priority=9)

	public void enterById2(String idValue, String data) {
		try {
			
			// enterById2("stremail", "melvinm@mailinator.com");
			// wait = new WebDriverWait(driver, 30);
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
	
	
	//@Test(priority=10)
	public void enterById3(String idValue, String data) {
		try {
			//enterById3("mobileno", "8607650978");
			
			// wait = new WebDriverWait(driver, 30);
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
	
	
	
	
	
	
	
	
	
	

	//@Test(priority=13)
	public void openNewTab(String a, int wincount) {
		
		try {
			test=extent.startTest("Landing of Onboarding Interface Login Page ");
			//openNewTab("window.open('http://onboarding.indiaproperty.com/','_blank');",2);
			((JavascriptExecutor) driver).executeScript(a);

			String windowHandle = driver.getWindowHandle();
			
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			
	    	System.out.println(tabs2.size());
			
			driver.switchTo().window(tabs2.get(wincount));
			
			String onboardingLoginPage =driver.getCurrentUrl();
			Thread.sleep(3000);
			
			System.out.println(onboardingLoginPage);
			
			
			if(onboardingLoginPage.equalsIgnoreCase("http://onboarding.indiaproperty.com/"))
			
			
			  {
				
				test.log(LogStatus.PASS, "Check whether user land to onboarding login Page", "User sucessfully land to Onboarding Login Page");	
			
				

				String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
			    
			     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				
		}
			
			
			
			
			
			
			
			
			else
			{
			
			
				test.log(LogStatus.FAIL, "Check whether user land to onboarding login Page", "User unable to  land on Onboarding Login Page");
			
				String screenShotPath = Capturescreeshots.capture(driver, "screenShotName");
			    
			     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
			
			}
			
			
			
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//@Test(priority=17)
	public void openNewTab2(String a, int wincount) {

		try {
			
			//openNewTab2("window.open('http://onboarding.indiaproperty.com/','_blank');",2);
			((JavascriptExecutor) driver).executeScript(a);
			String windowHandle = driver.getWindowHandle();
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			System.out.println(tabs2.size());
			
			driver.switchTo().window(tabs2.get(wincount));
			
			
			String onboardingCustomerPage =driver.getCurrentUrl();
			Thread.sleep(3000);
			
			System.out.println(onboardingCustomerPage);
			
			if(!onboardingCustomerPage.equalsIgnoreCase("http://onboarding.indiaproperty.com/customervalidation/1675967")){
				
				
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//@Test(priority=18)
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
	
	public void listingStatusAcive(String xpath){
		
		WebElement ListingActive=driver.findElementByXPath(xpath);
		
		
	}
	
	
public void listingStatusexpired(String xpath){
		
		WebElement ListingExpired=driver.findElementByXPath(xpath);
		
		
	}
	
	
	//@Test(priority=19)
	public void onbTableFreshenq(String xpathValue) {
		
		
		//onbTableFreshenq("//table[@id='freshleadlists']//following-sibling::tr/td//a[@class='mediumtxt clr1']");
		//ArrayList<String> str2 = new ArrayList<String>();

		//ArrayList<String> dateInFreshEnqTable = new ArrayList<String>();

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
			/*
			List<WebElement>fListingStatus=driver.findElementsByXPath("//table[@id='freshleadlists']//following-sibling::tr/td[4]");
			
			
			for(n=0;n<=fListingStatus.size()-1;n++){
				
				freshenqListingStatus=fListingStatus.get(n).getText();
				
				fEnqListingStatus.add(n, freshenqListingStatus);
				fEnqListingStatus.toString().trim();
				
				System.out.println(fEnqListingStatus);
			}*/
			

		}

		
		System.out.println(str.size());
	}
	

	
	
	//@Test(priority=20)
	public void onbTableDuplicateEnq(String xpathValue) {
		
		//onbTableDuplicateEnq("//table[@id='duplicateleadlists']//following-sibling::tr/td//a[@class='mediumtxt clr1']");
		
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
			
			
/*List<WebElement>dListingStatus=driver.findElementsByXPath("//table[@id='duplicateleadlists']//following-sibling::tr/td[4]");
			
			
			for(n=0;n<=dListingStatus.size()-1;n++){
				
				duplicateenqListingStatus=dListingStatus.get(n).getText();
				
				dEnqListingStatus.add(n, freshenqListingStatus);
				dEnqListingStatus.toString().trim();
				
				System.out.println(dEnqListingStatus);
			}*/
			
			

		}

		
		System.out.println(listingIdsInDuplicateEnqTable.size());
	}
	
	//@Test(priority=21)
	public void onbTableCombined() {
		

		

	
		listingIdCollection.addAll(str);
		
		listingIdCollection.addAll(listingIdsInDuplicateEnqTable);
		
		
		listingIdCollection.toString().trim();
		
		//**********************************
		
		listingStatusCombined.addAll(fEnqListingStatus);
		
		System.out.println(listingStatusCombined);
		
		listingStatusCombined.addAll(dEnqListingStatus);
		listingStatusCombined.toString().trim();
		
		
			System.out.println(listingIdCollection);
			
			System.out.println(listingIdCollection.size());
			
			//System.out.println(listingStatusCombined);
			
			System.out.println(listingStatusCombined.size());
			
			

		}

	
	
	
	//************************************
	
	
	public void onbTableStatusCombined() {
		

		

		
		
	
		
		listingStatusCombined.addAll(fEnqListingStatus);
		
		System.out.println(listingStatusCombined);
		
		listingStatusCombined.addAll(dEnqListingStatus);
		System.out.println(listingStatusCombined);
		listingStatusCombined.toString().trim();
		
			//System.out.println(listingIdCollection);
			
		
			
			//System.out.println(listingStatusCombined);
			
			System.out.println(listingStatusCombined.size());
			
			

		}

	
	
	
	

	//@Test(priority=22)
	public void onbTableDate(String xpathValue) {
		
		
		// onbTableDate("//table[@id='freshleadlists']//following-sibling::tr/td[10]");

		String dateInfo1 = "";

		int q = 0;

		List<WebElement> data2 = driver.findElementsByXPath(xpathValue);

		for (q = 0; q <= data2.size() - 1; q++) {

			dateInfo1 = data2.get(q).getText();
			String[] dateFreshEnq=dateInfo1.split(" ");
			
			String Date = dateFreshEnq[0];
			//String Time = DateTime[1];
			//System.out.println(dateInfo);

			System.out.println("*****************************");
		
			dateInFreshEnqTable.add(Date);
			
			

			dateInFreshEnqTable.toString().trim();
			
			System.out.println(dateInFreshEnqTable);

		}
			
		
	}
	
	//@Test(priority=23)
	
	public void onbTableDateDuplicate(String xpathValue) {

		
		//onbTableDateDuplicate("//table[@id='duplicateleadlists']//following-sibling::tr/td[8]");
		
		String dateInfo2 = "";

		int q = 0;

		List<WebElement> data3 = driver.findElementsByXPath(xpathValue);

		for (q = 0; q <= data3.size() - 1; q++) {

			dateInfo2 = data3.get(q).getText();
			String[] dateFreshEnq=dateInfo2.split(" ");
			String Date = dateFreshEnq[0];
			
			//System.out.println(dateInfo);

			System.out.println("*****************************");
		
			dateInDuplicateEnqTable.add(Date);
			
			

			dateInDuplicateEnqTable.toString().trim();
			
			System.out.println(dateInDuplicateEnqTable);

		}
			
		
	}
	
	
//	@Test(priority=24)
public void onbTableDateCombined() {
		

		

	
		enquiryTableDateCollection.addAll(dateInFreshEnqTable);
		
		System.out.println(enquiryTableDateCollection);
		
		enquiryTableDateCollection.addAll(dateInDuplicateEnqTable);
		
		
		enquiryTableDateCollection.toString().trim();
			System.out.println(enquiryTableDateCollection);
			
			System.out.println(enquiryTableDateCollection.size());
			
			

		}
	
	
	
	
	
	
	
	//@Test(priority=25)
	

	public void leadValidation() throws IOException, InterruptedException {

		test=extent.startTest("Validating the Posted Lead in Onboarding Interface");
		
		boolean flag_lead = false;
	//	String lead_details = "";
		if(!enquiryTableDateCollection.contains(currentDate)) {
			
			//test.log(LogStatus.FAIL, "Check whether current date of enquiry is captured", "current Date of enquiry is not captured");
			System.out.println("Date Not Captured and Hence Enquiry is not captured in Onboarding Interface ");
			
		//driver.quit();
		}
		
		else{
			
			
		
		for ( a = 0; a <=listingIdCollection.size()-1; a++) {
			
			
			
		
			if(listingid1.equalsIgnoreCase(listingIdCollection.get(a))&&(currentDate.equalsIgnoreCase(enquiryTableDateCollection.get(a)))){
					
			
				
				flag_lead = true;
				
				listingStatusout=listingStatusCombined.get(a);
				
				System.out.println(listingStatusout);
				
				
				
				//System.out.println("Lead has  Capured in Onboarding Interface:" +"Listing Id : " +" "+listingIdCollection.get(a)+" "+"Last Enquired Date :"+" "+enquiryTableDateCollection.get(a));
				lead_details="Lead has  Capured in Onboarding Interface:" +"Listing Id : " +" "+listingIdCollection.get(a)+" "+"Last Enquired Date :"+" "+enquiryTableDateCollection.get(a);
	
				
				
			
		
		
				break;
				
			

		}
		
		
					
					
			else{
				flag_lead = false;
				//System.out.println("Lead has not Capured in Onboarding Interface:" +"Listing Id : " +" "+listingIdCollection.get(a)+" "+"Last Enquired Date :"+" "+enquiryTableDateCollection.get(a));
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
				

			//driver.quit();

						
				
					
			}	
	
	}
	
	
				
	
		
	
		
	
	//public void userDashboardenq() throws InterruptedException, IOException{
						
     public void openNewTabForAdminPage(String a, int wincount)throws InterruptedException, IOException{
		
    	 ((JavascriptExecutor) driver).executeScript(a);
		
		test=extent.startTest("Landing of IP-Admin Page for auto-login by Listing Id");
						
						//System.out.println("Hi IP-Admin");
		String windowHandle = driver.getWindowHandle();	
						ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
						System.out.println(tabs3.size());
						
						driver.switchTo().window(tabs3.get(3));
						
				String adminPageActualTitle="Property, India Property, Real Estate, Dealers";		
						
			  String adminPageTitle=driver.getTitle();
					
					
					System.out.println(adminPageTitle);
					
					
					if(adminPageActualTitle.equalsIgnoreCase(adminPageTitle)){
						
						
						test.log(LogStatus.PASS, "Check whether user land to IP-Admin Page", "User sucessfully land to IP-Admin Page");	
						
						
						

						String screenShotPath = Capturescreeshots.capture(driver, "screenShotName11");
					    
					     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
						
						
					}
					
					else{
						
						test.log(LogStatus.FAIL, "Check whether user land IP-Admin Page", "User not  land to IP-Admin Page");	
						
						
						

						String screenShotPath = Capturescreeshots.capture(driver, "screenShotName12");
					    
					     test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
						
					}
					
					
					
					
					
					
					
					driver.findElementByName("username").sendKeys("premkumar.m@indiaproperty.com");
					
					driver.findElementByName("password").sendKeys("Elshaddaikr22");
					
					driver.findElementByName("submitbutton").click();
					
					Thread.sleep(3000);
					WebElement logoutText=driver.findElement(By.linkText("Logout"));
					
					String expectedlinkname=logoutText.getText();
					
					String actualLinkName="Logout";
					
					
	        if(actualLinkName.equalsIgnoreCase(expectedlinkname)){
						
						test.log(LogStatus.PASS, "Check whether user able to login IP-Admin Page", "User sucessfully logged in IP-Admin Page");	
						
						
						

						String screenShotPath = Capturescreeshots.capture(driver, "screenShotName13");
					    
					     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
						
					}
	        
	       else {
	        	
	        	test.log(LogStatus.FAIL, "Check whether user able to login IP-Admin Page", "User unable to logged in IP-Admin Page");	
				
				
				

	        	String screenShotPath = Capturescreeshots.capture(driver, "screenShotName14");

				 test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	        	
	        	
	        }
	        
	   //test.log(LogStatus.INFO, "Check whether user Admin able to auto-login to the user account", details);
	        
	  	  test.log(LogStatus.INFO, "Validation of auto-login  By Listing Id in Admin Interface");
	  	  
	  	String screenShotPath = Capturescreeshots.capture(driver, "screenShotName14");
					
		test.log(LogStatus.INFO, "Admin Click the Member Tab &  Click the Auto-Login in a Drop-down");
	  	
	  	WebElement member= driver.findElement(By.linkText("Member"));
					
					 screenShotPath = Capturescreeshots.capture(driver, "screenShotName14");			    
					   Actions action =new Actions(driver);
					   screenShotPath = Capturescreeshots.capture(driver, "screenShotName14");	   
					  action.moveToElement(member).build().perform();
					  Thread.sleep(3000);
					  
				
					  
					  screenShotPath = Capturescreeshots.capture(driver, "screenShotName14");  
					  
					  //test.log(LogStatus.INFO, "Admin Click the Auto-Login in a Drop-down");
					  
					  driver.findElement(By.linkText("Auto Login")).click();
					  
					  

						 test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
						 
						 test.log(LogStatus.INFO, "Admin select the Listing Id radio button");
					  
					  driver.findElement(By.id("ListingId")).click();
					  screenShotPath = Capturescreeshots.capture(driver, "screenShotName14");

						 test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
					  
						 test.log(LogStatus.INFO, "Admin Enters the enquired Listing Id"+" "+listingid1);
					  driver.findElement(By.id("value")).sendKeys(listingid1);
					  screenShotPath = Capturescreeshots.capture(driver, "screenShotName14");

						 test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
					  
						 
					  
					  driver.findElement(By.name("loginval")).click();
					  
					 /* test.log(LogStatus.INFO, "Admin Submit the form");
					screenShotPath = Capturescreeshots.capture(driver, "screenShotName14");

						 test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
					  
					  Thread.sleep(3000);
					  
					  String accoutLink=driver.findElementByXPath("//table[@id='autoLoginBox']/a").getText();
					  
					  if(accoutLink.contains("User Account")){
						  
						  
						  screenShotPath = Capturescreeshots.capture(driver, "screenShotName14");

							 test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
						  
						  test.log(LogStatus.INFO, "Admin Sucessfully Login to User Account in IP-Admin-Page");
					  
					  driver.findElement(By.xpath("//table[@id='autoLoginBox']/a/b[1]")).click();
					  
					  
					  
					  }
					  
					  
					  else{
						  
						  test.log(LogStatus.INFO, "Admin unable to  Login to User-Account ");
						  
					  }
					  
					  
					  ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
						driver.switchTo().window(tabs4.get(4));

		
		
						
						test=extent.startTest("Validation of IP-Admin Auto-Login of User Dashboard");
				  
					
					String userDashboardexpected="My Properties - Properties & Real Estate in India - India Property Portal";
					
					String userDashboardActual=driver.getTitle();
					
					if(userDashboardexpected.equalsIgnoreCase(userDashboardActual)){
						
						test.log(LogStatus.PASS, "Check whether Admin able to navigate to user Dahboard through auto-login", "User sucessfully land to user dashboard."+" "+"Seller Listing Id"+" : "+listingid1);	
						
						
						

						screenShotPath = Capturescreeshotsfull.capture(driver, "screenshotout");
					    
					     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
						
					}
					
					
					else{
						
						test.log(LogStatus.FAIL, "Check whether Admin able to navigate to user Dahboard through auto-login", "User unable to land to user dashboard"+"User Listing Id"+listingid1);	
						
						
						

						screenShotPath = Capturescreeshotsfull.capture(driver, "screenshotout");
					    
					     test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture(screenShotPath));
						
						
					}
											
								
							
							
					}	
						
					
	
     public void LeadValidationInDashboard(String linkName,String subLinkName,String enqCountlink) throws InterruptedException, IOException{
    	 
    	 
    	 Thread.sleep(4000);
    	 
    	 test=extent.startTest("Validating Leads in Dashboard");
    	
    	 
    	 if(listingStatusout.equalsIgnoreCase("Active")){
				
    		
    		 
				List<WebElement> test1  =driver.findElements(By.xpath("//div[@class='txt12 left']"));
				List<WebElement> test2 =driver.findElements(By.xpath("//div[@class='txt12 right']/a"));
				//System.out.println("Count is"+test1.size());
				
				int val=test1.size();
				
				 
				for(int i=0;i<val-4;i++){
					
					
					value=test1.get(0).getText();
					
					
					System.out.println(value);
					
					
					
				  /*test.log(LogStatus.INFO, "Name & Mobile Number of the enquired user"+" "+ value);
				  
				  String screenShotPath = Capturescreeshots.capture(driver, "screenShotName12");
				  
				  test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
			
				}
				
				int val2=test2.size();
				
				for(int j=0;j<=val2-5;j++){
					
					 					
				value2=test2.get(0).getText();
			
				
				System.out.println(value2);
				
				
				
				String[] recentEnqDashboard = value2.split("(?<=\\D)(?=\\d)");
    			System.out.println(recentEnqDashboard[0]);
    			System.out.println(recentEnqDashboard[1]);
    			
    			
    			System.out.println(recentEnqDashboard);
    			
    			
    			recentLeadListing=recentEnqDashboard[1].trim();
				
				
				
				/*test.log(LogStatus.INFO, "Enquired Listing Id"+" "+value2);
				String screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
				test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));*/
				
				if(value.equalsIgnoreCase("Prabhumarvin,"+" "+"+91-9871276890")&&recentLeadListing.equalsIgnoreCase(listingid1)){
					
					
					test.log(LogStatus.PASS, "Check whether the Posted Enquiry captured in Recent Lead Section", "Posted Enquiry is captured in Recent Lead section in Dashboard");
					//test.log(LogStatus.INFO, "Lead Capured in Recent Lead section in Dashboard");
					
					test.log(LogStatus.INFO, "Name & Mobile Number of the enquired user"+" : "+value);
					
					test.log(LogStatus.INFO, "Enquired Listing id"+" : "+listingid1);
					
						
					  
					 String screenShotPath = Capturescreeshots.capture(driver, "screenShotName12");
					  
					  test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
					
				}
				
				else{
					
					test.log(LogStatus.FAIL, "Check whether the Posted Enquiry captured in Recent Lead Section", "Posted Enquiry is not captured in Recent Lead section in Dashboard");
					
					test.log(LogStatus.FAIL, "Lead not captured in Dashboard");
				}
				
				
				 test.log(LogStatus.INFO, "Validating Leads in My Leads Page");
				 
				 test.log(LogStatus.INFO, "User Click the My Lead tab");
				
				driver.findElementByLinkText(linkName).click();
				Thread.sleep(10000);
				
				String screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
				test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				test.log(LogStatus.INFO, "User click the sub-tab Sale Leads");
				
				driver.findElementByXPath(subLinkName).click();
				Thread.sleep(3000);
				screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
				test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				test.log(LogStatus.INFO, "User Select the Enquired Listing Id in the dropdown");
				
				Select listingiddropdown= new Select(driver.findElementById("listingid"));
				
				
				
				Thread.sleep(5000);
					
								
				listingiddropdown.selectByValue(listingid1);
				screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
				test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
			
				//test.log(LogStatus.INFO, "User click the Email/SMS enquiry link");
				
				driver.findElementByXPath(enqCountlink).click();
				
				Thread.sleep(10000);
				
				
				String MyLeadPageTitle="My Leads - Properties & Real Estate in India - India Property Portal";
				
				String expectedTitle=driver.getTitle();
				
				System.out.println(expectedTitle);
				
				//test.log(LogStatus.INFO, "Validating Posted Enquiry in My Lead Page");
				
				test=extent.startTest("Validating Posted Leads in My Leads Page");
				
				if(MyLeadPageTitle.equalsIgnoreCase(expectedTitle)){
				
				test.log(LogStatus.PASS, "Check whether the User Landed to the My Leads Page", "User  Sucessfully Land to the My Lead Page");
				
				System.out.println("User Sucessfully Land to My Lead Page");
				
				screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
				test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
				
				
				}
				
				else{
					
					test.log(LogStatus.FAIL, "Check whether the User Landed to the My Leads Page", "User have not  Land to the My Lead Page");
					
					System.out.println("User Sucessfully Land to My Lead Page");
					
					screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
					test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
					
				}
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");

				Date date = new Date();

				// Now format the date
				currentSystemDate = dateFormat.format(date);
				currentDate = currentSystemDate.trim();
				// Print the Date
				
				//test.log(LogStatus.INFO, "Verify of Current date" + "  "+ currentDate);
				
				System.out.println(currentDate);
				
				
				
				
				test.log(LogStatus.INFO, "User Focus on Calender & User select the  start date (Today Date) in a Calender");
				driver.findElementByXPath("//input[@id='startdate4']/following::img[@class='ui-datepicker-trigger']").click();
	    		 Thread.sleep(5000);
	    		    		    		
	    		 
	    	
	    		 
	      		screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
	  				test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	    		 
	    		driver.findElementByXPath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']/a").click();
	    		
	    		 Thread.sleep(5000);
	    		driver.findElementByXPath("//input[@id='enddate4']/following::img[@class='ui-datepicker-trigger']").click();
	    		 
	    		 Thread.sleep(5000);
	    		 
	    		 test.log(LogStatus.INFO, "User select the  end date (Today Date) in a Calender");
	    		 
	       		screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
	   				test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
	    		 driver.findElementByXPath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']/a").click();
	    		 Thread.sleep(5000);
	    		 
	    		 
	    		 
	    		
	    		 
	    		 driver.findElementByClassName("blueBtn1").click();
	    		 
	    		 //test.log(LogStatus.INFO, "User submitted the form");
	    		 
	    		
	    		 
	    		 Thread.sleep(10000);
	    		
				
				
				String enqDateinTable=driver.findElementByXPath("//tr[@class='bgclr3']/td[2]").getText().trim();
				
				System.out.println(enqDateinTable);
				
				
				
				String enqNameinTable=driver.findElementByXPath("//tr[@class='bgclr3']/td[3]").getText().trim();
				System.out.println(enqNameinTable);
				
				
				
				String enqEmailinTable=driver.findElementByXPath("//tr[@class='bgclr3']/td[4]").getText().trim();
				System.out.println(enqEmailinTable);
				
				
				
				String enqMobileinTable=driver.findElementByXPath("//tr[@class='bgclr3']/td[5]").getText().trim();
				System.out.println(enqMobileinTable);
				
			
				test=extent.startTest("Validation of Posted Leads in My Leads Page");
				
				
				
				if(currentDate.equalsIgnoreCase(enqDateinTable)&&(enqEmailinTable.equalsIgnoreCase("prabhumarvin7@mailinator.com")&&(enqMobileinTable.equalsIgnoreCase("(+91)"+"-"+"9871276890")))){
					
					test.log(LogStatus.PASS, "Check whether Posted enquiry is captured in My Leads Page", "Posted Enquiry is Captured in My Leads Page");
					System.out.println("Lead has Captured in My Leads Page");
					
					
					//test.log(LogStatus.INFO, "Posted Enquiry Captured in User Dashboard");
					test.log(LogStatus.INFO, "EnquiryDate"+" "+enqDateinTable);
					test.log(LogStatus.INFO, "Enquired User Name"+" "+enqNameinTable);
					test.log(LogStatus.INFO, "Enquired Email Id"+" "+enqEmailinTable);
					test.log(LogStatus.INFO, "Mobile Number"+" "+enqMobileinTable);
					
					//test.log(LogStatus.INFO, "Name"+" "+enqNameinTable+"Email"+" "+enqEmailinTable+"Mobile Number"+" "+enqMobileinTable);
					screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
					test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
					
					
					
					
				}
				
				else{
					
					test.log(LogStatus.FAIL, "Check whether Posted enquiry is captured in My Leads Page", "Posted Enquiry is not Captured in My Leads Page");
					
					test.log(LogStatus.INFO, "Lead Not Captured in User Dashboard");
					
					screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
					test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
					
					
				}
				
				
				}
		}
    	 
    	 else {
    		 
    		 
    	 if(listingStatusout.equalsIgnoreCase("Expired")){
    		 
    		 test.log(LogStatus.INFO, "User click Expired Enquiry link in Dashboard");
    		 
    		String screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
				test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
    		 
    		 driver.findElementByXPath("//div[contains(text(),'Expired Listing Leads  ')]/span/a").click();
    		 
    		 Thread.sleep(3000);
    		 
    		
    		 driver.findElementByXPath("//input[@id='startdate']/following::img[@class='ui-datepicker-trigger']").click();
    		 Thread.sleep(5000);
    		 
    		 
    		
    		 
    		 test.log(LogStatus.INFO, "User select the  start date (Today Date) in a Calender");
    		 
      		screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
  				test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
    		 
    		driver.findElementByXPath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']/a").click();
    		
    		 Thread.sleep(5000);
    		driver.findElementByXPath("//input[@id='enddate']/following::img[@class='ui-datepicker-trigger']").click();
    		 
    		 Thread.sleep(5000);
    		 
    		 test.log(LogStatus.INFO, "User select the  end date (Today Date) in a Calender");
    		 
       		screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName12");
   				test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
    		 driver.findElementByXPath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']/a").click();
    		 Thread.sleep(5000);
    		 
    		 
    		 
    		 Thread.sleep(10000);
    		 
    		 driver.findElementByClassName("blueBtn1").click();
    		 
    		// test.log(LogStatus.INFO, "User submit the form");
    		
    		 
    		 Thread.sleep(10000);
    		 
              
    		
    		
    		
    		List<WebElement> expiredListingidvalue=driver.findElementsByXPath("//tr[@class='bgclr3']/td[1]");
    		
    		
    		List<WebElement> enqCountArray=driver.findElementsByXPath("//td[@class='nosuggmatch boldtxt textcenter']/following::tr[@class='bgclr3']/td[3]");
    		

    		
    		for(int k=0;k<expiredListingidvalue.size()-1;k++){
    			
    			String expiredListingids=expiredListingidvalue.get(k).getText();
    			
    			
    			String[] part = expiredListingids.split("(?<=\\D)(?=\\d)");
    			System.out.println(part[0]);
    			System.out.println(part[1]);
    			
    			
    			System.out.println(expiredListingids);
    			
    			
    			part[1].trim();
    			expiredListing.add(part[1]);
    			
    			System.out.println(expiredListing);
    			
    		}
    		
    		System.out.println("*******************");
    		System.out.println(expiredListing);
    		
    		System.out.println("*******************");
    		for(int m=0;m<enqCountArray.size()-1;m++){
    			
    			String enqCountvalue=enqCountArray.get(m).getText().trim();
    			
    			expenqCount.add(enqCountvalue);
    			
    			System.out.println(expenqCount);
    			
    			countEnqTemp= Integer.parseInt( expenqCount.get(m));
    			
    			countEnq.add(countEnqTemp);
    			
    			System.out.println(countEnq);
    		}
    			
    		System.out.println("*******************");
    		System.out.println(countEnq);
    		System.out.println("*******************");
    		/*}
    		}*/
    		
    		
    		
    		
    		
    		
    	    
    	    for ( int expvalidation = 0; expvalidation <=expiredListing.size()-1; expvalidation++) {
    	    	
    	    	
    	      if(expiredListing.get(expvalidation).equalsIgnoreCase(listingid1)&& (countEnq.get(expvalidation)>0)){
    	    	  
    	    	
    	    	  
    	    	  System.out.println(listingid1+"****"+countEnq);
    	    	  
    	    	  
    	    	  System.out.println("Enquired Listing Id "+": "+expiredListing.get(expvalidation)+ ", "+"Enquiry Count"+" : "+countEnq.get(expvalidation));
    	    		  
    	    		  System.out.println("Expired Listing enquiry is captured in Expired enq table");
    	    	    	
    	    		  
    	    		  test.log(LogStatus.INFO, ("Enquired Listing Id "+": "+expiredListing.get(expvalidation)+ ", "+"Enquiry Count"+" : "+countEnq.get(expvalidation)));
    	      	       	     		
    	     		 
    	     		screenShotPath = Capturescreeshotsfull.capture(driver, "screenShotName15");
    	 				test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture(screenShotPath));
    	     		   
    	    		  
    	    	  
    	      }
    	      
    	   
    	      
    	      
    	    	
    	    }
    	   	     	    	
    		 
    	 }
			
    	 }
    	    
    
    	
    	    
    	 }	
				
				
				
			
    	 
    	 
    	 
    	 
    	 
     
     
     
				
		
		
			
					
	
												
	
	
	//@Test(priority=12)
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
			
			//driver.quit();
         
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
	
	
	public void dashBorad(String a,int wincount){
		
		String name="magesh";
		
		String email="magesh162017@gmail.com";
		
		String phone="8768908715";
		
		driver.get("http://premkumar.m@indiaproperty.com:Elshaddaikr22@indiaproperty.com");
		//http://username:password@anytestwebsite.com
		
		
		
		
		
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
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public void listingStatusDuplicate(String xpathval){
		
		List<WebElement>dListingStatus=driver.findElementsByXPath(xpathval);
		//List<WebElement>dListingStatus=driver.findElementsByXPath("//table[@id='duplicateleadlists']//following-sibling::tr/td[4]");
		
		
		for(int n=0;n<=dListingStatus.size()-1;n++){
			
			duplicateenqListingStatus=dListingStatus.get(n).getText();
			dEnqListingStatus.add(duplicateenqListingStatus);
			//dEnqListingStatus.add(n, freshenqListingStatus);
			dEnqListingStatus.toString().trim();
			
			System.out.println(dEnqListingStatus);
		}
		
		
		
	}
	
	
public void listingStatusFresh(String xpathval){
		
	List<WebElement>fListingStatus=driver.findElementsByXPath(xpathval);

	//List<WebElement>fListingStatus=driver.findElementsByXPath("//table[@id='freshleadlists']//following-sibling::tr/td[4]");
	
	
	for(int n=0;n<=fListingStatus.size()-1;n++){
		
		freshenqListingStatus=fListingStatus.get(n).getText();
		
		fEnqListingStatus.add(freshenqListingStatus);
		
		//fEnqListingStatus.add(n, freshenqListingStatus);
		fEnqListingStatus.toString().trim();
		
		System.out.println(fEnqListingStatus);
	}
		
		
		
	}

@Override
public void openNewTabForAdminPage() {
	// TODO Auto-generated method stub
	
}

@Override
public void LeadValidationInDashboard(String linkName, String subLinkName) throws InterruptedException, IOException {
	// TODO Auto-generated method stub
	
}
		
	
	}
	

	

