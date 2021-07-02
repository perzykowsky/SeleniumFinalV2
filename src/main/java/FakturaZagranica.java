import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FakturaZagranica extends Podstawa {

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[13]/div/app-input/div/div/div/app-input-checkbox/div/label/span/span")
    private WebElement chceFakture;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[18]/div/app-input/div/div/div/app-radio-for-one-field-check/div/label/span/span")
    private WebElement fakturaZagraniczna;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[19]/div/app-input/div/div/div/app-complex-select/ng-select/div")
    private WebElement nipFirmy;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[20]/div/app-input/div/div/div/app-input-text/input")
    private WebElement nipFirmyGlowny;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[21]/div/app-input/div/div/div/app-input-text/input")
    private WebElement nazwaFirmy;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[22]/div/app-input/div/div/div/app-complex-select/ng-select/div/div/div[2]/input")
    private WebElement wybierzKraj;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[23]/div/app-input/div/div/div/app-input-text/input")
    private WebElement kodPocztowy;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[24]/div/app-input/div/div/div/app-input-text/input")
    private WebElement miasto;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[25]/div/app-input/div/div/div/app-input-text/input")
    private WebElement ulica;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[26]/div/app-input/div/div/div/app-input-text/input")
    private WebElement numerBudynku;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[28]/div/app-input/div/div/div/app-input-text/input")
    private WebElement mail;

    @FindBy(xpath = "//*[@id=\"parcelForm\"]/div/div[1]/app-dynamic-form/form/app-section[19]/div/app-input/div/div/div/app-complex-select/ng-select/div/div/div[2]/input")
    private WebElement nipFirmyPrefix1;

    public void chceFakture(){
        chceFakture.click();
    }

    public void mailClick(){
        mail.click();
    }

    public void mailDane(){
        mail.sendKeys("perzyna@gmail.com");
    }
    public void numerBudynkuClick(){
        numerBudynku.click();
    }

    public void numerBudynkuDane(){
        numerBudynku.sendKeys("44");
    }

    public void ulicaClick(){
        ulica.click();
    }

    public void ulicaDane(){
        ulica.sendKeys("Belgijska");
    }
    public void miastoClick(){
        miasto.click();
    }

    public void miastoDane(){
        miasto.sendKeys("Anderlecht");
    }

    public void kodPocztowyClick(){
        kodPocztowy.click();
    }

    public void kodPocztowyDane(){
        kodPocztowy.sendKeys("B9E231");
    }
    public void wybierzKrajClick(){
        wybierzKraj.click();
    }

    public void wybierzKrajDane(){
        wybierzKraj.sendKeys("Belgia");
    }

    public void wybierzKraj(){
        wybierzKraj.sendKeys(Keys.ENTER);
    }

    public void nazwaFirmyClick(){
        nazwaFirmy.click();
    }

    public void nazwaFirmyDane(){
        nazwaFirmy.sendKeys("PerzynaCompany");
    }

    public void nipFirmyClick(){
        nipFirmyGlowny.click();
    }

    public void nipFirmyDane(){
        nipFirmyGlowny.sendKeys("BE123456");
    }

    public void nipFirmyPrefixClick(){
        nipFirmy.click();
    }

    public void nipFirmyPrefixDane(){
        nipFirmyPrefix1.sendKeys("BE");
    }

    public void nipFirmyPrefixZatwierdz(){
        nipFirmyPrefix1.sendKeys(Keys.ENTER);
    }
    public void fakturaZagranicznaClick() {
        fakturaZagraniczna.click();
    }
}
