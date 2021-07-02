import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class TestPMdoDOM extends Podstawa {

    @Test
    public void ShouldClickPMToHome() {
        Przyciski.choosePMtoHome();
    }

    @Test
    public void ShouldClickSizeAWhenPMToHomeIsCheck(){
        Przyciski.choosePMtoHome();
        Przyciski.chooseSizeA();
    }

    @Test
    public void ShouldClickSizeBWhenPMToHomeIsCheck(){
        Przyciski.choosePMtoHome();
        Przyciski.chooseSizeB();
    }

    @Test
    public void ShouldClickSizeCWhenPMToHomeIsCheck(){
        Przyciski.choosePMtoHome();
        Przyciski.chooseSizeC();
    }

    @Test
    public void ShouldPriceInSizeAIs14dot99() {
        Przyciski.choosePMtoHome();
        Przyciski.chooseSizeA();
        ElementyStrony.domCenaA();
    }

    @Test
    public void ShouldPriceInSizeBIs16dot49() {
        Przyciski.choosePMtoHome();;
        Przyciski.chooseSizeB();
        ElementyStrony.domCenaB();
    }

    @Test
    public void ShouldPriceInSizeCIs19dot99() {
        Przyciski.choosePMtoHome();
        Przyciski.chooseSizeC();
        ElementyStrony.domCenaC();
    }
}
