package com.lesnyg.edu.sendbundleintent2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        TextView textView = (TextView)findViewById(R.id.singleName);
        textView.setText(bundle.getString("singleName","No Data"));
    }
}
