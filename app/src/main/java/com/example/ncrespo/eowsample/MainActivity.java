package com.example.ncrespo.eowsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected EditText in_date1;
    protected EditText in_date2;
    protected Button in_btn;
    protected TextView out_results;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in_btn = (Button)findViewById(R.id.button);
        in_btn.setOnClickListener(this);
        in_date1 = (EditText)findViewById(R.id.startDate);
        in_date2 = (EditText)findViewById(R.id.endDate);
        out_results = (TextView)findViewById(R.id.out_days);
    }

    @Override
    public void onClick(View view) {
        String date1 = in_date1.getText().toString();
        String date2 = in_date2.getText().toString();

        DateDiff dd = new DateDiff(date1, date2);

        out_results.setText(String.valueOf(dd.Difference()) + " days");
    }
}
