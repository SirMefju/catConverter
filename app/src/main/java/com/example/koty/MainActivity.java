package com.example.koty;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean czyKot1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changePicture(View view)
    {
        ImageView imageView = findViewById(R.id.imageView);
        if (czyKot1)
        {
            imageView.setImageResource(R.drawable.kot2);
            czyKot1 = false;
        }
        else
        {
            imageView.setImageResource(R.drawable.kot1);
            czyKot1 = true;
        }
        //czyKot1 = !czyKot1;
    }
    public void convertDollar(View view)
    {
        EditText PLN = findViewById(R.id.textPln);
        String stringPLN = PLN.getText().toString();
        int intPLN = Integer.parseInt(stringPLN);
        double doubleUSD = intPLN*0.26;
        double doubleEUR = intPLN*0.22;
        @SuppressLint("DefaultLocale") String stringUSD = String.format("%.2f",doubleUSD);
        @SuppressLint("DefaultLocale") String stringEUR = String.format("%.2f",doubleEUR);
        //String stringEUR = String.format("%.2f",doubleEUR); same like up
        Toast.makeText(this,stringUSD+"$"+" or "+stringEUR+"€",Toast.LENGTH_LONG).show();
    }
}