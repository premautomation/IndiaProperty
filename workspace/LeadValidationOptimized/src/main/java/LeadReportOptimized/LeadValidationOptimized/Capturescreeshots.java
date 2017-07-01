package LeadReportOptimized.LeadValidationOptimized;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;



public class Capturescreeshots extends Capturescreeshotsfull{
	
	
  
	 public static String capture(WebDriver driver,String screenShotName) throws IOException
	 
	 
	    {
		 
	long number1 = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
         
	        strLong = Long.toString(number1);
	        screenShotName=strLong;
	        
	              
	        String reportvalue = new SimpleDateFormat("yyyyMMddHH").format(new Date());
			   
	        System.out.println(reportvalue);
			
	              
	        
	       TakesScreenshot ts = (TakesScreenshot)driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        
	              
	        String dest = System.getProperty("user.dir")+File.separator+reportvalue+"/images/"+screenShotName+".png";
	        File destination = new File(dest);
	        FileUtils.copyFile(source, destination);     
	      	       
	        return dest;
	        
	    }
	  
	 
}
	        
	   








