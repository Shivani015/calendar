package com.example.shivanikoul.calender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="Main Activity";

   private TextView calender;
   private Button gobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calender =findViewById(R.id.calender);
        gobtn =findViewById(R.id.gobtn);

        Intent incoming =getIntent();
        String date =incoming.getStringExtra("date");
        calender.setText("date");

        gobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,calender.class);
                startActivity(intent);
            }
        });
    }
}
