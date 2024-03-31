package rahulshettyacademy.Tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.TestComponents.Retry;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.ProductCatalog;

public class ErrorValidationsTest extends BaseTest {
	
	@Test(groups= {"ErrorHandling"}, retryAnalyzer=Retry.class)
	public void LoginErrorValidation() {
		ProductCatalog productCatalog = landingPage.loginApplicaion("chinmayechinnu23@gmail.com", "Chinmaye@13");
		Assert.assertEquals("Incorrect email or password", landingPage.getErrorMessage());
	}
	
	@Test
	public void ProductErrorValidations() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String productName = "ZARA COAT 3";
		ProductCatalog productCatalog = landingPage.loginApplicaion("rahulshettyacademy@gmail.com", "Iamki000");
		
		List<WebElement> products = productCatalog.getProductsLists();
		productCatalog.addToCart(productName);
		CartPage cartPage = productCatalog.goToCartPage();
		
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertTrue(match);
	}

	

}
