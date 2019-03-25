import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project2 {
    private static WebDriver driver;

    @BeforeClass
    public static void setUpSelenium() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\aaley\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void atlCancun (){
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to =driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
        to.clear();
        to.sendKeys("Cancun");
        to.click();
        WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop2.click();
        WebElement start = driver.findElement(By.xpath("//*[@id=\"flight-departing-flp\"]"));
        start.sendKeys("05/01/2019");
        WebElement end = driver.findElement(By.xpath("//*[@id=\"flight-returning-flp\"]"));
        end.sendKeys(Keys.CONTROL + "a");
        end.sendKeys(Keys.DELETE);
        end.sendKeys("05/07/2019");
        WebElement options = driver.findElement(By.xpath("//*[@id=\"flight-advanced-options-flp\"]"));
        options.click();
        WebElement nonstop = driver.findElement(By.xpath("//*[@id=\"advanced-flight-nonstop-flp\"]"));
        nonstop.click();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[7]/label/button"));
        search.click();
    }
    @Test
    public void atlLasVegas (){
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to =driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
        to.clear();
        to.sendKeys("Las Vegas");
        to.click();
        WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop2.click();
        WebElement start = driver.findElement(By.xpath("//*[@id=\"flight-departing-flp\"]"));
        start.sendKeys("05/01/2019");
        WebElement end = driver.findElement(By.xpath("//*[@id=\"flight-returning-flp\"]"));
        end.sendKeys(Keys.CONTROL + "a");
        end.sendKeys(Keys.DELETE);
        end.sendKeys("05/07/2019");
        WebElement options = driver.findElement(By.xpath("//*[@id=\"flight-advanced-options-flp\"]"));
        options.click();
        WebElement nonstop = driver.findElement(By.xpath("//*[@id=\"advanced-flight-nonstop-flp\"]"));
        nonstop.click();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[7]/label/button"));
        search.click();
    }
    @Test
    public void atlDenver (){
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to =driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
        to.clear();
        to.sendKeys("Denver");
        to.click();
        WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop2.click();
        WebElement start = driver.findElement(By.xpath("//*[@id=\"flight-departing-flp\"]"));
        start.sendKeys("05/01/2019");
        WebElement end = driver.findElement(By.xpath("//*[@id=\"flight-returning-flp\"]"));
        end.sendKeys(Keys.CONTROL + "a");
        end.sendKeys(Keys.DELETE);
        end.sendKeys("05/07/2019");
        WebElement options = driver.findElement(By.xpath("//*[@id=\"flight-advanced-options-flp\"]"));
        options.click();
        WebElement nonstop = driver.findElement(By.xpath("//*[@id=\"advanced-flight-nonstop-flp\"]"));
        nonstop.click();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[7]/label/button"));
        search.click();
    }
    @Test
    public void atlRome (){
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to =driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
        to.clear();
        to.sendKeys("Rome");
        to.click();
        WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop2.click();
        WebElement start = driver.findElement(By.xpath("//*[@id=\"flight-departing-flp\"]"));
        start.sendKeys("05/01/2019");
        WebElement end = driver.findElement(By.xpath("//*[@id=\"flight-returning-flp\"]"));
        end.sendKeys(Keys.CONTROL + "a");
        end.sendKeys(Keys.DELETE);
        end.sendKeys("05/07/2019");
        WebElement options = driver.findElement(By.xpath("//*[@id=\"flight-advanced-options-flp\"]"));
        options.click();
        WebElement nonstop = driver.findElement(By.xpath("//*[@id=\"advanced-flight-nonstop-flp\"]"));
        nonstop.click();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[7]/label/button"));
        search.click();
    }
    @Test
    public void atlMilan (){
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to =driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
        to.clear();
        to.sendKeys("Milan");
        to.click();
        WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop2.click();
        WebElement start = driver.findElement(By.xpath("//*[@id=\"flight-departing-flp\"]"));
        start.sendKeys("05/01/2019");
        WebElement end = driver.findElement(By.xpath("//*[@id=\"flight-returning-flp\"]"));
        end.sendKeys(Keys.CONTROL + "a");
        end.sendKeys(Keys.DELETE);
        end.sendKeys("05/07/2019");
        WebElement options = driver.findElement(By.xpath("//*[@id=\"flight-advanced-options-flp\"]"));
        options.click();
        WebElement nonstop = driver.findElement(By.xpath("//*[@id=\"advanced-flight-nonstop-flp\"]"));
        nonstop.click();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[7]/label/button"));
        search.click();
    }
    @Test
    public void atlParis (){
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to =driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
        to.clear();
        to.sendKeys("Paris");
        to.click();
        WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop2.click();
        WebElement start = driver.findElement(By.xpath("//*[@id=\"flight-departing-flp\"]"));
        start.sendKeys("05/01/2019");
        WebElement end = driver.findElement(By.xpath("//*[@id=\"flight-returning-flp\"]"));
        end.sendKeys(Keys.CONTROL + "a");
        end.sendKeys(Keys.DELETE);
        end.sendKeys("05/07/2019");
        WebElement options = driver.findElement(By.xpath("//*[@id=\"flight-advanced-options-flp\"]"));
        options.click();
        WebElement nonstop = driver.findElement(By.xpath("//*[@id=\"advanced-flight-nonstop-flp\"]"));
        nonstop.click();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[7]/label/button"));
        search.click();
    }
    @Test
    public void atlMadrid (){
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to =driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
        to.clear();
        to.sendKeys("Madrid");
        to.click();
        WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop2.click();
        WebElement start = driver.findElement(By.xpath("//*[@id=\"flight-departing-flp\"]"));
        start.sendKeys("05/01/2019");
        WebElement end = driver.findElement(By.xpath("//*[@id=\"flight-returning-flp\"]"));
        end.sendKeys(Keys.CONTROL + "a");
        end.sendKeys(Keys.DELETE);
        end.sendKeys("05/07/2019");
        WebElement options = driver.findElement(By.xpath("//*[@id=\"flight-advanced-options-flp\"]"));
        options.click();
        WebElement nonstop = driver.findElement(By.xpath("//*[@id=\"advanced-flight-nonstop-flp\"]"));
        nonstop.click();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[7]/label/button"));
        search.click();
    }
    @Test
    public void atlAmsterdam (){
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to =driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
        to.clear();
        to.sendKeys("Amsterdam");
        to.click();
        WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop2.click();
        WebElement start = driver.findElement(By.xpath("//*[@id=\"flight-departing-flp\"]"));
        start.sendKeys("05/01/2019");
        WebElement end = driver.findElement(By.xpath("//*[@id=\"flight-returning-flp\"]"));
        end.sendKeys(Keys.CONTROL + "a");
        end.sendKeys(Keys.DELETE);
        end.sendKeys("05/07/2019");
        WebElement options = driver.findElement(By.xpath("//*[@id=\"flight-advanced-options-flp\"]"));
        options.click();
        WebElement nonstop = driver.findElement(By.xpath("//*[@id=\"advanced-flight-nonstop-flp\"]"));
        nonstop.click();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[7]/label/button"));
        search.click();
    }
    @Test
    public void atlSingapore () {
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to = driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
        to.clear();
        to.sendKeys("Singapore");
        to.click();
        WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop2.click();
        WebElement start = driver.findElement(By.xpath("//*[@id=\"flight-departing-flp\"]"));
        start.sendKeys("05/01/2019");
        WebElement end = driver.findElement(By.xpath("//*[@id=\"flight-returning-flp\"]"));
        end.sendKeys(Keys.CONTROL + "a");
        end.sendKeys(Keys.DELETE);
        end.sendKeys("05/07/2019");
        WebElement options = driver.findElement(By.xpath("//*[@id=\"flight-advanced-options-flp\"]"));
        options.click();
        WebElement nonstop = driver.findElement(By.xpath("//*[@id=\"advanced-flight-nonstop-flp\"]"));
        nonstop.click();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[7]/label/button"));
        search.click();
    }
}
