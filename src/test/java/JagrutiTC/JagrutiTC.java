package JagrutiTC;

import java.util.ResourceBundle;

//import org.openqa.selenium.By;
import org.testng.annotations.Test;

import keyword.UIKeyword;

public class JagrutiTC {
	public String s,s1;

@Test
public void clickOnMainDiamondProduct() throws Exception {
	
UIKeyword.openBrowser("chrome");
ResourceBundle rb1 =ResourceBundle.getBundle("JResource");
String webUrl=rb1.getString("Url");

UIKeyword.launchUrl(webUrl);
ResourceBundle rb =ResourceBundle.getBundle("MLM");
String ItemClick=rb.getString("Diamond_Main_Xpath");
UIKeyword.click(ItemClick);
Thread.sleep(3000);
s=UIKeyword.getUrl();
UIKeyword.closeBrowser();
}

@Test
public void clickOnNeedDiamondProduct() throws Exception{
	UIKeyword.openBrowser("chrome");
	UIKeyword.launchUrl("https://mlmproductsupply.com/");
	UIKeyword.click("(//div[@class='elementor-image-box-wrapper'])[1]");
	Thread.sleep(3000);
	s1=UIKeyword.getUrl();
	UIKeyword.closeBrowser();
}

//@Test(dependsOnMethods= {"clickOnMainDiamondProduct()","clickOnNeedDiamondProduct()"})
//public void checkurlOfDiamondProduct() {
//	if(s==s1)
//		System.out.println("Both Url Is same");
//	else
//		System.out.println("URL not same");
//
//}




}
