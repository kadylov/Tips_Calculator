package com.example.hw2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class CalculatorOutputActivity extends AppCompatActivity {

    private TextView totalAmountView;
    private TextView taxAmountView;
    private TextView tipPercentageView;
    private TextView tipAmountView;
    private TextView grandTotalView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);


        totalAmountView = findViewById(R.id.txtTotalAmountView);
        taxAmountView = findViewById(R.id.txtTaxAmountView);
        tipPercentageView = findViewById(R.id.txtTipPercentageView);
        taxAmountView = findViewById(R.id.txtTaxAmountView);

        tipAmountView = findViewById(R.id.txtTipAmountView);
        grandTotalView = findViewById(R.id.txtGrandTotalView);

        Intent intent = getIntent();

        if (intent != null) {

            String totalAmount = intent.getStringExtra("totalAmount");
            String taxAmount = intent.getStringExtra("taxAmount");
            String percentage = intent.getStringExtra("percentage");

            calculateAndDisplay(Double.parseDouble(totalAmount), Double.parseDouble(taxAmount), Double.parseDouble(percentage));


        } else
            Log.i("Info:", "Intent is not defined");


    }

    public void calculateAndDisplay(double totalAmount, double taxAmount, double tipPercentage) {
        // Calculate tip amount = total amount * tip percentage
        // Calculate grand total = total amount + tax amount + tip amount

        double tipAmount = totalAmount * (tipPercentage / 100);
        double grandTotal = totalAmount + taxAmount + tipAmount;

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        NumberFormat percentInstance = NumberFormat.getPercentInstance();

        totalAmountView.setText(currency.format(totalAmount));
        taxAmountView.setText(currency.format(taxAmount));
        tipPercentageView.setText(percentInstance.format(tipPercentage/100));
        tipAmountView.setText(currency.format(tipAmount));
        grandTotalView.setText(currency.format(grandTotal));

    }

    public void returnToCalculatorInput(View view) {
        Intent calculatorOutputIntent = new Intent(this,CalculatorInputActivity.class);
        startActivity(calculatorOutputIntent);
    }
}
