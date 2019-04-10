import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Project2 {
    private static WebDriver driver;
    private String departDate;
    private String returnDate;
    private int runCount = 0;
   // private Map<String, String> dates;
    private static Map<String, String> dateMap;


    @BeforeClass
    public static void setUpSelenium() {
        try {
            dateMap =  getToFroDates();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\adefe\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void atlCancun() {
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to = driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
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
    public void atlLasVegas() {
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to = driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
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
    public void atlDenver() {
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to = driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
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
    public void atlRome() {
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to = driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
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
    public void atlMilan() {
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to = driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
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
    public void atlParis() {
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to = driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
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
    public void atlMadrid() {
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to = driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
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
    public void atlAmsterdam() {
        driver.get("https://www.expedia.com/Flights");
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL)");
        from.click();
        WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        drop1.click();
        WebElement to = driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
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
    public void atlSingapore() {
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

    @Test
    public void defaultTest() {
        String departureCity = "Atlanta";
        String[] destinationCities = {"Cancun", "LasVegas", "Denver", "Rome", "Milan", "Paris", "Madrid", "Amsterdam", "Singapore"};


        try {
            this.dateMap =  getToFroDates();
            System.out.println(dateMap.size() + " is the size of our date map");
            for (Object dates: dateMap.keySet()){
                String beginDate = dates.toString();
                String returnDate = dateMap.get(beginDate).toString();
                System.out.println("Depart on: " + beginDate + ", Return on: " + returnDate );

                //System.out.println(beginDate + " " + returnDate);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void atlCancunB() {
        System.out.println(dateMap.size() + " is the size of our date map");
        ArrayList<Integer> prices = new ArrayList();
        for (Object dates: dateMap.keySet()){
            String beginDate = dates.toString();
            String returnDate = dateMap.get(beginDate).toString();
        driver.get("https://www.expedia.com");
        WebElement primary_header_flight = driver.findElement(By.id("primary-header-flight"));
        primary_header_flight.click();
       WebElement from = driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]"));
        from.clear();
        from.sendKeys("Atlanta, GA (ATL-Hartsfield-Jackson Atlanta Intl.)");
        //from.click();
       //WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
       // drop1.click();
        WebElement to = driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]"));
        to.clear();
        to.sendKeys("Cancun, Quintana Roo, Mexico (CUN-Cancun Intl.)");
       // to.click();
       //WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]/div"));
        //drop2.click();
        WebElement start = driver.findElement(By.xpath("//*[@id=\"flight-departing-flp\"]"));
        start.clear();
        //start.sendKeys("05/01/2019");
            start.sendKeys(beginDate);

            WebElement end = driver.findElement(By.xpath("//*[@id=\"flight-returning-flp\"]"));
       //end.clear();
        end.sendKeys(Keys.CONTROL + "a");
       end.sendKeys(Keys.DELETE);
        //end.sendKeys("05/08/2019");
            end.sendKeys(returnDate);


       WebElement search = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[7]/label/button"));
       search.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //WebElement listingPriceDollars = driver.findElement(By.id("listing-price-dollars"));
             //WebElement listingPriceDollars = driver.findElement(By.xpath("            //*[@id=\"flight-module-2019-05-01t06:45:00-04:00-coach-atl-fll-b6-467-coach-fll-cun-b6-1795_2019-05-08t11:17:00-05:00-coach-cun-fll-b6-1796-coach-fll-atl-b6-568_\"]/div[1]/div[1]/div[2]/div/div[1]/div[1]/span[2]\n"));

           // WebElement listingPriceDollars = driver.findElement(By.xpath("//*[@id=\"stops\"]/div/label[1]/div/div[2]/div"));
            WebElement listingPriceDollars = driver.findElement(By.xpath("//*[@id=\"stops\"]/div/label[1]/div/div[2]/div"));

            runCount++;
       String price = listingPriceDollars.getText();
       prices.add(Integer.parseInt(price.substring(1)));

            System.out.println("Current Run: " + this.runCount + ", Departure: " + beginDate + ", Return: "+ returnDate + ", L-Price: " + price + ",  MINIMUM: "+ Collections.min(prices));
            //System.out.println("Current Minimum price is " + Collections.min(prices));
        }
    }








    public static ArrayList<Long> createBeginDateArray() throws ParseException {//System.out.println("*************createBeginDateArray Begins******************");
        final ArrayList<Long> dates = new ArrayList<Long>();
        final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        final String beginDateStr = "05/01/2019"; //Strign literal for date
        final String beginDateStr2 = "05/02/2019";
        final Date beginDate = formatter.parse(beginDateStr); //convert date to String
        // Date beginDate2 = formatter.parse(beginDateStr2);
        Long begindateUnix = beginDate.getTime(); //convert Date String to Long as in Unix version



        for (int i =0; i < 107; i++){
            dates.add(i, begindateUnix);

            begindateUnix += 86400000;


        }



        return dates;
    }

    public static ArrayList<Long> createReturnDateArray() throws ParseException {//System.out.println("*************createBeginDateArray Begins******************");
        final ArrayList<Long> dates = new ArrayList<Long>();
        final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        final String beginDateStr = "05/08/2019";
        final String beginDateStr2 = "05/02/2019";
        final Date beginDate = formatter.parse(beginDateStr);
        // Date beginDate2 = formatter.parse(beginDateStr2);
        Long begindateUnix = beginDate.getTime();



        for (int i =0; i < 107; i++){
            dates.add(i, begindateUnix);

            begindateUnix += 86400000;


        }



        return dates;
    }


    public static ArrayList<String> parsedBeginDates(final ArrayList<Long> dates) throws ParseException { //Parse the date object back to a lteral String
        System.out.println("*************parsedBeginDates Begins******************");
        ArrayList<String> pasredDates = new ArrayList<String>();
        final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");


        for (final Long date : dates) {
            String currDateStr = formatter.format(date);
            Date currDateDat = formatter.parse(currDateStr);
            pasredDates.add(currDateStr);
            //System.out.println(" currDateStr as String " + currDateStr + " currDateDat as Date" + currDateDat);
        }

        System.out.println("*************parsedBeginDates Ends******************");
        return pasredDates;

    }

    public static ArrayList<String> parsedReturnDates(final ArrayList<Long> dates) throws ParseException {
        System.out.println("*************parsedReturnDates Begins******************");
        ArrayList<String> pasredDates = new ArrayList<String>();
        final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");


        for (final Long date : dates) {
            String currDateStr = formatter.format(date);
            Date currDateDat = formatter.parse(currDateStr);
            pasredDates.add(currDateStr);
            //System.out.println(" currDateStr as String " + currDateStr + " currDateDat as Date" + currDateDat);
        }

        System.out.println("*************parsedReturnDates Ends******************");
        return pasredDates;

    }



    public static Map<String,String> getToFroDates() throws ParseException {
        Map toAndFroDates = new LinkedHashMap();
        ArrayList<Long> myBeginDates = createBeginDateArray(); //get Arraylist of dates

        //createDateItem(myDates); //print dates as nix and other types
        ArrayList<String> parsedBeginDates = parsedBeginDates(myBeginDates);

        ArrayList<Long> myReturnDates = createReturnDateArray(); //get Arraylist of dates

        //createDateItem(myDates); //print dates as nix and other types
        ArrayList<String> parsedReturnDates = parsedReturnDates(myReturnDates);

        for (int i =0; i < myBeginDates.size(); i++){
            toAndFroDates.put(parsedBeginDates.get(i), parsedReturnDates.get(i));
        }

        return toAndFroDates;
    }



}
