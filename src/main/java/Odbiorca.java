import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Odbiorca {

    @FindBy(name = "targetAddress.name")
    private WebElement receiverName;

    @FindBy(name = "addresseeEmail")
    private WebElement receiverEmail;

    @FindBy(name = "phoneNumber")
    private WebElement receiverPhone;

    @FindBy(name = "targetAddress.zipCode")
    private WebElement receiverZipcode;

    @FindBy(css = ".ng-input > input")
    private WebElement receiverAPMNoInput;

    @FindBy(css = ".ng-input > input")
    private WebElement receiverAddressTown;

    @FindBy(name = "targetAddress.buildingNo")
    private WebElement receiverStreetNumber;

    @FindBy(name = "targetAddress.flatNo")
    private WebElement receiverFlatNumber;

    //opcja 'wybierz na mapie'
    @FindBy(css = ".open-map")
    private WebElement mapButton;

    @FindBy(css = ".modal-title")
    private WebElement mapTitle;

    @FindBy(css = ".search-input")
    private WebElement mapSearch;

    @FindBy(css = ".inpost-search__list > div")
    private WebElement mMSearchResult;

    @FindBy(css = ".select-link")
    private WebElement mapChooseParcelButton;

    @FindBy(css = ".details-link")
    private WebElement mapDetailsButton;

    public Odbiorca fillReceiverName(String name) {
        receiverName.sendKeys(name);
        return this;
    }

    public Odbiorca fillReceiverEmail(String email) {
        receiverEmail.sendKeys(email);
        return this;
    }

    public Odbiorca fillReceiverNumber(String number) {
        receiverPhone.sendKeys(number);
        return this;
    }

    public Odbiorca fillReceiverZipCode(String paczkomat) {
        receiverZipcode.sendKeys(paczkomat);
        receiverZipcode.sendKeys(Keys.ENTER);
        return this;
    }

    public Odbiorca fillReceiverTown(String apmNo) {
        receiverAddressTown.sendKeys(apmNo);
        receiverAddressTown.sendKeys(Keys.ENTER);
        return this;
    }
    /*
    public Odbiorca fillReceiverStreet(String apmNo) {
        receiverStreetNumber.click();
        receiverStreetNumber.sendKeys(apmNo);
        receiverAdressStreet.sendKeys(Keys.ENTER);
        return this;
    }
    */
    public Odbiorca fillReceiverStreetNo(String number) throws InterruptedException {
        receiverStreetNumber.sendKeys(number);
        return this;
    }

    public Odbiorca fillReceiverFlatNo(String flat) throws InterruptedException {
        receiverFlatNumber.sendKeys(flat);
        return this;
    }

    public Odbiorca fillReceiverAPMCode(String apm) throws InterruptedException {
        receiverAPMNoInput.sendKeys(apm);
        receiverAPMNoInput.sendKeys(Keys.ENTER);
        return this;
    }

    //opcja 'wybierz na mapie'
    public Odbiorca clickMapButton() {
        mapButton.click();
        return this;
    }

    public Odbiorca fillSearchBarWithData(String town) {
        mapSearch.sendKeys(town);
        return this;
    }

    public Odbiorca clickMapModalSearchResult() {
        mMSearchResult.click();
        return this;
    }


    public Odbiorca clickMMParcelBoxChoseButton() throws InterruptedException {
        mapChooseParcelButton.click();
        return this;
    }

    public Odbiorca clickMMParcelBoxDetailsButton() throws InterruptedException {
        mapDetailsButton.click();
        return this;
    }
}
