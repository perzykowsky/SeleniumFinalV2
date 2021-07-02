import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Podstawa {

    public static WebDriver driver;

    public static Przyciski Przyciski;
    public static Nadawca Nadawca;
    public static Odbiorca Odbiorca;
    public static ElementyStrony ElementyStrony;
    public static FakturaZagranica FakturaZagranica;
    public static Platnosc Platnosc;
    public static Podsumowanie Podsumowanie;

    @BeforeClass
    public static void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://test-oneclick-pl.easypack24.net/SzybkieNadania/");
        driver.manage().window().maximize();

        Przyciski = new Przyciski();
        Nadawca = new Nadawca();
        Odbiorca = new Odbiorca();
        ElementyStrony = new ElementyStrony();
        FakturaZagranica = new FakturaZagranica();
        Podsumowanie = new Podsumowanie();
        Platnosc = new Platnosc();

        TimeUnit.SECONDS.sleep(5);
        //Przyciski.closeMainCookies();
        TimeUnit.SECONDS.sleep(3);
        Przyciski.closeSecondCookies();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
