import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test123 {


    @Test
    public void testDriver() {
        //System.setProperty("webdriver.chrome.driver", "lib/browserDriver/chromedriver");

        System.setProperty("webdriver.gecko.driver", "lib/browserDriver/geckodriver");

        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.amazon.com");

        driver.close();

    }

}
