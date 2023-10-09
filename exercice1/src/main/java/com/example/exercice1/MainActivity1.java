package com.example.exercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    private EditText article1Txt;
    private EditText article2Txt;
    private EditText article3Txt;
    private TextView montantView;
    private TextView shippingView;
    private TextView tpsView;
    private TextView tvqView;
    private TextView totalView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        this.article1Txt = (EditText) findViewById(R.id.art1);
        this.article2Txt = (EditText) findViewById(R.id.art2);
        this.article3Txt = (EditText) findViewById(R.id.art3);
        this.montantView = (TextView) findViewById(R.id.montant);
        this.shippingView = (TextView) findViewById(R.id.shipping);
        this.tpsView = (TextView) findViewById(R.id.tps);
        this.tvqView = (TextView) findViewById(R.id.tvq);
        this.totalView = (TextView) findViewById(R.id.total);
    }

    public void calculerTotal(View view) {
        Double article1Dbl = Double.parseDouble(article1Txt.getText().toString());
        Double article2Dbl = Double.parseDouble(article2Txt.getText().toString());
        Double article3Dbl = Double.parseDouble(article3Txt.getText().toString());

        Double montant = article1Dbl + article2Dbl + article3Dbl;

        Double shipping = 0D;

//        shipping

        if (montant < 200) {
            shipping = 30D;
        } else {
            shipping = 0D;
        }

//        rabais

        if (montant >= 1000) {
            montant = montant * 0.9;
        } else if (montant >= 500) {
            montant = montant * 0.95;
        } else {
            montant = montant * 1;
        }

        double tps = 0.05;
        double tvq = 0.09975;

        Double tpsMontant = tps * montant;
        Double tvqMontant = tvq * montant;

        Double total = montant + shipping + tpsMontant + tvqMontant;

        montantView.setText("Montant total HT: $ " + montant.toString());
        shippingView.setText("Shipping: $ " + shipping.toString());
        tpsView.setText("TPS: $ " + tpsMontant.toString());
        tvqView.setText("TVQ: $ " + tvqMontant.toString());
        totalView.setText("Montant total a payer: $ " + total.toString());
    }
}