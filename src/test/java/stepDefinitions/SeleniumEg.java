package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumEg {
	WebDriver driver;
	@Given("user is on the home page")
	public void user_is_on_the_home_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://www.makemytrip.com/");		
		Thread.sleep(3000);
	}
	
	@When("user enters mobile number {string}")
	public void user_enters_mobile_number(String a) throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(a);
		Thread.sleep(3000);
	}
	
	@When("user clicks on continue")
	public void user_clicks_on_continue() throws InterruptedException {
		driver.findElement(By.cssSelector("button[data-cy='continueBtn']")).click();
		Thread.sleep(2000);
	}
	
	@Then("otp is sent {string}")
	public void otp_is_sent(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[id='otp']")).sendKeys(string);
		Thread.sleep(2000);	}
	
	@Then("user is able to login")
	public void user_is_able_to_login() throws InterruptedException {
		driver.findElement(By.cssSelector("button[data-cy='login']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.elementFromPoint(0,0).click()");
		Thread.sleep(2000);
		driver.close();
	}
}