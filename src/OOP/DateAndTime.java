package OOP;

// import java.time.Timestamp;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime d;          // Represents a date and time without a time zone (Java 8 and later)
        GregorianCalendar c;     // Represents a calendar date with time, based on the Gregorian calendar

        d = LocalDateTime.now();                              // Current date and time
        c = new GregorianCalendar(2023, Calendar.JANUARY, 1);  // January 1, 2023

        // Manipulating and accessing values:
        int year = d.getYear();                   // Extracting the year from LocalDateTime
        int month = d.getMonthValue();            // Extracting the month from LocalDateTime
        int day = d.getDayOfMonth();              // Extracting the day of the month from LocalDateTime
        int hour = d.getHour();                   // Extracting the hour from LocalDateTime
        int minute = d.getMinute();               // Extracting the minute from LocalDateTime


        
    }
}
