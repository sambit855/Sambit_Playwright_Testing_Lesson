package playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class playwritepractice9_13_1 {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("msedge");
		lp.setHeadless(false);
		
		Browser browser=playwright.chromium().launch(lp);
		
		BrowserContext context = browser.newContext();
		context.tracing().start(new Tracing.StartOptions()
				  .setScreenshots(true)
				  .setSnapshots(true)
				  .setSources(true));
		
		Page page = browser.newPage();
		page.navigate("https://www.google.com");
		
		String url=page.url();
		System.out.println(url);
		
		// Stop tracing and export it into a zip archive.
		context.tracing().stop(new Tracing.StopOptions()
		  .setPath(Paths.get("trace.zip")));
		
//		browser.close();
//		playwright.close();

	}

}
