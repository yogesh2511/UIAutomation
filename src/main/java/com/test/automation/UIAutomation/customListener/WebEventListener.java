package com.test.automation.UIAutomation.customListener;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;
import com.test.automation.UIAutomation.errorScreenShot.ErrorScreenShot;
import com.test.automation.UIAutomation.testBase.TestBase;

public class WebEventListener extends AbstractWebDriverEventListener implements WebDriverEventListener {

	public static final Logger log = Logger.getLogger(WebEventListener.class.getName());

	public void beforeNavigateTo(String url, WebDriver driver) {
		//System.out.println("inside method beforeNavigateTo on " + driver.toString());
		log("inside method beforeNavigateTo on : "+url);
		//log("inside method beforeNavigateTo on " + driver.toString());
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		//System.out.println("inside method afterNavigateTo on " + driver.toString());
		log("Navigated to:'" + url + "'");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		//System.out.println("inside method beforeChangeValueOf on " + driver.toString());
		log("Value of the:" + element.toString()				+ " before any changes made");
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		//System.out.println("inside method afterChangeValueOf on " + driver.toString());
		log("Element value changed to: " + element.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		//System.out.println("inside method beforeClickOn on " + driver.toString());
		log("Trying to click on: " + element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		//System.out.println("inside method afterClickOn on " + driver.toString());
		
		log("Clicked on: " + element.toString());
	}

	public void beforeNavigateBack(WebDriver driver) {
		//System.out.println("inside method beforeNavigateBack on " + driver.toString());
		log("Navigating back to previous page");
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("inside method afterNavigateBack on " + driver.toString());
		log("Navigated back to previous page");
	}

	public void beforeNavigateForward(WebDriver driver) {
		//System.out.println("inside method beforeNavigateForward on " + driver.toString());
		log("Navigating forward to next page");
	}

	public void afterNavigateForward(WebDriver driver) {
		//System.out.println("inside method afterNavigateForward on " + driver.toString());
		log("Navigated forward to next page");
	}

	public void onException(Throwable error, WebDriver driver) {
		try{
		System.out.println("inside method onException on " + driver.toString());
		log("Exception occured: " + error);
		Reporter.log("Exception occured:" , false);
		ErrorScreenShot.getScreenShot("", ".png", "");
		}	catch( Exception e)
		{
			e.printStackTrace();
		}
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("inside method beforeFindBy on " + driver.toString());
		//log("Trying to find Element By : " + by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("inside method afterFindBy on " + driver.toString());
		//log("Found Element By : " + by.toString());
	}

	/*
	 * non overridden methods of WebListener class
	 */
	public void beforeScript(String script, WebDriver driver) {
		log("beforeScript to next page : "+script);
		//System.out.println("Just before beforeScript " + driver);
	}

	public void afterScript(String script, WebDriver driver) {
		log("afterScript to next page : "+script);
		//System.out.println("Just after afterScript " + driver);

	}

	public void beforeAlertAccept(WebDriver driver) {
		log("beforeAlertAccept to next page");
		//System.out.println("inside method beforeAlertAccept on " + driver.toString());
		// TODO Auto-generated method stub
		
	}

	public void afterAlertAccept(WebDriver driver) {
		log("inside method afterAlertAccept on");
		//System.out.println("inside method afterAlertAccept on " + driver.toString());
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		log("inside method afterAlertDismiss on");
		//System.out.println("inside method afterAlertDismiss on " + driver.toString());
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		log("inside method beforeAlertDismiss on");
		//System.out.println("inside method beforeAlertDismiss on " + driver.toString());
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		log("inside method beforeNavigateRefresh on");
		//System.out.println("inside method beforeNavigateRefresh on " + driver.toString());
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		log("inside method afterNavigateRefresh on ");
		//System.out.println("inside method afterNavigateRefresh on " + driver.toString());
		// TODO Auto-generated method stub
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		log("inside method beforeChangeValueOf on :" +element.getText()+" Clicked");
		// TODO Auto-generated method stub
		//System.out.println("inside method beforeChangeValueOf on " + driver.toString());
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		log("inside method afterChangeValueOf on  :" +element.getText()+" Clicked");
		// TODO Auto-generated method stub
		//System.out.println("inside method afterChangeValueOf on " + driver.toString());
	}
	
	public void log(String data){
		log.info(data);
		Reporter.log(data);
	}
}
