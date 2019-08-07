package stepDefPayment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.bean.Payment;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Test {
	
	
	WebDriver driver;
	private Payment payment;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2.exe");

		driver = new ChromeDriver();
	}
	@Given("^User on Payment Detail Page$")
	public void user_on_Payment_Detail_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Users\\punitsha\\Desktop\\set A\\PaymentDetails.html");
		payment=new Payment(driver);
	}

	@When("^User enters 'invalid Card Holder Name'$")
	public void user_enters_invalid_Card_Holder_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setCardHName("");Thread.sleep(1000);
		payment.setBtnPayment();
		
	}

	@Then("^Show 'invalid  Card Holder Name'$")
	public void show_invalid_Card_Holder_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expected="Please fill the Card holder name";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^User enters 'invalid Debit Card Number'$")
	public void user_enters_invalid_Debit_Card_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setCardHName("Punit");
		payment.setDebit("");
		payment.setBtnPayment();
	}

	@Then("^Show 'invalid  Debit Card Number'$")
	public void show_invalid_Debit_Card_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    String expected="Please fill the Debit card Number";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}
	@When("^User enters 'invalid Card cvv'$")
	public void user_enters_invalid_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new PendingException();
		payment.setCardHName("Punit");
		payment.setDebit("12345678912");
		payment.setCvv("");
		payment.setBtnPayment();
	}

	@Then("^Show 'invalid  Card cvv'$")
	public void show_invalid_Card_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 String expected="Please fill the CVV";
			String actual=driver.switchTo().alert().getText();
			Assert.assertEquals(expected, actual);
			driver.switchTo().alert().accept();
			driver.close();
		
	}

	@When("^User enters 'invalid Card Expiration Month'$")
	public void user_enters_invalid_Card_Expiration_Month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new PendingException();
		payment.setCardHName("Punit");
		payment.setDebit("12345678912");
		payment.setCvv("786");
		payment.setMonth("");
		payment.setBtnPayment();
	}

	@Then("^Show 'invalid  Card Expiration Month'$")
	public void show_invalid_Card_Expiration_Month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 String expected="Please fill expiration month";
			String actual=driver.switchTo().alert().getText();
			Assert.assertEquals(expected, actual);
			driver.switchTo().alert().accept();
			driver.close();
		
	}
	

	@When("^User enters 'invalid Card Expiration year'$")
	public void user_enters_invalid_Card_Expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setCardHName("Punit");
		payment.setDebit("12345678912");
		payment.setCvv("786");
		payment.setMonth("July");
		payment.setYear("");
		payment.setBtnPayment();
	}

	@Then("^Show 'invalid  Card Expiration year'$")
	public void show_invalid_Card_Expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expected="Please fill the expiration year";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	@When("^User clicks on Make Payment button with valid inputs$")
	public void user_clicks_on_Make_Payment_button_with_valid_inputs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setCardHName("Punit");
		payment.setDebit("12345678912");
		payment.setMonth("July");
		payment.setCvv("786");
		payment.setYear("2022");
		payment.setBtnPayment();
	}
	@Then("^Redirected to Success Page$")
	public void redirected_to_Success_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//driver.get("D:\\Users\\punitsha\\Desktop\\set A\\success.html");
	}


}
