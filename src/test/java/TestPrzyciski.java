import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class TestPrzyciski extends Podstawa {

    @Test
    public void shouldOpenPopupWithHowToSendParcel() throws InterruptedException {
        Przyciski.jakNadacPaczkeClick();
        TimeUnit.SECONDS.sleep(3);
        Przyciski.howTosSendPopVisable();
    }

    @Test
    public void shouldOpenPopupWithHowToPackParcel() throws InterruptedException{
        Przyciski.jakSpakowaPaczkeClick();
        TimeUnit.SECONDS.sleep(10);
        Przyciski.howToPackPopVisable();
    }

    @Test
    public void shouldChangeLanguage() throws InterruptedException {
        Przyciski.zmianaJezyka();
        TimeUnit.SECONDS.sleep(5);
    }

    @Test
    public void shouldClickRegulation() throws InterruptedException {
        Przyciski.pierwszaZgoda();
        TimeUnit.SECONDS.sleep(5);
    }

    @Test
    public void shouldClickSecondRegulation() throws InterruptedException {
        Przyciski.drugaZgoda();
        TimeUnit.SECONDS.sleep(5);
    }

    @Test
    public void shouldChosePMtoPM() throws InterruptedException {
        Przyciski.choosePMtoPM();
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void shouldChosePMtoHouse() throws InterruptedException {
        Przyciski.choosePMtoHome();
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void shouldReturnSizeA() throws InterruptedException {
        Przyciski.chooseSizeA();
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void shouldReturnSizeB() throws InterruptedException {
        Przyciski.chooseSizeB();
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void shouldReturnSizeC() throws InterruptedException {
        Przyciski.chooseSizeC();
        TimeUnit.SECONDS.sleep(1);
    }
}
