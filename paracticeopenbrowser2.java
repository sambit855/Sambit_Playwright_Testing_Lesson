package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class paracticeopenbrowser2 {

	public static  void main(String[] args) {

		Playwright playwright = Playwright.create();
		
		
		LaunchOptions launchOption = new LaunchOptions();
		launchOption.setChannel("chrome");
		launchOption.setHeadless(false);
		
		
		Browser browser = playwright.chromium().launch(launchOption);
		Page page = browser.newPage();
		page.navigate("https://www.amazon.in/");

		
		
		String titel = page.title();
		System.out.println("titel of this page is  - " + titel);

		String url = page.url();
		System.out.println("Url of this page is --" + url);

		browser.close();
		playwright.close();
		
		
	}

}