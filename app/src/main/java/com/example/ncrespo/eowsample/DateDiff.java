package com.example.ncrespo.eowsample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hawke on 2/7/2018.
 */

public class DateDiff {
    private String date1, date2;

    public DateDiff (String date1, String date2) {
        this.date1 = date1;
        this.date2 = date2;
    }

    public long Difference() {
        SimpleDateFormat df = new SimpleDateFormat("mm/dd/yyyy");
        long days = 0;

        try {
            Date firstDate = df.parse(date1);
            Date secondDate = df.parse(date2);

            long diff = secondDate.getTime() - firstDate.getTime();
            days = diff / (1000*60*60*24);

            return days;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }

}
