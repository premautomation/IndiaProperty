/**
 * 
 */
package LeadReportOptimized.LeadValidationOptimized;

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
	
	


	WebDriver driver;
	
	
	
	

	@Test

	public void launch() throws InterruptedException, IOException {
	

		invokeApp("chrome", "http://www.indiaproperty.com/");
	
		clickByXpathCityClose("//*[@id='modalcity-close']");
				
		
		

		clickByXpathClickSelectCity("//div[@class='select-city']/a");
		
		
		
		

		enterByIdCityEntryCityTextBox("searchval", "Alangudi");

		clickByClassNamesCitySelectFromList("ui-menu-item");

		clickByIdHomePageSearchButton("home-searchbtn");
		getAttributeValueOfListingsByXpath(	"//div[@class='propety-item property-item-grid anchor-block']/child::div[1]");

	//	http://onboarding.indiaproperty.com/customervalidation/1656544
		
		
	/*enterById("strname", "magesh");
		enterById("stremail", "magesh162017@gmail.com");
		enterById("mobileno", "8768908715");
		clickById("agent-enquiry-submit");*/
		
	/*
		
		custid:1656544
		
		mailid:magesh162017@gmail.com
		
		mobile:8768908715
		*/
		/*
		
		//http://onboarding.indiaproperty.com/customervalidation/1641391
		enterById("strname", "melvin"); 
		enterById("stremail","melvinm@mailinator.com"); 
		enterById("mobileno", "8607650978");
		
	    clickById("agent-enquiry-submit");
		
		
		
		*/
		
		enterById("strname", "melvin"); 
		enterById("stremail","melvin1@mailinator.com"); 
		enterById("mobileno", "7607659098");
		
	    clickById("agent-enquiry-submit");
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
		
		openNewTab2("window.open(' http://onboarding.indiaproperty.com/customervalidation/1641391','_blank');", 2);
		//openNewTab2("window.open(' http://onboarding.indiaproperty.com/customervalidation/1649545','_blank');", 2);
		
		//openNewTab2("window.open(' http://onboarding.indiaproperty.com/customervalidation/1656544','_blank');", 2);
		sysDate();

		onbTableFreshenq("//table[@id='freshleadlists']//following-sibling::tr/td//a[@class='mediumtxt clr1']");

		onbTableDuplicateEnq("//table[@id='duplicateleadlists']//following-sibling::tr/td//a[@class='mediumtxt clr1']");

		onbTableCombined();

		onbTableDate("//table[@id='freshleadlists']//following-sibling::tr/td[10]");

		onbTableDateDuplicate("//table[@id='duplicateleadlists']//following-sibling::tr/td[8]");

		onbTableDateCombined();
		leadValidation();
		


	}

}
