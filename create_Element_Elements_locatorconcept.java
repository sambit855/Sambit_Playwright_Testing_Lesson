package playwright;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class create_Element_Elements_locatorconcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		Playwright playwright =  Playwright.create();
		Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext browsercontext = browser.newContext();
		Page page =browsercontext.newPage();
		page.navigate("https://www.orangehrm.com/en/30-day-free-trial");
		
		
//		//Single webelement 
//		Locator Button = page.locator("text= Contact Sales");
//		Button.hover();
//		Button.click();

//		
		Locator button = page.locator("text= Contact Sales");
		int totalbutton = button.count();
		System.out.println("total button count is :"+ totalbutton);
		button.last().click();
		
		//Multiple elements 

		Locator country= page.locator("select#Form_getForm_Country option");
		System.out.println(country.count());
	    
	     
		
		List<String>countrylist= country.allTextContents();
		for(String e : countrylist){
		System.out.println("country :" + e );
		
		
		   

		
		
		
		
//		browser.close();
//		playwright.close();
//		
		}
		
	}

}
