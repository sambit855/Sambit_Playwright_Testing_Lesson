import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class practicelogin2 {

	public static void main(String[] args) {
		
//		Test case 1: Positive LogIn test
//		Open page
//		Type username student into Username field
//		Type password Password123 into Password field
//		Push Submit button
//		Verify new page URL contains practicetestautomation.com/logged-in-successfully/
//		Verify new page contains expected text ('Congratulations' or 'successfully logged in')
//		Verify button Log out is displayed on the new page

		
		Playwright playwright =Playwright.create();		
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	    Page page =	browser.newPage();
		page.navigate("https://practicetestautomation.com/practice-test-login/");
		String url = page.url();
		System.out.println(url);
		String title=page.title();
		System.out.println(title);
		
		page.locator("#username").fill("student");
		page.locator("#password").fill("Password123");
		page.locator("#submit").click();
		
		String newpageURL = page.url();
		System.out.println(newpageURL);
		
		String SuccessText =page.locator("h1.post-title:has-text(\"Logged In Successfully\")").textContent();
		System.out.println(SuccessText);
		
		boolean logout = page.locator("a.wp-block-button__link:has-text(\"Log out\")").isVisible();
		System.out.println(logout);
		
		browser.close();
		playwright.close();

	}

}
