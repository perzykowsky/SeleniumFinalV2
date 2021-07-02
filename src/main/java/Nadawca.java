import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nadawca {

    @FindBy(name = "senderAddress.name")
    private WebElement senderName;

    @FindBy(name = "senderAddress.email")
    private WebElement senderEmail;

    @FindBy(name = "senderAddress.phone")
    private WebElement senderPhone;

    @FindBy(css = "[for = in_changer")
    private WebElement invoiceCheckbox;

    //faktura-jaka
    @FindBy(css = "[for = in_changer")
    private WebElement checkInvoice;

    @FindBy(css = "[for = legalStatuscompany")
    private WebElement checkPolishInvoice;

    @FindBy(css = "[for = legalStatusindividual")
    private WebElement checkPersonInvoice;

    @FindBy(css = "[for = legalStatusforeignCompany")
    private WebElement checkOtherInvoice;

    //faktura-dane
    @FindBy(name = "invoice.company.nip")
    private WebElement invoicePolishNip;

    @FindBy(name = "invoice.individual.companyName")
    private WebElement invoiceName;

    @FindBy(name = "invoice.individual.email")
    private WebElement invoiceEmail;

    @FindBy(name = "invoice.individual.zipCode")
    private WebElement invoiceZipcode;

    @FindBy(css = ".ng-input > input")
    private WebElement receiverAPMNoInput;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[22]/div/app-input/div/div/div/app-selectpicker/ng-select/div/div/div[2]/input")
    private WebElement invoiceTown;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[23]/div/app-input/div/div/div/app-selectpicker/ng-select/div/div/div[2]/input")
    private WebElement invoiceStreet;

    @FindBy(name = "invoice.individual.buildingNo")
    private WebElement invoiceBuilding;

    @FindBy(css = "[for = legalStatuscompany] > span > span")
    private WebElement polishCompanyCheckboxText;

    @FindBy(css = "[for = legalStatuscompany")
    private WebElement polishCompanyCheckbox;

    @FindBy(css = "[for = legalStatusindividual")
    private WebElement legalStatusCheckbox;

    @FindBy(css = "[for = legalStatusforeignCompany")
    private WebElement foreignCompanyCheckbox;

    @FindBy(css = "ul.errors > li")
    private WebElement badEmailError;

    @FindBy(name = "invoice.company.nip")
    private WebElement invoicePolishCompanyNip;

    @FindBy(css = "div.third-column > div.mb-3 > div.name")
    private WebElement invoiceNameFormSummary;

    public Nadawca() {
        PageFactory.initElements(Podstawa.driver, this);
    }

    public Nadawca clickInvoiceIndividualName(String name)  {
        invoiceName.sendKeys(name);
        return this;
    }

    public Nadawca clickInvoiceIndividualEmail(String email) {
        invoiceEmail.sendKeys(email);
        return this;
    }

    public Nadawca clickInvoiceIndividualZIPCode(String zip) {
        invoiceZipcode.sendKeys(zip);
        invoiceZipcode.click();
        return this;
    }

    public Nadawca clickInvoiceTown(String town)  {
        invoiceTown.sendKeys(town);
        invoiceTown.sendKeys(Keys.ENTER);
        return this;
    }

    public Nadawca clickInvoiceStreet(String street) {
        invoiceStreet.sendKeys(street);
        invoiceStreet.sendKeys(Keys.ENTER);
        return this;
    }

    public Nadawca clickInvoiceBuilding(String buildNumber) {
        invoiceBuilding.sendKeys(buildNumber);
        return this;
    }

    public Nadawca fillSenderName(String name) {
        senderName.sendKeys(name);
        return this;
    }

    public Nadawca fillSenderEmail(String email) {
        senderEmail.sendKeys(email);
        return this;
    }

    public Nadawca fillSenderNumber(String number) {
        senderPhone.sendKeys(number);
        return this;
    }

    public Nadawca fillReceiverAPMCode(String apm) throws InterruptedException {
        receiverAPMNoInput.sendKeys(apm);
        receiverAPMNoInput.sendKeys(Keys.ENTER);
        return this;
    }

    public Nadawca clickInvoice()  {
        invoiceCheckbox.click();
        return this;
    }

    public WebElement checkInvoiceClick(){
        return checkPolishInvoice;
    }

    public WebElement checkInInvoiceWasClicked(){
        return polishCompanyCheckboxText;
    }

    public Nadawca clickPolishCheckbox() throws InterruptedException {
        polishCompanyCheckbox.click();
        return this;
    }

    public WebElement getInvoiceNameFormSummary(){
        return invoiceNameFormSummary;
    }

    public Nadawca clickPolishNIP(String nip) throws InterruptedException {
        invoicePolishCompanyNip.sendKeys(nip);
        return this;
    }

}
