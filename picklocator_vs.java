package playwright;

import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;

public class picklocator_vs {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context = browser.newContext();
        Page page = browser.newPage();
        page.navigate("https://www.flipkart.com/");
        System.out.println(page.title());
        // Use a valid locator for the search box
        page.locator("input[title='Search for Products, Brands and More']").first().click();
        page.locator("input[title='Search for Products, Brands and More']").first().fill("iphone 14 pro max");
        String searchBoxText = page.locator("input[title='Search for Products, Brands and More']").first()
                .textContent();
        System.out.println("Search box text: " + searchBoxText);
        browser.close();
        playwright.close();

        // Start a new Playwright and Browser instance for the second context and page
        Playwright playwright2 = Playwright.create();
        Browser browser2 = playwright2.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context2 = browser2.newContext();
        Page page2 = browser2.newPage();
        page2.navigate("https://www.flipkart.com/");
        System.out.println(page2.title());

        // Use a valid locator for the login button
        page2.locator("button:has-text('login')").click();

        browser2.close();
        playwright2.close();
    }

}
