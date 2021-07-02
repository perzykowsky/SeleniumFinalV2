import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Platnosc extends Podstawa {

    @FindBy(css = "div[title='Płacę z ING']")
    private WebElement platnoscING;

    @FindBy(css = "div.button-container > button.finish-button")
    private WebElement finishButton;

    @FindBy(css = "p.seller-name-surname")
    private WebElement name;

    @FindBy(css = "p.seller-orderdescription")
    private WebElement email;

    @FindBy(css = "p.seller-amount")
    private WebElement parcelPrice;

    @FindBy(css = "button[value='1']")
    private WebElement acceptButton;

    @FindBy(css = "button[value='2']")
    private WebElement declineButton;

    @FindBy(css = "button[value='3']")
    private WebElement setPaymentAsPendingButton;

    public Platnosc clickBank() {
        platnoscING.click();
        return this;
    }

    public Platnosc clickNextButton() throws InterruptedException {
        finishButton.click();
        return this;
    }

    public Platnosc clickAcceptPayment() throws InterruptedException {
        acceptButton.click();
        return this;
    }

    public Platnosc clickDeclinePaymentButton() throws InterruptedException {
        declineButton.click();
        return this;
    }

    public Platnosc clickSetPaymentAsPendingButton() throws InterruptedException {
        setPaymentAsPendingButton.click();
        return this;
    }

    public WebElement getSenderName() {
        return name;
    }

    public WebElement getSenderEmail() {
        return email;
    }

    public WebElement getSenderParcelPrice() {
        return parcelPrice;
    }

}
