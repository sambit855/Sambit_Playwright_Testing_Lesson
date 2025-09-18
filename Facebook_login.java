package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Facebook_login {

	public static void main(String[] args) {

Playwright playwright = Playwright.create();
Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
Page page = browser.newPage();
page.navigate("https://www.facebook.com/");
String title = page.title();
System.out.println("page title is |:" +title);


page.locator("id=email").click();
page.locator("id=email").fill("sambit85@gmail.com");
page.locator("id=pass").click();
page.locator("id=pass").fill("gsds#42jsh");

page.locator("button[name=login]").click();
browser.close();







	}


}

