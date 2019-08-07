package stepDefUser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.bean.UserDetail;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class Test {
	WebDriver driver;
	private UserDetail user;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2.exe");

		driver = new ChromeDriver();
	}
	@Given("^User on User Detail Page$")
	public void user_on_User_Detail_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Users\\punitsha\\Desktop\\set A\\UserInformation.html");
	    user=new UserDetail(driver);
	}

	@When("^User enters 'invalid applicant name'$")
	public void user_enters_invalid_applicant_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		user.setAname("");
		Thread.sleep(1000);
		user.setBtnsubmit();
	}

	@Then("^Show 'invalid applicant name'$")
	public void show_invalid_applicant_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expected="Please fill the Applicant Name ";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^User enters 'invalid first name'$")
	public void user_enters_invalid_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setAname("Punit");
		user.setFname("");
		Thread.sleep(1000);
		user.setBtnsubmit();
	}

	@Then("^Show 'invalid first name'$")
	public void show_invalid_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expected="Please fill the First Name ";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
		
	}

	@When("^User enters 'invalid Last name'$")
	public void user_enters_invalid_Last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ///throw new PendingException();
		user.setAname("Punit");
		user.setFname("Punit");
		user.setLname("");
		Thread.sleep(1000);
		user.setBtnsubmit();
	}

	@Then("^Show 'invalid Last name'$")
	public void show_invalid_Last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expected="Please fill the Last Name ";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^User enters 'invalid father name'$")
	public void user_enters_invalid_father_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setAname("Punit");
		user.setFname("Punit");
		user.setLname("Sharma");
		user.setFathername("");
		Thread.sleep(1000);
		user.setBtnsubmit();
	}

	@Then("^Show 'invalid father name'$")
	public void show_invalid_father_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expected="Please fill the Father Name ";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^User enters 'invalid DOB'$")
	public void user_enters_invalid_DOB() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setAname("Punit");
		user.setFname("Punit");
		user.setLname("Sharma");
		user.setFathername("Vinod Kumar Sharma");
		user.setDOB("");
		Thread.sleep(1000);
		user.setBtnsubmit();
	}

	@Then("^Show 'invalid DOB'$")
	public void show_invalid_DOB() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expected="Please fill the DOB";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^User enters 'invalid Gender'$")
	public void user_enters_invalid_Gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setAname("Punit");
		user.setFname("Punit");
		user.setLname("Sharma");
		user.setFathername("Vinod Kumar Sharma");
		user.setDOB("09-06-1996");
		
		Thread.sleep(1000);
		user.setBtnsubmit();
	}

	@Then("^Show 'invalid Gender'$")
	public void show_invalid_Gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expected="Please select the Gender";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^User enters 'invalid mobileno'$")
	public void user_enters_invalid_mobileno() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setAname("Punit");
		user.setFname("Punit");
		user.setLname("Sharma");
		user.setFathername("Vinod Kumar Sharma");
		user.setDOB("09-06-1996");
		user.setMale();
		user.setMobile("");
		Thread.sleep(1000);
		user.setBtnsubmit();
	}

	@Then("^Show 'invalid mobileno'$")
	public void show_invalid_mobileno() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    String expected="Please fill Mobile no";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^User enters 'invalid MailId'$")
	public void user_enters_invalid_MailId() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setAname("Punit");
		user.setFname("Punit");
		user.setLname("Sharma");
		user.setFathername("Vinod Kumar Sharma");
		user.setDOB("09-06-1996");
		user.setMale();
		user.setMobile("9560831245");
		user.setEmail("");
		Thread.sleep(1000);
		user.setBtnsubmit();
	}

	@Then("^Show 'invalid MailID'$")
	public void show_invalid_MailID() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expected="Please fill the Email id ";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^User enters 'invalid landline'$")
	public void user_enters_invalid_landline() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setAname("Punit");
		user.setFname("Punit");
		user.setLname("Sharma");
		user.setFathername("Vinod Kumar Sharma");
		user.setDOB("09-06-1996");
		user.setMale();
		user.setMobile("9560831245");
		user.setEmail("");
		Thread.sleep(1000);
		user.setEmail("punits09@gmail.com");
		user.setLandline("");
		user.setBtnsubmit();
	}

	@Then("^Show 'invalid landline'$")
	public void show_invalid_landline() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expected="please fill the landline no";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^User enters 'invalid communication'$")
	public void user_enters_invalid_communication() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setAname("Punit");
		user.setFname("Punit");
		user.setLname("Sharma");
		user.setFathername("Vinod Kumar Sharma");
		user.setDOB("09-06-1996");
		user.setMale();
		user.setMobile("9560831245");
		user.setEmail("");
		Thread.sleep(1000);
		user.setEmail("punits09@gmail.com");
		user.setLandline("01205355112");
		user.setOffAddress();
		user.setAddress("Pune");
		user.setBtnsubmit();
	}

	@Then("^Show 'invalid communication'$")
	public void show_invalid_communication() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    String expected="Please select the Type of Communication ";
		String actual=driver.switchTo().alert().getText();
 	    Assert.assertEquals(expected, actual);
    	driver.switchTo().alert().accept();
     	driver.close();
	}
	@When("^User enters 'invalid address'$")
	public void user_enters_invalid_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setAname("Punit");
		user.setFname("Punit");
		user.setLname("Sharma");
		user.setFathername("Vinod Kumar Sharma");
		user.setDOB("09-06-1996");
		user.setMale();
		user.setMobile("9560831245");
		user.setEmail("");
		Thread.sleep(1000);
		user.setEmail("punits09@gmail.com");
		user.setLandline("01205355112");
		user.setAddress("");
		user.setBtnsubmit();
	}

	@Then("^Show 'invalid address'$")
	public void show_invalid_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expected="please enter the Addresss";
		String actual=driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}
	@When("^User clicks on Submit button with valid inputs$")
	public void user_clicks_on_Submit_button_with_valid_inputs() throws Throwable {
		user.setAname("Punit");
		user.setFname("Punit");
		user.setLname("Sharma");
		user.setFathername("Vinod Kumar Sharma");
		user.setDOB("09-06-1996");
		user.setMale();
		user.setMobile("9560831245");
		user.setEmail("");
		Thread.sleep(1000);
		user.setEmail("punits09@gmail.com");
		user.setLandline("01205355112");
		user.setOffAddress();
		user.setAddress("Pune");
	    Thread.sleep(1000);
	    user.setBtnsubmit();;
	}

	@Then("^Redirected to PaymentPage$")
	public void redirected_to_Success_Page() throws Throwable {
		Thread.sleep(1000);
    driver.get("D:\\Users\\punitsha\\Desktop\\set A\\PaymentDetails.html");
		
	}


}
