package com.example.exercice4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private EditText cours1Txt;
    private EditText cours2Txt;
    private EditText cours3Txt;
    private EditText cours4Txt;
    private TextView moyenneView;
    private TextView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        this.cours1Txt = (EditText) findViewById(R.id.cours1);
        this.cours2Txt = (EditText) findViewById(R.id.cours2);
        this.cours3Txt = (EditText) findViewById(R.id.cours3);
        this.cours4Txt = (EditText) findViewById(R.id.cours4);
        this.moyenneView = (TextView) findViewById(R.id.moyenne);
        this.messageView = (TextView) findViewById(R.id.message);
    }

    public void calculerMoyenne(View view) {

        Double cours1Dbl = Double.parseDouble(cours1Txt.getText().toString());
        Double cours2Dbl = Double.parseDouble(cours2Txt.getText().toString());
        Double cours3Dbl = Double.parseDouble(cours3Txt.getText().toString());
        Double cours4Dbl = Double.parseDouble(cours4Txt.getText().toString());

        Double moyenne = (cours1Dbl + cours2Dbl + cours3Dbl + cours4Dbl) / 4;

        String message = "";

        if (moyenne < 60) {
            message = "ca va mal";
        } else {
            message = "ca va bien";
        }

        moyenneView.setText("moyenne: " + moyenne.toString());
        messageView.setText(message.toString());
    }
}