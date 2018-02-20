package passwordForget;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgetPasswrd {
	
	WebDriver driver;
	public forgetPasswrd(WebDriver driver)
	{
		this.driver = driver;
	}
	/*Logging out from the newegg account */
	public void logout() throws InterruptedException
	{
	    WebElement myaccount = driver.findElement(By.xpath("//*[@id=\"usaSite\"]/a/ins"));
	    myaccount.click();
	    WebElement logout = driver.findElement(By.xpath("//*[@id=\"usaSite\"]/div/div/ul/li[4]/a"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logout);
	    Thread.sleep(5000);
	    logout.click();
	}
	/* request password functionality*/
	
	public void passwrdToemail(String loginid) throws InterruptedException
	{
	    WebElement againlogin = driver.findElement(By.xpath("//*[@id=\"usaSite\"]/a"));
	    againlogin.click();
	    WebElement username2 = driver.findElement(By.id("UserName"));
	    username2.sendKeys(loginid);
	    WebElement forgetpswrd = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/dd[1]/form/table/tbody/tr[5]/td[2]/span/a"));
	    forgetpswrd.click();
	    WebElement email = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/dd/form/table/tbody/tr[3]/td[2]/input"));
	    email.sendKeys(loginid);
	    Thread.sleep(16000);
	    WebElement submit = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/dd/form/table/tbody/tr[6]/td/input"));
	    submit.click();
	    	
	}
    
}
