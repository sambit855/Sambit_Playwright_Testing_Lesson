package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class testcodegen {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create(); {
			
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		       
		     
		      BrowserContext context = browser.newContext();
		      
		    
		      Page page = context.newPage();
		      page.setDefaultTimeout(200000);
		      page.navigate("https://www.amazon.in/");
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Hello, sign in Account & Lists")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter your mobile number or")).click();

		     
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue")).click();
		      
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Send OTP")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter OTP")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter OTP")).fill("12345");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Verify OTP Button")).click();
		    }
		  }
		}

