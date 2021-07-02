import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Przyciski {
    //cookies
    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookies;

    @FindBy(className = "btn-cookie-trigger")
    private WebElement secondCookies;

    //przyciski
    @FindBy(css = "div.lang")
    private WebElement zmianaJezyka;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[2]/div/app-input[2]/div/span/span[2]")
    private WebElement jakNadacPaczke;

    @FindBy(linkText = "All done!")
    private WebElement howToSendPopIn;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[2]/div/app-input[2]/div/span/span[2]")
    private WebElement jakSpakowacPaczke;

    @FindBy(linkText = "How to pack the parcel?")
    private WebElement howToPackPop;

    @FindBy(css = "[for = terms")
    private WebElement checkRegulation;

    @FindBy(css = "[for = newsletter")
    private WebElement checkNewsletter;

    //wybor metody dostawy
    @FindBy(css = "[for = deliveryTypeboxmachine")
    private WebElement pmDoPM;

    @FindBy(css = "[for = deliveryTypeaddress")
    private WebElement pmDoDOM;

    //wybor gabarytu
    @FindBy(css = "[for = parcelSizeA]") // >span ?
    private WebElement parcelSizeA;

    @FindBy(id = "option_parcelSize_A") // ? to usun
    private WebElement parcelA;

    @FindBy(css = "[for = parcelSizeB]") // >span ?
    private WebElement parcelSizeB;

    @FindBy(css = "[for = parcelSizeC]") // >span ?
    private WebElement parcelSizeC;


    public Przyciski() {
        PageFactory.initElements(Podstawa.driver, this);
    }

    public void closeMainCookies() {
        cookies.click();
    }

    public void closeSecondCookies()  {
        secondCookies.click();
    }

    public void jakNadacPaczkeClick(){
        jakNadacPaczke.click();
    }

    public WebElement howTosSendPopVisable(){
        return howToSendPopIn;
    }

    public WebElement howToPackPopVisable(){
        return howToPackPop;
    }
    public void jakSpakowaPaczkeClick(){
        jakSpakowacPaczke.click();
    }

    public void zmianaJezyka() {
        zmianaJezyka.click();
    }

    public void pierwszaZgoda()  {
        checkRegulation.click();
    }

    public void drugaZgoda()  {
        checkNewsletter.click();
    }

    //wybor dostawy
    public void choosePMtoPM() {
        pmDoPM.click();
    }

    public void choosePMtoHome() {
        pmDoDOM.click();
    }

    //wybor gabarytu
    public void chooseSizeA() {
        parcelSizeA.click();
    }

    public void chooseSizeB() {
        parcelSizeB.click();
    }

    public void chooseSizeC() {
        parcelSizeC.click();
    }

}
