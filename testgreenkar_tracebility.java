package playwright;

import java.util.regex.Pattern;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

public class testgreenkar_tracebility {

	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			BrowserContext context = browser.newContext();
			Page page = context.newPage();
			page.navigate("https://rahulshettyacademy.com/seleniumPractise/#/");
			page.locator("div")
					.filter(new Locator.FilterOptions()
							.setHasText(Pattern.compile("^Brocolli - 1 Kg120–\\+ADD TO CART$")))
					.getByRole(AriaRole.LINK).nth(1).click();
			page.locator("div")
					.filter(new Locator.FilterOptions()
							.setHasText(Pattern.compile("^Cauliflower - 1 Kg60–\\+ADD TO CART$")))
					.getByRole(AriaRole.LINK).nth(1).click();
			page.locator("div")
					.filter(new Locator.FilterOptions()
							.setHasText(Pattern.compile("^Cucumber - 1 Kg48–\\+ADD TO CART$")))
					.getByRole(AriaRole.LINK).first().click();
			page.locator("div")
					.filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Beans - 1 Kg82–\\+ADD TO CART$")))
					.getByRole(AriaRole.LINK).nth(1).click();
			page.locator("div")
					.filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Apple - 1 Kg72–\\+ADD TO CART$")))
					.getByRole(AriaRole.LINK).nth(1).click();
			page.locator("div")
					.filter(new Locator.FilterOptions()
							.setHasText(Pattern.compile("^Brocolli - 1 Kg120–\\+ADD TO CART$")))
					.getByRole(AriaRole.BUTTON).click();
			page.locator("div")
					.filter(new Locator.FilterOptions()
							.setHasText(Pattern.compile("^Cauliflower - 1 Kg60–\\+ADD TO CART$")))
					.getByRole(AriaRole.BUTTON).click();
			page.getByText("Brocolli - 1 Kg120–+✔ ADDEDCauliflower - 1 Kg60–+ADD TO CARTCucumber - 1 Kg48–+").click();
			page.locator("div")
					.filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Beans - 1 Kg82–\\+ADD TO CART$")))
					.getByRole(AriaRole.BUTTON).click();
			page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Cart")).click();
			page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("PROCEED TO CHECKOUT")).click();
			page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Place Order")).click();
			page.getByRole(AriaRole.COMBOBOX).selectOption("India");
			page.getByRole(AriaRole.COMBOBOX).selectOption("India");
			page.getByRole(AriaRole.COMBOBOX).check();
			page.getByRole(AriaRole.CHECKBOX).check();
			page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Proceed")).click();
			page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Home")).click();
		}
	}
}
