import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPlatnosci extends Podstawa {


    @Before
    public void uzupelnianieDanych() throws InterruptedException {
        Przyciski.choosePMtoPM();
        Przyciski.chooseSizeA();

        Odbiorca.fillReceiverName("Mateusz Mat");
        Odbiorca.fillReceiverEmail("mati@mati.pl");
        Odbiorca.fillReceiverNumber("889323884");
        Odbiorca.fillReceiverAPMCode("OPO22N");

        Nadawca.fillSenderName("Maciej Perzyna");
        Nadawca.fillSenderEmail("mmmm@wp.pl");
        Nadawca.fillSenderNumber("555444333");

        Przyciski.pierwszaZgoda();
        Przyciski.drugaZgoda();

        Podsumowanie.przyciskWysylam();

    }

    @Test
    public void shouldPayParcel() throws InterruptedException {
        String platnosc = "Twoja płatność została potwierdzona";
        String error = "Blad platnosci!";

        uzupelnianieDanych();
        Platnosc.clickAcceptPayment();

        Assert.assertEquals(error, Podsumowanie.getPaymentStatus().getText());

    }


}
