package yogitaTC;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import keyword.UIKeyword;

public class TestCases {

	@Test
	public void testcase1() {
		UIKeyword.openBrowser("chrome");
		UIKeyword.launchUrl("https://mlmproductsupply.com/");
		UIKeyword.click(By.cssSelector("li[id=menu-item-23388]>a.item-link"));
		}

	@Test
	public void islogoDisplayed() {
		UIKeyword.openBrowser("chrome");
		UIKeyword.launchUrl("https://mlmproductsupply.com/");
		boolean display = UIKeyword.isdisplayed(
				By.cssSelector("img[src=\"https://mlmproductsupply.com/wp-content/uploads/2020/12/logo-hlt.png\"]"));
		Assert.assertEquals(display, true);
		System.out.println("Logo is visible");
	}

	@Test
	public void allCategories() {
		UIKeyword.openBrowser("chrome");
		UIKeyword.launchUrl("https://mlmproductsupply.com/");
		UIKeyword.click("//div[@class=\"fancy-select-replaced\"]");
		List<String> elements = UIKeyword.Elements(By.cssSelector("div.fancy-select-results>ul>li"));
		List<String> searchCategory = new ArrayList<String>();
		searchCategory.add("All categories");
		searchCategory.add("Corporate Gifting");
		searchCategory.add("Diamond Products");
		searchCategory.add("EDUCATIONAL PRODUCTS");
		searchCategory.add("ELECTRICAL PRODUCTS/ HOT ITEMS");
		searchCategory.add("ESSENTIAL PRODUCTS");
		searchCategory.add("HEALTH & SAFETY");
		searchCategory.add("HLT Electronics Products");
		searchCategory.add("HLT GEYSERS /WATER PURIFIER");
		searchCategory.add("HLT Products");
		searchCategory.add("SECURITY PRODUCTS");
		searchCategory.add("SECURITY SYSTEMS");
		searchCategory.add("SEEN ON TV");
		Assert.assertTrue(elements.containsAll(searchCategory), "Both List not Equal" + searchCategory);
		System.out.println("List match");
	}
}
