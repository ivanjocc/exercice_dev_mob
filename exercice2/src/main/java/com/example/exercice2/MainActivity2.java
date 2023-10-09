package com.example.exercice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    private EditText secondsTxt;
    private TextView timeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.secondsTxt = (EditText) findViewById(R.id.second);
        this.timeView = (TextView) findViewById(R.id.time);
    }

    public void convertir(View view) {
        Integer secondsInt = Integer.parseInt(secondsTxt.getText().toString());

        Integer jours = secondsInt / (60 * 60 * 24);
        Integer heures = (secondsInt % (60 * 60 * 24)) / (60 * 60);
        Integer minutes = ((secondsInt % (60 * 60 * 24)) % (60 * 60)) / 60;
        Integer seconds = secondsInt % (60 * 60 * 24) % (60 * 60) % 60;

        timeView.setText(
                jours.toString() + " jour(s) " +
                heures.toString() + " heure(s) " +
                minutes.toString() + " minute(s) " +
                seconds.toString() + " seconde(s) "
        );
    }
}