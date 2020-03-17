package com.example.listview_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowInfo extends AppCompatActivity {
    private TextView textView;
    private String [] names = new String[]{"20161707", "20161713","20171591"," 20171592", "20171616" ,"20171627", "20171641" ,"20171649", "20171650",
            "20171653" ,"20171654", "20171655", "20171656", "20171659", "20171664", "20171666", "20171667", "20171668", "20171669", "20171670", "20171679",
            "20171688", "20171697", "20171705", "20171707" ,"20171714", "20171717", "20171731", "20171742", "20175064", "20175980", "20175990"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);
        textView = (TextView)findViewById(R.id.show_info);
        textView.setText("this is "+names[MainActivity.num]);
    }
}
