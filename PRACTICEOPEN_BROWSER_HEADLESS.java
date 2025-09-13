package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PRACTICEOPEN_BROWSER_HEADLESS {

	public static void main(String[] args) {
	
		
		
		Playwright playwright  = Playwright.create();
		
		
		
		
		Browser browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false) );
		Page page = browser.newPage();
		page.navigate("https//www.google.com");
		
		String titel = page.title();
		System.out.println(" screen titel is : " + titel );
		
		String url = page.url();
		System.out.println("url is :" + url );
		
		
		browser.close();
		
		playwright.close();
		
	}

}
