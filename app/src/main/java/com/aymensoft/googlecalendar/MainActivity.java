package com.aymensoft.googlecalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button calendar;
    DateFormat dateFormatStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.FRENCH);
    DateFormat dateFormatEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.FRENCH);
    Calendar calStart = Calendar.getInstance();
    Calendar calEnd = Calendar.getInstance();
    Date dateStart, dateEnd;
    String startdate, enddate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendar=(Button)findViewById(R.id.btn_calendar);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addCalendarEvent();
            }
        });

    }

    public void addCalendarEvent(){
        startdate = "2016-08-17 12:25:00";
        enddate = "2016-08-17 17:25:00";
        try {
            dateStart=dateFormatStart.parse(startdate);
            dateEnd=dateFormatEnd.parse(enddate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        calStart=dateFormatStart.getCalendar();
        calEnd=dateFormatEnd.getCalendar();
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("title", "Title Event");
        intent.putExtra("description", "This is a sample description");
        intent.putExtra("beginTime", calStart.getTimeInMillis());
        intent.putExtra("endTime", calEnd.getTimeInMillis());
        intent.putExtra("allDay", false);
        intent.putExtra("eventLocation", "Address");
        intent.putExtra("eventTimezone", "Africa/Tunisia");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
