package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;

public class lunchbrowserheadless {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
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
