/*
//<editor-fold desc="Description">
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Dater {
    public static void main(final String[] args) {
        try {
            ArrayList<Long> myDates = createDateArray(); //get Arraylist of dates

            //createDateItem(myDates); //print dates as nix and other types
            ArrayList<String> parsedDates = getParseddate(myDates);
            for (String string : parsedDates){
                System.out.println(string); //print all the dates
            }
        } catch (final ParseException e) {
            e.printStackTrace();
        }
        final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        final String dateInString = "05/01/2019";
        final String dateInString2 = "05/09/2019";
        final String dateInString3 = "05/03/2019";


        try {

            final Date date = formatter.parse(dateInString);
            final Date date2 = formatter.parse(dateInString2);
            final Date date3 = formatter.parse(dateInString3);
            final Long ep = date.getTime();
            final Date d = new Date(ep);
            //System.out.println(date);
            System.out.println(formatter.format(date));
            System.out.println(date.getTime()/1000000);
            final long a = date.getTime();
            final long b = date2.getTime();
            final long c = date3.getTime();
            System.out.println(formatter.format(date2));
            System.out.println(formatter.format(d) + " epoch");
            //System.out.println(formatter.format(d).toString());
            final String s = formatter.format(d);

            System.out.println(date2.getTime());
            System.out.println("Difference: " + (b - a ));

        } catch (final ParseException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Long> createDateArray() throws ParseException { //generate unix version of dates
        final ArrayList<Long> dates = new ArrayList<Long>();
        final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        final String beginDateStr = "05/01/2019";
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

    public static void createDateItem(final ArrayList<Long> dates) throws ParseException {
        System.out.println("*************createDateItem Begins******************");
        final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

        for (final Long date : dates) {
            System.out.println(date);
        }

        for (final Long date : dates) {
            String currDateStr = formatter.format(date);
            Date currDateDat = formatter.parse(currDateStr);
            System.out.println(" currDateStr as String " + currDateStr + " currDateDat as Date" + currDateDat);
        }

        System.out.println("*************createDateItem Ends******************");

    }

    public static ArrayList<String> getParseddate(final ArrayList<Long> dates) throws ParseException {
        System.out.println("*************getParseddate Begins******************");
        ArrayList<String> pasredDates = new ArrayList<String>();
        final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");


        for (final Long date : dates) {
            String currDateStr = formatter.format(date);
            Date currDateDat = formatter.parse(currDateStr);
            pasredDates.add(currDateStr);
            //System.out.println(" currDateStr as String " + currDateStr + " currDateDat as Date" + currDateDat);
        }

        System.out.println("*************getParseddate Ends******************");
        return pasredDates;

    }


}
//</editor-fold>
*/
