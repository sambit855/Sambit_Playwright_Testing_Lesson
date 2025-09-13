package playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;

public class practicecodegen_9_14 {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("msedge");
		lp.setHeadless(false);

		Browser browser = playwright.chromium().launch(lp);

		BrowserContext context = browser.newContext();
		context.tracing().start(new Tracing.StartOptions().setScreenshots(true).setSnapshots(true).setSources(true));

		Page page = context.newPage();
		page.navigate("https://demo.playwright.dev/todomvc/#/");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("real TodoMVC app.")).click();
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Download")).click();
		Download download = page.waitForDownload(() -> {
		page.navigate("https://todomvc.com/");

			// Stop tracing and export it into a zip archive.
			context.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("trace.zip")));

		});
	}

}
