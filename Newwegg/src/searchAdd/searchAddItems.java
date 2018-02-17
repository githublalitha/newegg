package searchAdd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchAddItems {
	WebDriver driver;
	public searchAddItems(WebDriver driver)
	{
		this.driver = driver;
	}
	/* Entering the first item in search*/
	public void searchItems(String item) 
	{
		WebElement search1 = driver.findElement(By.xpath("//*[@id=\"haQuickSearchBox\"]"));
	    search1.sendKeys(item);
    }
	/* click on search functionality */
	public void clicksearch() 
	{
		WebElement searchbutton = driver.findElement(By.xpath("//*[@id=\"haFormQuickSearch\"]/div/div[3]/button"));
        searchbutton.click();
        
	}
	/* view results functionality*/
	public void viewresults(String xpath)
	{
        WebElement items = driver.findElement(By.xpath(xpath));
        items.click();
	}
	/* Adding item to cart*/
	public void addToCart(String xpath)
	{
      
        WebElement additem = driver.findElement(By.xpath(xpath));
        additem.click();	
	}

}



