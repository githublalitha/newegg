package cartModify;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class modifyCart {
	
	WebDriver driver;
	public modifyCart(WebDriver driver)
	{
		this.driver = driver;
	}
	/*checking total price of 3 items in cart*/
	public void checkTotalPrice()
	{
	    WebElement totalprice = driver.findElement(By.xpath("//*[@id=\"liMiniCart\"]/a/ins"));
	    String total = totalprice.getText();
	    System.out.println(total);
	}
	/* removing one item from cart*/
	public void removeItem() 
	{
            WebElement removeitem = driver.findElement(By.xpath("//*[@id=\"79-261-688.1.0.0\"]"));
	    removeitem.click();
	    WebElement removeselected = driver.findElement(By.xpath("//*[@id=\"removeFromCart\"]"));
	    removeselected.click();
	}
	/* checking reduced price for 2 items*/
	public void checkReducedPrice()
	{
		WebElement reducedprice = driver.findElement(By.xpath("//*[@id=\"liMiniCart\"]/a/ins"));
		String newtotal = reducedprice.getText();
		System.out.println(newtotal); 	
	}
	/* checkout functionality */
	public void checkout()
	{
		WebElement checkout = driver.findElement(By.xpath("//*[@id=\"bodyArea\"]/div[10]/div[1]/div[2]/div/a[2]"));
		checkout.click();
	}
	/*continue billing function to show the fields are highlighted with "This field is required" */
	public void continuebilling()
	{
		WebElement continuebilling = driver.findElement(By.xpath("//*[@id=\"orderSummaryPanelAndPayment\"]/div/div[4]/div/div/a"));
		continuebilling.click();
	}
	/* navigating to previous page */
	public void navigateBack()
	{
	    JavascriptExecutor js = (JavascriptExecutor) driver; 
	    js.executeScript("window.history.go(-1)");
	    driver.navigate().refresh();
	}
       
}
