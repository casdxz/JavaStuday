package top.bearcad.java.basic.lesson;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-21 10:53
 **/

public class MyDate extends Date {

    public void getGmt(){
        Calendar cd = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("EEE d MMM yyyy HH:mm:ss 'GMT'", Locale.CHINA );
        df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        System.out.println(df.format(cd.getTime()));
        System.out.println(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(this);
    }
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        System.out.println(myDate);
        MyDate.getGMT();
    }

    private static void getGMT() {
        Calendar cd = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        System.out.println(cd.getTime());
    }
}
