package gmailPasswrdReset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmailPasswd {
	
	WebDriver driver;
	public gmailPasswd(WebDriver driver)
	{
		this.driver = driver;
	}
	/*logging to gmail account to retrieve password link */
	public void gmaillogin(String loginid) throws InterruptedException
	{
		driver.get("https://www.gmail.com/");
		WebElement sign = driver.findElement(By.xpath("/html/body/nav/div/a[2]"));
	    sign.click();
	    WebElement mailID = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
	    mailID.sendKeys(loginid);
	    WebElement nextbutton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content"));
	    nextbutton.click();
	    Thread.sleep(3000);
	    WebElement mailpswrd = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
	    mailpswrd.sendKeys("2018@Challenge");
	    Thread.sleep(3000);
	    WebElement nextbutton2 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span"));
	    nextbutton2.click();
	    Thread.sleep(3000);   
	}
	/* function to navigate from gmail to newegg for new password change  */
	public void passwdLink() throws InterruptedException
	{
		WebElement inboxsrch = driver.findElement(By.xpath("//*[@id=\"gbqfq\"]"));
	    inboxsrch.sendKeys("newegg password");
	    Thread.sleep(3000);
	    WebElement srchkey = driver.findElement(By.xpath("//*[@id=\"gbqfb\"]/span"));
	    srchkey.click();
	    Thread.sleep(3000);
	    WebElement neweggpaswrd = driver.findElement(By.xpath("//*[@id=\":81\"]"));
	    neweggpaswrd.click();
	    Thread.sleep(3000);
	    WebElement resetpwrdlink = driver.findElement(By.xpath("//*[@id=\":cc\"]/div[1]/table/tbody/tr[3]/td/div/div[3]/div/a"));
	    resetpwrdlink.click();
	    WebElement newpswrd = driver.findElement(By.xpath("//*[@id=\"newpassword\"]"));
	    newpswrd.sendKeys("2018_Challenge");
	    WebElement reenternewpswrd = driver.findElement(By.xpath("//*[@id=\"newpassword1\"]"));
	    reenternewpswrd.sendKeys("2018_Challenge");
	    WebElement createpswrd = driver.findElement(By.xpath("//*[@id=\"form1\"]/div/a"));
	    createpswrd.click();
	
	}
	
}
