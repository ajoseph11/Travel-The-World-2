import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setUpSelenium() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\aaley\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    @Ignore
    public void testGoogle() {
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("GGC");
        element.submit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement nextPageElement = driver.findElement(By.id("navcnt"));
        Assert.assertTrue("Expected GGC in title",
                driver.getTitle().contains("GGC"));
    }

    @Test
    public void pricelineTest() {
        driver.get("https://www.priceline.com/?tab=flights");
        WebElement from =
                driver.findElement(By.xpath("//*[@id=\"flight-departure-airport0\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"flight-departure-airport0-dropdown-item-0\"]"));
        drop1.click();
        WebElement to =
                driver.findElement(By.xpath("//*[@id=\"flight-arrival-airport0\"]"));
        to.clear();
        to.sendKeys("Paris, France (PAR) ");
        to.click();
        WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"flight-arrival-airport0-dropdown-item-0\"]/div"));
        drop2.click();
        WebElement date = driver.findElement(By.xpath("//*[@id=\"flight-date-range0\"]"));
        //date.sendKeys("05/05/2019 - 05/12/2019");
        date.click();
        WebElement startDate = driver.findElement(By.xpath("//*[@id=\"flight-search-form\"]/div[2]/div[3]/div/div/div/div[2]/div/div/div/div[3]/div[3]/div[8]/div"));
        startDate.click();
        WebElement endDate = driver.findElement(By.xpath("//*[@id=\"flight-search-form\"]/div[2]/div[3]/div/div/div/div[2]/div/div/div/div[3]/div[3]/div[15]/div"));
        endDate.click();
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"flight-search-form\"]/div[3]/div[3]/button"));
        submit.click();

    }
    @Test
    public void MyregistrationTest(){
        driver.get("https://ihgrewardsclubdining.rewardsnetwork.com/join.htm");
        WebElement fname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        fname.clear();
        fname.sendKeys("Aaleyah");
        fname.click();
        WebElement lname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        lname.sendKeys("Joseph");
        lname.click();
        WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
        zipcode.sendKeys("30043");
        zipcode.click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("abc@gmail.com");
        email.click();
        WebElement verify = driver.findElement(By.xpath("//*[@id=\"emailConfirm\"]"));
        verify.sendKeys("abc@gmail.com");
        verify.click();
        WebElement next = driver.findElement(By.xpath("//*[@id=\"enrollment\"]/div/div[3]/input"));
        next.click();

    }
    @Test
    public void pricelineactiontest(){
        driver.get("https://www.priceline.com/");
        Actions builder = new Actions(driver);
        WebElement e = driver.findElement(By.xpath("//*[@id=\"flight-departure-airport0\"]"));
        builder.moveToElement(e).click().sendKeys("Atlanta").sendKeys(Keys.ENTER);


    }
}
