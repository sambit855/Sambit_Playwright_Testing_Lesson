package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Browsercontext {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		{

			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//On browser context we open on multiple 	browser
			BrowserContext brws1 = browser.newContext();
			Page page = brws1.newPage();
			page.navigate("https://www.google.com/");
			String title = page.title();
			System.out.println( "Page title is : " +title);

			BrowserContext brws2 = browser.newContext();
			Page page2 = brws2.newPage();
			page2.navigate("https://www.google.com/");
			String title1 = page.title();
			System.out.println("Page title is : " + title1);

			BrowserContext brws3 = browser.newContext();
			Page page3 = brws3.newPage();
			page3.navigate("https://www.google.com/");
			String url = page.url();
			System.out.println("Page title is : " + url);

			brws1.close();// closing the browser 1
			brws2.close();// closing the browser 2
			brws3.close();// closing the browser 3

			brws1.close();// closing the browser context 1
			brws2.close();// closing the browser context 2
			brws2.close();// closing the browser context 3
			
			playwright.close();
		}

	}

}


