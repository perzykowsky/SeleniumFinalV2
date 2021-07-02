import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Podsumowanie extends Podstawa {

    @FindBy(css = "div.d-block > button.btn-primary")
    private WebElement przyciskWysylam;

    @FindBy(css = "div.wrapper > div.text-wrapper > span")
    private WebElement paymentStatus;

    @FindBy(css = "div.parcel-summary-container > button.btn")
    private WebElement refreshButton;

    @FindBy(css = "li.border-line > div.row > div.first-column > div.name")
    private WebElement receiverName;

    @FindBy(css = "li.border-line > div.row > div.first-column > div:nth-of-type(2)")
    private WebElement receiverPhone;

    @FindBy(css = "li.border-line > div.row > div.first-column > div:nth-of-type(3)")
    private WebElement receiverEmail;

    @FindBy(css = "div.deliveryType > div.mb-3 > div.name")
    private WebElement senderName;

    @FindBy(css = "div.deliveryType > div.mb-3 > div:nth-of-type(2)")
    private WebElement senderPhone;

    @FindBy(css = "div.deliveryType > div.mb-3 > div:nth-of-type(3)")
    private WebElement senderEmail;

    @FindBy(css = "li.border-line > div.row > div.third-column > div > div.name")
    private WebElement apmNo;

    @FindBy(css = "li.border-line > div.row > div.third-column > div > div:nth-of-type(2)")
    private WebElement apmAdress;

    @FindBy(css = "div.third-column > div.mb-3 > div.name")
    private WebElement invoiceName;

    @FindBy(css = "div.third-column > div.mb-3 > div:nth-of-type(2)")
    private WebElement invoiceNIP;

    @FindBy(css = "div.third-column > div.mb-3 > div:nth-of-type(3)")
    private WebElement invoiceTown;

    @FindBy(css = "div.third-column > div.mb-3 > div:nth-of-type(4)")
    private WebElement invoiceStreet;

    public void przyciskWysylam(){
        przyciskWysylam.click();
    }

    public WebElement getPaymentStatus() {
        return paymentStatus;
    }

    public WebElement getReceiverName() {
        return receiverName;
    }

    public WebElement getReceiverPhone() {
        return receiverPhone;
    }

    public WebElement getReceiverEmail() {
        return receiverEmail;
    }

    public WebElement getSenderName() {
        return senderName;
    }

    public WebElement getSenderPhone() {
        return senderPhone;
    }

    public WebElement getSenderEmail() {
        return senderEmail;
    }

    public WebElement getApm() {
        return apmNo;
    }

    public WebElement getApmAdress() {
        return apmAdress;
    }

    public WebElement getInvoiceName() {
        return invoiceName;
    }

    public WebElement getInvoiceNIP() {
        return invoiceNIP;
    }

    public WebElement getInvoiceTown() {
        return invoiceTown;
    }

    public WebElement getInvoiceStreet() {
        return invoiceStreet;
    }
}
