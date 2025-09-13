package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class lunchbrwoser {

	public static void main(String[] args) {
		
		
		
		Playwright playwright=Playwright.create();
		
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);        //set lunch option 
		
		
		Browser browser=playwright.chromium().launch(lp);
	    Page page = browser.newPage();
	    page.navigate("https://www.google.com");
	    
	    String title= page.title();
	    System.out.println("Page title is  :" +title);
	    
	    String url = page.url();
	    System.out.println("pgae url is :" +url);
		
	    browser.close();
	    
	    playwright.close();
	
	}

}
