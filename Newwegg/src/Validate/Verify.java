package Validate;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cartModify.modifyCart;
import gmailPasswrdReset.gmailPasswd;
import loginpage.login;
import passwordForget.forgetPasswrd;
import searchAdd.searchAddItems;

public class Verify {
	
		@Test
		public void validateresults() throws InterruptedException{
		
		/* Initialize driver*/
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.newegg.com/");

		/* Validate functionality*/
		login newegglogin = new login(driver);
		newegglogin.clickOnLogin();
		newegglogin.typeUserName("ctschallenge18@gmail.com");
		newegglogin.typePasswd("Challenge18");
        Thread.sleep(3000);
		newegglogin.clickSubmit();
		
		/* Validate search and add functionality*/
		searchAddItems searchadd = new searchAddItems(driver);
		// item1 search and add
		searchadd.searchItems("micro card sd San Disk 256GB Ultra");
		searchadd.clicksearch();
		searchadd.viewresults("//*[@id=\"bodyArea\"]/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/button");;
		searchadd.addToCart("//*[@id=\"landingpage-cart\"]/div/div[2]/button/span");
		// item2 search and add
		searchadd.searchItems("ps4 games uncharted the lost legacy");
		searchadd.clicksearch();
		searchadd.viewresults("//*[@id=\"bodyArea\"]/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/button");
		searchadd.addToCart("//*[@id=\"landingpage-cart\"]/div/div[2]/button");
		// item3 search and add
		searchadd.searchItems("smart thermostats INSTEON Thermostat (2441TH)");
		searchadd.clicksearch();
		searchadd.addToCart("//*[@id=\"bodyArea\"]/section/div/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/button");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		/* Modify Cart */
		modifyCart mdCart = new modifyCart(driver);
		mdCart.checkTotalPrice();
		mdCart.removeItem();
		mdCart.checkReducedPrice();
		mdCart.checkout();
		mdCart.continuebilling();
		mdCart.navigateBack();
		
		/*Forget Password*/
		forgetPasswrd frPwd = new forgetPasswrd(driver);
		frPwd.logout();
		frPwd.passwrdToemail("ctschallenge18@gmail.com");
		
		/*Reset password from gmail*/
		gmailPasswd rstPwd = new gmailPasswd(driver);
		rstPwd.gmaillogin("ctschallenge18@gmail.com");
		rstPwd.passwdLink();
			
	}

}
