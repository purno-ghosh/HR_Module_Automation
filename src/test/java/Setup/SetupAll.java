package Setup;

import org.openqa.selenium.By;
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
        driver.get("https://selisehr.seliselocal.com/login");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("shr@yopmail.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("123456789aA!");
        driver.findElement(By.xpath("//span[text()=\" Login \"]")).click();
        System.out.println("looks good");

        System.out.println("All Ok");
    }

}
