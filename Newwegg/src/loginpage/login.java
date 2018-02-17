
package loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	

	WebDriver driver;
	public login(WebDriver driver)
	{
		this.driver = driver;
	}
	/*login functionality */
	public void clickOnLogin()
	{
		WebElement login = driver.findElement(By.xpath("//*[@id=\"usaSite\"]/a"));
		login.click();
	}
	public void typeUserName(String loginid)
	{
		WebElement username = driver.findElement(By.id("UserName"));
		username.sendKeys(loginid);
	}
	public void typePasswd(String ctsPassword)
	{
		WebElement password = driver.findElement(By.id("UserPwd"));
		password.sendKeys(ctsPassword);
	}
	public void clickSubmit() 
	{
		WebElement submt = driver.findElement(By.id("submit"));
		submt.click();
	}
	
}
