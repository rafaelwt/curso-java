import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleJavaUtilCalendar {

    public static void main (String [] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.SEPTEMBER, 25, 18, 20, 10);
        Date date = calendar.getTime();

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormato = formato.format(date);
        System.out.println("date = " + date);
        System.out.println("fechaFormato = " + fechaFormato);
    }
}
