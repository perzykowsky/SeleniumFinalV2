import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementyStrony extends Podstawa {

    @FindBy(linkText = "12.99")
    private WebElement cenaPMa;

    @FindBy(linkText = "13.99")
    private WebElement cenaPMb;

    @FindBy(linkText = "15.49")
    private WebElement cenaPMc;

    @FindBy(linkText = "14.99")
    private WebElement cenaDomA;

    @FindBy(linkText = "16.49")
    private WebElement cenaDomB;

    @FindBy(linkText = "19.99")
    private WebElement cenaDomC;


    public WebElement cenaPmA(){
        return cenaPMa;
    }

    public WebElement cenaPmB(){
        return cenaPMb;
    }

    public WebElement cenaPmC(){
        return cenaPMc;
    }


    public WebElement domCenaA(){
        return cenaDomA;
    }

    public WebElement domCenaB(){
        return cenaDomB;
    }

    public WebElement domCenaC(){
        return cenaDomC;
    }
}
