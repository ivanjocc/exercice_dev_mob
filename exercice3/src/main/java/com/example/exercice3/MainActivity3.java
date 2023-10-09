package com.example.exercice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText tempTxt;
    private RadioButton fahrRb;
    private RadioButton celsiusRb;
    private TextView temperatureView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        this.tempTxt = (EditText) findViewById(R.id.temp);
        this.fahrRb = (RadioButton) findViewById(R.id.fahr);
        this.celsiusRb = (RadioButton) findViewById(R.id.celsius);
        this.temperatureView = (TextView) findViewById(R.id.temperature);
    }

    public void convertirDegres(View view) {
        Double input = Double.parseDouble(tempTxt.getText().toString());
        Double temp = null;

        try {
            temp = input;
        } catch (NumberFormatException e) {
            temperatureView.setText("saisir un valeur valide");
            return;
        }

        if (celsiusRb.isChecked()) {
            double fahrenheit = (temp * 9 / 5) + 32;
            temperatureView.setText("L'équivalent de la température est : " + fahrenheit + "°F");
        } else if (fahrRb.isChecked()) {
            double celsius = (temp - 32) * 5 / 9;
            temperatureView.setText("L'équivalent de la température est : " + celsius + "°C");
        }
    }
}