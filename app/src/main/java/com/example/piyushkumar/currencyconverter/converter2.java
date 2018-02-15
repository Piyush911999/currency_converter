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

public class converter2 extends AppCompatActivity {

    Button btnCal, btnCal2, btnCal3, btnCal4, btnCal5, btnCal6, btnCal7, btnCal8;
    EditText inr, usd, myr, bhd, rub, huf, jpy, chf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter2);

        inr = findViewById(R.id.curr1);
        usd = findViewById(R.id.curr2);
        myr = findViewById(R.id.curr3);
        bhd = findViewById(R.id.curr4);
        rub = findViewById(R.id.curr5);
        huf = findViewById(R.id.curr6);
        jpy = findViewById(R.id.curr7);
        chf = findViewById(R.id.curr8);

        btnCal = findViewById(R.id.btnCal);
        btnCal2 = findViewById(R.id.btnCal2);
        btnCal3 = findViewById(R.id.btnCal3);
        btnCal4 = findViewById(R.id.btnCal4);
        btnCal5 = findViewById(R.id.btnCal5);
        btnCal6 = findViewById(R.id.btnCal6);
        btnCal7 = findViewById(R.id.btnCal7);
        btnCal8 = findViewById(R.id.btnCal8);

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


        btnCal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getApplicationContext(), "Results", Toast.LENGTH_SHORT).show();
                try {
                    double usdVal = Double.parseDouble(usd.getText().toString());


                    double inrCal = usdVal * (64.2903);
                    inr.setText(String.valueOf(inrCal));

                    double myrCal = usdVal * (3.9126);
                    myr.setText(String.valueOf(myrCal));

                    double bhdCal = usdVal * (0.376);
                    bhd.setText(String.valueOf(bhdCal));

                    double rubCal = usdVal * (57.4481);
                    rub.setText(String.valueOf(rubCal));

                    double hufCal = usdVal * (250.8708);
                    huf.setText(String.valueOf(hufCal));

                    double jpyCal = usdVal * (108.9701);
                    jpy.setText(String.valueOf(jpyCal));

                    double chfCal = usdVal * (0.9339);
                    chf.setText(String.valueOf(chfCal));


                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_LONG).show();
                }

            }
        });


        btnCal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getApplicationContext(), "Results", Toast.LENGTH_SHORT).show();
                try {
                    double myrVal = Double.parseDouble(myr.getText().toString());


                    double inrCal = myrVal * (16.4344);
                    inr.setText(String.valueOf(inrCal));

                    double usdCal = myrVal * (0.2555);
                    usd.setText(String.valueOf(usdCal));

                    double bhdCal = myrVal * (0.0961);
                    bhd.setText(String.valueOf(bhdCal));

                    double rubCal = myrVal * (14.6633);
                    rub.setText(String.valueOf(rubCal));

                    double hufCal = myrVal * (64.1226);
                    huf.setText(String.valueOf(hufCal));

                    double jpyCal = myrVal * (27.8328);
                    jpy.setText(String.valueOf(jpyCal));

                    double chfCal = myrVal * (0.2388);
                    chf.setText(String.valueOf(chfCal));


                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnCal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getApplicationContext(), "Results", Toast.LENGTH_SHORT).show();
                try {
                    double bhdVal = Double.parseDouble(bhd.getText().toString());


                    double inrCal = bhdVal * (170.895);
                    inr.setText(String.valueOf(inrCal));

                    double myrCal = bhdVal * (10.4095);
                    myr.setText(String.valueOf(myrCal));

                    double usdCal = bhdVal * (2.6595);
                    usd.setText(String.valueOf(usdCal));

                    double rubCal = bhdVal * (152.6186);
                    rub.setText(String.valueOf(rubCal));

                    double hufCal = bhdVal * (666.9613);
                    huf.setText(String.valueOf(hufCal));

                    double jpyCal = bhdVal * (289.5963);
                    jpy.setText(String.valueOf(jpyCal));

                    double chfCal = bhdVal * (2.4839);
                    chf.setText(String.valueOf(chfCal));


                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnCal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getApplicationContext(), "Results", Toast.LENGTH_SHORT).show();
                try {
                    double rubVal = Double.parseDouble(rub.getText().toString());


                    double inrCal = rubVal * (1.1197);
                    inr.setText(String.valueOf(inrCal));

                    double myrCal = rubVal * (0.0682);
                    myr.setText(String.valueOf(myrCal));

                    double bhdCal = rubVal * (0.0065);
                    bhd.setText(String.valueOf(bhdCal));

                    double usdCal = rubVal * (0.01742);
                    usd.setText(String.valueOf(usdCal));

                    double hufCal = rubVal * (4.3702);
                    huf.setText(String.valueOf(hufCal));

                    double jpyCal = rubVal * (1.8977);
                    jpy.setText(String.valueOf(jpyCal));

                    double chfCal = rubVal * (0.0163);
                    chf.setText(String.valueOf(chfCal));


                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnCal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getApplicationContext(), "Results", Toast.LENGTH_SHORT).show();
                try {
                    double hufVal = Double.parseDouble(huf.getText().toString());


                    double inrCal = hufVal * (0.2561);
                    inr.setText(String.valueOf(inrCal));

                    double myrCal = hufVal * (0.0156);
                    myr.setText(String.valueOf(myrCal));

                    double bhdCal = hufVal * (0.0014);
                    bhd.setText(String.valueOf(bhdCal));

                    double rubCal = hufVal * (0.2288);
                    rub.setText(String.valueOf(rubCal));

                    double usdCal = hufVal * (0.0032);
                    usd.setText(String.valueOf(usdCal));

                    double jpyCal = hufVal * (0.4344);
                    jpy.setText(String.valueOf(jpyCal));

                    double chfCal = hufVal * (0.0037);
                    chf.setText(String.valueOf(chfCal));


                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnCal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getApplicationContext(), "Results", Toast.LENGTH_SHORT).show();
                try {
                    double jpyVal = Double.parseDouble(jpy.getText().toString());


                    double inrCal = jpyVal * (0.587);
                    inr.setText(String.valueOf(inrCal));

                    double myrCal = jpyVal * (0.0358);
                    myr.setText(String.valueOf(myrCal));

                    double bhdCal = jpyVal * (0.0034);
                    bhd.setText(String.valueOf(bhdCal));

                    double rubCal = jpyVal * (0.5221);
                    rub.setText(String.valueOf(rubCal));

                    double hufCal = jpyVal * (2.2851);
                    huf.setText(String.valueOf(hufCal));

                    double usdCal = jpyVal * (0.0091);
                    usd.setText(String.valueOf(usdCal));

                    double chfCal = jpyVal * (0.0085);
                    chf.setText(String.valueOf(chfCal));


                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnCal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getApplicationContext(), "Results", Toast.LENGTH_SHORT).show();
                try {
                    double chfVal = Double.parseDouble(chf.getText().toString());


                    double inrCal = chfVal * (68.7123);
                    inr.setText(String.valueOf(inrCal));

                    double myrCal = chfVal * (4.1875);
                    myr.setText(String.valueOf(myrCal));

                    double bhdCal = chfVal * (0.4025);
                    bhd.setText(String.valueOf(bhdCal));

                    double rubCal = chfVal * (61.2213);
                    rub.setText(String.valueOf(rubCal));

                    double hufCal = chfVal * (267.7758);
                    huf.setText(String.valueOf(hufCal));

                    double jpyCal = chfVal * (116.6162);
                    jpy.setText(String.valueOf(jpyCal));

                    double usdCal = chfVal * (1.0706);
                    usd.setText(String.valueOf(usdCal));


                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter a valid number!!", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.delete) {
            inr.setText("");
            usd.setText("");
            myr.setText("");
            bhd.setText("");
            rub.setText("");
            huf.setText("");
            jpy.setText("");
            chf.setText("");
        }

        return super.onOptionsItemSelected(item);
    }

    public void page1(View view) {
        Intent pg1 = new Intent(this, MainActivity.class);
        startActivity(pg1);
        finish();

    }
}
