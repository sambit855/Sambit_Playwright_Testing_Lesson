package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class practiceopeninheadlessin_chrome {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		
		LaunchOptions lp = new LaunchOptions();
	    lp.setChannel("msedge");
	    lp.setHeadless(false);
		
		Browser browser =playwright.chromium().launch(lp);
		Page page = browser.newPage();
		page.navigate("https://www.youtube.com/");
		
		page.pause();
		
		String title = page.title();
		System.out.println("title");
		
		
		String url = page.url();
		System.out.println("url");
		
		browser.close();
		playwright.close();
		
		
	}

} 
