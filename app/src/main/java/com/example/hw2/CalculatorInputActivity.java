package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import java.text.NumberFormat;


public class CalculatorInputActivity extends AppCompatActivity {

    private EditText totalAmountEditText;
    private EditText taxAmountEditText;

    private RadioButton zeroPercentRadioButton;
    private RadioButton fivePercentRadioButton;
    private RadioButton tenPercentRadioButton;
    private RadioButton twentyPercentRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        totalAmountEditText = findViewById(R.id.txtTotalAmountView);
        taxAmountEditText = findViewById(R.id.txtTaxAmountView);

        zeroPercentRadioButton = findViewById(R.id.rbtnZeroPercent);
        fivePercentRadioButton = findViewById(R.id.rbtnFivePercent);
        tenPercentRadioButton = findViewById(R.id.rbtnTenPercent);
        twentyPercentRadioButton = findViewById(R.id.rbtnTwentyPercent);

        // initialize the form with default values
        clearForm();

    }

    public void clearForm(View view) {

        String defaultNumber = "0.00";

        zeroPercentRadioButton.setChecked(true);

        totalAmountEditText.setText(defaultNumber);
        taxAmountEditText.setText(defaultNumber);
    }

    public void clearForm() {
        String defaultNumber = "0.00";

        zeroPercentRadioButton.setChecked(true);

        totalAmountEditText.setText(defaultNumber);
        taxAmountEditText.setText(defaultNumber);
    }

    public void calculateTip(View view) {

        String totalAmount = totalAmountEditText.getText().toString();
        String taxAmount = taxAmountEditText.getText().toString();
        String percentage = "";

        if (zeroPercentRadioButton.isChecked())
            percentage = "0";
        else if (fivePercentRadioButton.isChecked())
            percentage = "5";

        else if (tenPercentRadioButton.isChecked())
            percentage = "10";
        else
            percentage = "20";


        // validate user's input
        if (totalAmount.isEmpty() && taxAmount.isEmpty())
            totalAmount = taxAmount = "0.00";
        else if (totalAmount.isEmpty())
            totalAmount = "0.00";
        else if(taxAmount.isEmpty())
            taxAmount = "0.00";


        Intent calculatorOutputIntent = new Intent(this, CalculatorOutputActivity.class);

        calculatorOutputIntent.putExtra("totalAmount", totalAmount);
        calculatorOutputIntent.putExtra("taxAmount", taxAmount);
        calculatorOutputIntent.putExtra("percentage", percentage);

        // Launch CalculatorOutputActivity
        startActivity(calculatorOutputIntent);

    }
}
