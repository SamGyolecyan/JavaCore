package homeworks.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat HOUR = new SimpleDateFormat("h:mm a");

    public static Date fromStringToDate(String dateStr) throws ParseException {
        return SDF.parse(dateStr);
    }

    public static String fromDateToString(Date date) {
        return SDF.format(date);
    }

    public static Date fromStringToHour(String dateStr) throws ParseException {
        return HOUR.parse(dateStr);
    }

    public static String fromHourToString(Date date) {
        return HOUR.format(date);
    }
}
