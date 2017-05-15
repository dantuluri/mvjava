package cruft;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Time
{
    private static final NumberFormat DEFAULT_FORMAT = new DecimalFormat("00");
    private static final int DEFAULT_CAPACITY = 8;
    private static final char DEFAULT_DELIMITER = ':';

    private final int hour;
    private final int minute;
    private final int second;

    public Time()
    {
        this(0, 0, 0);
    }

    public Time(int hour)
    {
        this(hour, 0, 0);
    }

    public Time(int hour, int minute)
    {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder(DEFAULT_CAPACITY);

        builder.append(DEFAULT_FORMAT.format(hour))
               .append(DEFAULT_DELIMITER)
               .append(DEFAULT_FORMAT.format(minute))
               .append(DEFAULT_DELIMITER)
               .append(DEFAULT_FORMAT.format(second));

        return builder.toString();
    }

    public static void main(String[] args)
    {
        Time time = new Time(11, 5);
        System.out.println(time);
    }
}
