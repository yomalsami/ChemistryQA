package com.example.android.chemistryqa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonSinhala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finds the buttons to which we set up
        //the onclickListner
        buttonSinhala = (Button)findViewById(R.id.Sinhala_select);

        buttonSinhala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(getBaseContext(),MenuActivity.class);
                startActivity(menu);
            }
        });


        TextView myTextView = (TextView) findViewById(R.id.textViewChemistry);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Lovelo_Black.otf");
        myTextView.setTypeface(typeface);
    }
}
