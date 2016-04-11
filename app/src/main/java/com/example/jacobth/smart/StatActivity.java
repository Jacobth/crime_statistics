package com.example.jacobth.smart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jacobth on 2016-04-09.
 */
public class StatActivity extends Activity implements View.OnClickListener{

    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);

        backButton =(ImageButton)findViewById(R.id.backButton);
        backButton.setOnClickListener(this);

        Intent i = getIntent();
        String category = i.getExtras().getString("category");
        setLayout(category);


    }
    @Override
    public void onClick(View view) {
        finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void setLayout(String item) {
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        TextView textView = (TextView)findViewById(R.id.textHigh);

        switch (item) {
            case "Rån":
                textView.setText("Anmälda rån per 100 000 invånare från och med år 1950");
                imageView.setImageResource(R.drawable.robbery2);
                break;
            case "Misshandel":
                textView.setText("Anmäld misshandel per 100 000 invånare från och med år 1950");
                imageView.setImageResource(R.drawable.violence);
                break;
            case "Sexualbrott":
                textView.setText("Anmälda sexualbrott per 100 000 invånare från och med år 1950");
                imageView.setImageResource(R.drawable.sexual);
                break;
        }
    }
}
