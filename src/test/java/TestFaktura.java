import org.junit.Assert;
import org.junit.Test;

public class TestFaktura extends Podstawa {


    @Test
    public void should() throws Exception {
        String NIP = "9492107026";
        String nameCompany = "X KOM SP. Z O.O.";
        String error = "";

        Nadawca.clickInvoice();
        Nadawca.clickPolishCheckbox();
        Nadawca.clickPolishNIP(NIP);

        Assert.assertEquals(error, nameCompany, Nadawca.getInvoiceNameFormSummary().getText());
    }
}
