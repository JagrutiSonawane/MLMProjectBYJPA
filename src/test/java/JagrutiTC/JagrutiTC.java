package JagrutiTC;

//import org.openqa.selenium.By;
import org.testng.annotations.Test;

import keyword.UIKeyword;

public class JagrutiTC {
@Test
public void ClickOnDiamondProd() throws Exception {
	
UIKeyword.openBrowser("chrome");
UIKeyword.launchUrl("https://mlmproductsupply.com/");
UIKeyword.click("(//a[@class='item-link'])[5]");
Thread.sleep(3000);
UIKeyword.closeBrowser();
}
	
}
