package com.cg.bean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetail {
	
	WebDriver driver;
	@FindBy(name="txtNM")
	@CacheLookup
	WebElement aname;
	
	@FindBy(name="txtFName")
	@CacheLookup
	WebElement fname;
	
	@FindBy(id="txtLastName")
	@CacheLookup
	WebElement lname;
	
	@FindBy(id="txtFatherName")
	@CacheLookup
	WebElement fathername;
	
	@FindBy(name="txtDOB")
	@CacheLookup
	WebElement DOB;
	
	@FindBy(name="rdbML")
	@CacheLookup
	WebElement male;
	
	@FindBy(name="rdbFML")
	@CacheLookup
	WebElement female;
	
	@FindBy(id="txtMobileNo")
	@CacheLookup
	WebElement mobile;
	
	@FindBy(name="resAddress")
	@CacheLookup
	WebElement Address;
	
	public WebElement getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address.sendKeys(address);
		}

	@FindBy(name="txtEmailID")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="txtLLine")
	@CacheLookup
	WebElement landline;
	
	@FindBy(id="rdbResAddress")
	@CacheLookup
	WebElement resAddress;
	
	@FindBy(id="rdbOfficeAdd")
	@CacheLookup
	WebElement offAddress;
	
	@FindBy(id="btnSubmit" )
	@CacheLookup
	WebElement btnsubmit;
	

	public UserDetail(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname.sendKeys(aname);
	}

	public WebElement getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname.sendKeys(fname);
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname.sendKeys(lname);
	}

	public WebElement getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername.sendKeys(fathername);
	}

	public WebElement getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB.sendKeys(dOB);
	}

	public WebElement getMale() {
		return male;
	}

	public void setMale() {
		this.male.click();
	}

	public WebElement getFemale() {
		return female;
	}

	public void setFemale(WebElement female) {
		this.female.click();
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile.sendKeys(mobile);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline.sendKeys(landline);
	}

	public WebElement getResAddress() {
		return resAddress;
	}

	public void setResAddress() {
		this.resAddress.click();
	}

	public WebElement getOffAddress() {
		return offAddress;
	}

	public void setOffAddress() {
		this.offAddress.click();
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	public void setBtnsubmit() {
		this.btnsubmit.click();
	}
	
	

}
