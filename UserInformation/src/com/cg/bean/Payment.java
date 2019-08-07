package com.cg.bean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	WebDriver driver;
	
	@FindBy(id ="txtCardholderName")
	@CacheLookup
	WebElement cardHName;
	
	@FindBy( name="debit")
	@CacheLookup
	WebElement debit;
	
	@FindBy(name="month")
	@CacheLookup
	WebElement month;
	
	@FindBy(name="year")
	@CacheLookup
	WebElement year;
	
	@FindBy(id ="btnPayment")
	@CacheLookup
	WebElement btnPayment;
	
	@FindBy(name="cvv")
	@CacheLookup
	WebElement cvv;
	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}

	public Payment(WebDriver driver) {
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

	public WebElement getCardHName() {
		return cardHName;
	}

	public void setCardHName(String cardHName) {
		this.cardHName.sendKeys(cardHName);
	}

	public WebElement getDebit() {
		return debit;
	}

	public void setDebit(String debit) {
		this.debit.sendKeys(debit);
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month.sendKeys(month);
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year.sendKeys(year);
	}

	public WebElement getBtnPayment() {
		return btnPayment;
	}

	public void setBtnPayment() {
		this.btnPayment.click();
	}
}
