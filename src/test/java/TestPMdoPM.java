import org.junit.Assert;
import org.junit.Test;

public class TestPMdoPM extends Podstawa {

    @Test
    public void shouldReturnSizeA() {
        Przyciski.chooseSizeA();
    }

    @Test
    public void shouldReturnSizeB() {
        Przyciski.chooseSizeB();
    }

    @Test
    public void shouldReturnSizeC() {
        Przyciski.chooseSizeC();
    }

    @Test
    public void ShouldPriceInSizeAIs12dot99() {
        Przyciski.choosePMtoPM();
        Przyciski.chooseSizeA();
        ElementyStrony.cenaPmA();
    }

    @Test
    public void ShouldPriceInSizeBIs13dot99() {
        Przyciski.choosePMtoPM();
        Przyciski.chooseSizeB();
        ElementyStrony.cenaPmB();
    }

    @Test
    public void ShouldPriceInSizeCIs15dot49() {
        Przyciski.choosePMtoPM();
        Przyciski.chooseSizeC();
        ElementyStrony.cenaPmC();
    }


    @Test
    public void shouldReturnCorrectParcelAPrice()  {
        String parcelPrice = "12,99";
        String error = "Blad ceny gabarytu A!";

        Przyciski.choosePMtoPM();
        Przyciski.chooseSizeA();

        Assert.assertEquals(error, parcelPrice);
    }
}
