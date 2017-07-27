/**
 * 
 */
package ProjectOne.Lead;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * @author Temp
 *
 */
public class LeadFlowTesting extends GenericWrappers2 {
	
	


	// ExtentReports report;
	// ExtentTest logger;

	// main class -IPLead.LeadProject.LeadFlow
	WebDriver driver;
	
	
	
	

	@Test

	public void launch() throws InterruptedException, IOException {
		// report=new ExtentReports("D:/DSR/Leads/LearnAutomation.html");

		// logger=report.startTest("Launch Browser", "Verify whether the crome
		// browser launched");
		// logger.log(LogStatus.INFO, "Browser started ");

		invokeApp("chrome", "http://www.indiaproperty.com/");

		// logger.log(LogStatus.INFO, "Application is up and running");

		// ***************
		clickByXpathCityClose("//*[@id='modalcity-close']");
		
		
		
		
		
		

		clickByXpathClickSelectCity("//div[@class='select-city']/a");
		
		
		
		

		enterByIdCityEntryCityTextBox("searchval", "Alangudi");

		clickByClassNamesCitySelectFromList("ui-menu-item");

		clickByIdHomePageSearchButton("home-searchbtn");
		getAttributeValueOfListingsByXpath(	"//div[@class='propety-item property-item-grid anchor-block']/child::div[1]","//li[@class='font-0']/span");

		Thread.sleep(5000);
		
		
	/*enterById("strname", "magesh");
		enterById("stremail", "magesh162017@gmail.com");
		enterById("mobileno", "8768908715");
		clickById("agent-enquiry-submit");
		*/
	/*
		
		
		
		custid:1656544
		
		mailid:magesh162017@gmail.com
		
		mobile:8768908715
		*/
		/*
		//http://onboarding.indiaproperty.com/customervalidation/1642084
		//1642084
		enterById("strname", "melvin"); 
		enterById("stremail","melvinm@mailinator.com"); 
		enterById("mobileno", "8607650978");
		
	    clickById("agent-enquiry-submit");
		
		
		
		*/
		
		
		//http://onboarding.indiaproperty.com/customervalidation/1671426
		
		//ravikrish
		//ravikrish1@mailinator.com
		//9876541567
		
		/*enterById("strname", "ravikrish");
		enterById("stremail", "ravikrish1@mailinator.com");
		enterById("mobileno", "9876541567");
		clickById("enquiry-submit");
		*/
		
		
		//http://onboarding.indiaproperty.com/customervalidation/1675795
		
		/*enterById("strname", "durai");
		enterById("stremail", "durai1@mailinator.com");
		enterById("mobileno", "8790156434");
		clickById("enquiry-submit");*/
		
		
		
		//http://onboarding.indiaproperty.com/customervalidation/1675818
		
		/*enterById("strname", "durai");
		enterById("stremail", "durai19@mailinator.com");
		enterById("mobileno", "8904156341");
		clickById("enquiry-submit");*/
		
		//http://onboarding.indiaproperty.com/customervalidation/1675845
		
		/*enterById("strname", "ravikumar");
		enterById("stremail", "ravikumar12@mailinator.com");
		enterById("mobileno", "9891908111");
		clickById("enquiry-submit");
		*/
		
		
		
		/*enterById("strname", "melvin"); 
		enterById("stremail","melvinm@mailinator.com"); 
		enterById("mobileno", "8607650978");
		clickById("enquiry-submit");*/
		
		////http://onboarding.indiaproperty.com/customervalidation/1672847
		
		
		/*enterById("strname", "vignesh");
		enterById("stremail", "vignesh1@mailinator.com");
		enterById("mobileno", "8767891089");
		clickById("agent-enquiry-submit");*/
		
		
		/*enterById("strname", "marvin");
		enterById("stremail", "marvin2@mailinator.com");
		enterById("mobileno", "8997808662");
		clickById("agent-enquiry-submit");
		*/
		/*enterById("strname", "melvin"); 
		enterById("stremail","melvinm@mailinator.com"); 
		enterById("mobileno", "8607650978");
		
	    clickById("agent-enquiry-submit");*/
		
		
		//http://onboarding.indiaproperty.com/customervalidation/1675967
		
		/*enterById("strname", "prabhumarvin"); 
		enterById("stremail","prabhumarvin7@mailinator.com"); 
		enterById("mobileno", "9871276890");
		
	    clickById("agent-enquiry-submit");*/
		
		
		
		Thread.sleep(10000);
		verifypopup();

		openNewTab("window.open('http://onboarding.indiaproperty.com/','_blank');", 1);

		/*enterById("username", "premkumar.m@indiaproperty.com");
		enterById("pass", "Elshaddaikr22");
		clickById("send");*/

		
		enterByIdAthenticate("username", "premkumar.m@indiaproperty.com");
		enterByIdAthenticate("pass", "Elshaddaikr22");
		clickById("send");
		
		Thread.sleep(3000);
		
		//openNewTab2("window.open(' http://onboarding.indiaproperty.com/customervalidation/1642084','_blank');", 2);
		openNewTab2("window.open(' http://onboarding.indiaproperty.com/customervalidation/1675967','_blank');", 2);
		
		//openNewTab2("window.open(' http://onboarding.indiaproperty.com/customervalidation/1656544','_blank');", 2);
		sysDate();

		onbTableFreshenq("//table[@id='freshleadlists']//following-sibling::tr/td//a[@class='mediumtxt clr1']");

		onbTableDuplicateEnq("//table[@id='duplicateleadlists']//following-sibling::tr/td//a[@class='mediumtxt clr1']");
		
		listingStatusFresh("//table[@id='freshleadlists']//following-sibling::tr/td[4]");
		
		listingStatusDuplicate("//table[@id='duplicateleadlists']//following-sibling::tr/td[4]");

		onbTableCombined();
		onbTableStatusCombined();
		
		

		onbTableDate("//table[@id='freshleadlists']//following-sibling::tr/td[10]");

		onbTableDateDuplicate("//table[@id='duplicateleadlists']//following-sibling::tr/td[8]");

		onbTableDateCombined();
		leadValidation();
	
		openNewTabForAdminPage("window.open('http://premkumar.m@indiaproperty.com:Elshaddaikr22@www.indiaproperty.com/admin/login_page.php','_blank');", 3);
				
		LeadValidationInDashboard("My Leads","//div[@id='subMenu']/a[2]","//tr[@class='bgclr3']/td/a/following::td/a");
		
			
		
		
		

		

	}

}
