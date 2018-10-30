package com.lesnyg.edu.sendbundleintent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String text = ((Button)v).getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("singleName",text);
        Intent intent = new Intent(this,secondActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
