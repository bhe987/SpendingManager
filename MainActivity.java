package com.example.spendingmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import java.math.BigDecimal;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView balanceheader, dateEntryText, AmountText, CategoryText;
    TextView historyDateDisplay, historyTextAmount, historyTextCategory, historyDepWithText;
    Button AddDeposit, SubtractWithdraw;
    BigDecimal balance;
    EditText balanceText;
    public class TransactionObject {
        String date;
        double amount;
        String category;
        boolean deposit, withdraw;
    }
    ArrayList<TransactionObject> transactions = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        balance = new BigDecimal("200.00");

        balanceText = findViewById(R.id.balanceText);
        dateEntryText = findViewById(R.id.dateEntryText);
        AmountText = findViewById(R.id.AmountText);
        CategoryText = findViewById(R.id.CategoryText);
        AddDeposit = findViewById(R.id.AddDeposit);
        SubtractWithdraw = findViewById(R.id.SubtractWithdraw);
        historyDateDisplay = findViewById(R.id.historyDateDisplay);
        historyTextAmount = findViewById(R.id.historyTextAmount);
        historyTextCategory = findViewById(R.id.historyTextCategory);
        historyDepWithText = findViewById(R.id.historyDepWithText);

        AddDeposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strDate = dateEntryText.getText().toString();
                double doubleAmount = Double.valueOf(AmountText.getText().toString());
                String strCategory = CategoryText.getText().toString();
                TransactionObject obj1 = new TransactionObject();
                obj1.amount = doubleAmount;
                obj1.date = strDate;
                obj1.category = strCategory;
                transactions.add(obj1);
            }
        });
        SubtractWithdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strDate = dateEntryText.getText().toString();
                double doubleAmount = Double.valueOf(AmountText.getText().toString());
                String strCategory = CategoryText.getText().toString();
                TransactionObject obj1 = new TransactionObject();
                obj1.amount = doubleAmount;
                obj1.date = strDate;
                obj1.category = strCategory;
                transactions.add(obj1);
            }
        });
    }
}
