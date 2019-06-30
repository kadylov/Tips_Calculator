package com.example.hw2;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public abstract class TipCalculatorActivity extends AppCompatActivity {

    private EditText totalAmountEditText;
    private EditText taxAmountEditText;

    private RadioButton zeroPercentRadioButton;
    private RadioButton fivePercentRadioButton;
    private RadioButton tenPercentRadioButton;
    private RadioButton twentyPercentRadioButton;


    public TipCalculatorActivity(){}

    public TipCalculatorActivity(Bundle savedInstanceState, int layoutResId) {
        super.onCreate(savedInstanceState);
        setContentView(layoutResId);

        totalAmountEditText = findViewById(R.id.txtTotalAmountView);
        taxAmountEditText = findViewById(R.id.txtTaxAmountView);

        zeroPercentRadioButton = findViewById(R.id.rbtnZeroPercent);
        fivePercentRadioButton = findViewById(R.id.rbtnFivePercent);
        tenPercentRadioButton = findViewById(R.id.rbtnTenPercent);
        twentyPercentRadioButton = findViewById(R.id.rbtnTwentyPercent);
    }

    public EditText getTotalAmountEditText() {
        return totalAmountEditText;
    }

    public void setTotalAmountEditText(EditText totalAmountEditText) {
        this.totalAmountEditText = totalAmountEditText;
    }

    public EditText getTaxAmountEditText() {
        return taxAmountEditText;
    }

    public void setTaxAmountEditText(EditText taxAmountEditText) {
        this.taxAmountEditText = taxAmountEditText;
    }

    public RadioButton getZeroPercentRadioButton() {
        return zeroPercentRadioButton;
    }

    public void setZeroPercentRadioButton(RadioButton zeroPercentRadioButton) {
        this.zeroPercentRadioButton = zeroPercentRadioButton;
    }

    public RadioButton getFivePercentRadioButton() {
        return fivePercentRadioButton;
    }

    public void setFivePercentRadioButton(RadioButton fivePercentRadioButton) {
        this.fivePercentRadioButton = fivePercentRadioButton;
    }

    public RadioButton getTenPercentRadioButton() {
        return tenPercentRadioButton;
    }

    public void setTenPercentRadioButton(RadioButton tenPercentRadioButton) {
        this.tenPercentRadioButton = tenPercentRadioButton;
    }

    public RadioButton getTwentyPercentRadioButton() {
        return twentyPercentRadioButton;
    }

    public void setTwentyPercentRadioButton(RadioButton twentyPercentRadioButton) {
        this.twentyPercentRadioButton = twentyPercentRadioButton;
    }
}
