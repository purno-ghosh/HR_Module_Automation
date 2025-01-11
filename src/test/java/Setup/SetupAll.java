package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.time.Duration;

public class SetupAll {

    WebDriver driver;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    private static final Logger logger = Logger.getLogger(SetupAll.class);
    @Test
    public void aaa() {
        driver.get("https://hr.selise.biz/login");
        System.out.println("All Ok");
    }

}
