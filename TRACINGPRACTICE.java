package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TRACINGPRACTICE {

	public static void main(String[] args) {
	
		
	Playwright playwright =	Playwright.create();
	Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	BrowserContext browser1 = browser.newContext();
	Page page = browser.newPage();
	page.navigate("https://www.google.com/");
	System.out.println(page.title());
	System.out.println(page.url());;
	

	}

}
