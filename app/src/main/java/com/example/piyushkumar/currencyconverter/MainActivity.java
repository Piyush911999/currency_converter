package com.example.piyushkumar.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCal;
    TextView usd, myr, bhd, rub, huf, jpy, chf;
    EditText inr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inr = findViewById(R.id.curr1);
        usd = findViewById(R.id.curr2);
        myr = findViewById(R.id.curr3);
        bhd = findViewById(R.id.curr4);
        rub = findViewById(R.id.curr5);
        huf = findViewById(R.id.curr6);
        jpy = findViewById(R.id.curr7);
        chf = findViewById(R.id.curr8);


        btnCal = findViewById(R.id.btnCal);

        //btnDel = findViewById(R.id.btnCal);


        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getApplicationContext(), "Results", Toast.LENGTH_SHORT).show();
                try {
                    double inrVal = Double.parseDouble(inr.getText().toString());


                    double usdCal = inrVal * (0.0155);
                    usd.setText(String.valueOf(usdCal));

                    double myrCal = inrVal * (0.0608);
                    myr.setText(String.valueOf(myrCal));

                    double bhdCal = inrVal * (0.0058);
                    bhd.setText(String.valueOf(bhdCal));

                    double rubCal = inrVal * (0.8941);
                    rub.setText(String.valueOf(rubCal));

                    double hufCal = inrVal * (3.9019);
                    huf.setText(String.valueOf(hufCal));

                    double jpyCal = inrVal * (1.6932);
                    jpy.setText(String.valueOf(jpyCal));

                    double chfCal = inrVal * (0.0145);
                    chf.setText(String.valueOf(chfCal));


                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_LONG).show();
                }

            }
        });


    }   //on Create

    public void page2(View view) {  // goto asg2

        Intent pg2 = new Intent(this, converter2.class);
        startActivity(pg2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.delete) {
            inr.setText("");
            usd.setText("USD");
            myr.setText("MYR");
            bhd.setText("BHD");
            rub.setText("RUB");
            huf.setText("HUF");
            jpy.setText("JPY");
            chf.setText("CHF");
        }

        return super.onOptionsItemSelected(item);
    }
}