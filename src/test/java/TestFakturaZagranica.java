import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class TestFakturaZagranica extends Podstawa {

    @Test
    public void testFakturyZagranicznej() throws InterruptedException {
        FakturaZagranica.chceFakture();
        FakturaZagranica.chceFakture();
        FakturaZagranica.nipFirmyPrefixClick();
        FakturaZagranica.nipFirmyPrefixDane();
        FakturaZagranica.nipFirmyPrefixZatwierdz();
        FakturaZagranica.nipFirmyClick();
        FakturaZagranica.nipFirmyDane();
        FakturaZagranica.nazwaFirmyClick();
        FakturaZagranica.nazwaFirmyDane();
        FakturaZagranica.wybierzKrajClick();
        FakturaZagranica.wybierzKrajDane();
        FakturaZagranica.wybierzKraj();
        FakturaZagranica.kodPocztowyClick();
        FakturaZagranica.kodPocztowyDane();
        FakturaZagranica.miastoClick();
        FakturaZagranica.miastoDane();
        FakturaZagranica.ulicaClick();
        FakturaZagranica.ulicaDane();
        FakturaZagranica.numerBudynkuClick();
        FakturaZagranica.numerBudynkuDane();
        FakturaZagranica.mailClick();
        FakturaZagranica.mailDane();
        TimeUnit.SECONDS.sleep(5);
    }
}
