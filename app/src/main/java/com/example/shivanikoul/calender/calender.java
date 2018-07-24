package com.example.shivanikoul.calender;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import java.sql.Date;
import java.util.Calendar;

public class calender extends AppCompatActivity {
    private static final String TAG ="Calender Activity";
    private CalendarView mCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        mCalendarView =(CalendarView)findViewById(R.id.calendarView);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView CalendarView, int year, int month, int dayOfMonth) {
                String date = year + "/" + month + "/"+ dayOfMonth ;
                Log.d(TAG, "onSelectedDayChange: yyyy/mm/dd:" + date);
                Intent intent = new Intent(calender.this,MainActivity.class);
                intent.putExtra("date", date);
                startActivity(intent);
            }

        });
    }
}
