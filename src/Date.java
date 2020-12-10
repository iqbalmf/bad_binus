import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
        //1. Format Time In MMMM Format
        MMMFormat();
        //2. Name of weekdays
        nameWeekends();
        //3. change calendar
        addTimeCalendar();
    }

    private static void MMMFormat() {
        // displaying month in MMMM format
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        String strMonth = sdf.format(new java.util.Date());
        System.out.println("Month in MMMM format = " + strMonth);

    }

    private static void nameWeekends() {
        String[] weekdays = new DateFormatSymbols().getWeekdays();
        for (int i = 2; i < (weekdays.length - 1); i++) {
            String weekday = weekdays[i];
            System.out.println("Weekdays = " + weekday);
        }
    }

    private static void addTimeCalendar(){
        java.util.Date date = new java.util.Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("hari ini: "+date.toString());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("setelah 4 bulan: "+calendar.getTime().toString());
        calendar.add(Calendar.DAY_OF_WEEK, 2);
        System.out.println("setelah 2 hari: "+calendar.getTime().toString());
        calendar.add(Calendar.YEAR, 3);
        System.out.println("setelah 3 tahun: "+ calendar.getTime().toString());
    }
}
