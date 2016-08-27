package com.aymensoft.googlecalendar;

/**
 * Created by User on 17/08/2016.
 */
public class temp {
    /*
    *
    DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
    Calendar cal = Calendar.getInstance();
    Date dateStart, dateEnd;
    String startdate, enddate;

    * calendar=(Button)findViewById(R.id.btn_calendar);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startdate = "2016-08-17 12:25:00";
                enddate = "2016-08-17 17:25:00";
                Calendar cal = Calendar.getInstance();
                try {
                    dateStart=dateFormat.parse(startdate);
                    dateEnd=dateFormat.parse(enddate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra("calendar_id", "0");
                intent.putExtra("title", " Test Title");
                intent.putExtra("description",  "This is test event");
                intent.putExtra("eventLocation", "School");
                intent.putExtra("eventTimezone", "Tunisia");
                intent.putExtra("dtstart", dateStart);
                intent.putExtra("endTime",dateEnd);
                intent.putExtra("allDay", false);
                intent.putExtra("rrule", "FREQ=YEARLY");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });*/

}
