package playwright;

import java.nio.file.Paths;
import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;
import com.microsoft.playwright.options.AriaRole;

public class screenshot {

	public static void main(String[] args) {
	          Playwright playwright = Playwright.create(); {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		   // Start tracing before creating / navigating a page.
		      context.tracing().start(new Tracing.StartOptions()
		    		  .setScreenshots(true)
		    		  .setSnapshots(true)
		    		  .setSources(true));
		      
		      Page page = context.newPage();
		      page.navigate("https://rahulshettyacademy.com/seleniumPractise/#/");
		      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Brocolli - 1 Kg120–\\+ADD TO CART$"))).getByRole(AriaRole.LINK).nth(1).click();
		      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Cauliflower - 1 Kg60–\\+ADD TO CART$"))).getByRole(AriaRole.LINK).nth(1).click();
		      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Brocolli - 1 Kg120–\\+ADD TO CART$"))).getByRole(AriaRole.BUTTON).click();
		      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Cauliflower - 1 Kg60–\\+ADD TO CART$"))).getByRole(AriaRole.BUTTON).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Cart")).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("PROCEED TO CHECKOUT")).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Place Order")).click();
		      page.getByRole(AriaRole.COMBOBOX).selectOption("Afghanistan");
		 
		    
		      page.getByRole(AriaRole.CHECKBOX).check();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Proceed")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Home")).click();
		      
		   // Stop tracing and export it into a zip archive.
		      context.tracing().stop(new Tracing.StopOptions()
		        .setPath(Paths.get("trace.zip")));
		    }
		  }
		

	}


