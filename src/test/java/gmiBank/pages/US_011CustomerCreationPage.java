package gmiBank.pages;

import gmiBank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_011CustomerCreationPage {
    public US_011CustomerCreationPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-flag fa-w-16 ']")
    public WebElement languageIcon;

    @FindBy(xpath = "(//button[@class='dropdown-item'])[1]")
    public WebElement englishSelect;

    @FindBy(partialLinkText = "My Operations")
    public WebElement myOperations;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement manageCustomer;

    @FindBy(id = "jh-create-entity")
    public WebElement createANewCustomer;

    @FindBy(id="search-ssn")
    public WebElement sSN;

    @FindBy(xpath ="//button[@class=\"btn btn-secondary\"]")
    public WebElement searchButton;

    @FindBy(id="tp-customer-firstName")
    public WebElement firstName;

    @FindBy(id="tp-customer-lastName")
    public WebElement lastName;

    @FindBy(id="tp-customer-middleInitial")
    public WebElement middleInitial;

    @FindBy(id="tp-customer-email")
    public WebElement email;

    @FindBy(id="tp-customer-mobilePhoneNumber")
    public WebElement mobilePhoneNumber;

    @FindBy(id="tp-customer-phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id="tp-customer-zipCode")
    public WebElement zipCode;

    @FindBy(id="tp-customer-address")
    public WebElement adress;

    @FindBy(id="tp-customer-city")
    public WebElement city;

    @FindBy(id="tp-customer-ssn")
    public WebElement ssnSecond;

    @FindBy(id="tp-customer-createDate")
    public WebElement creatDate;

    @FindBy(id="tp-customer-country")
    public WebElement country;

    @FindBy(id="tp-customer-state")
    public WebElement state;

    @FindBy(id="tp-customer-user")
    public WebElement user;

}