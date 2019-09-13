package com.example.combank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdConfirm extends AppCompatActivity {

    TextView marquee;
    TextView deb;
    TextView cred;
    TextView Amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_confirm);

        marquee=(TextView)findViewById(R.id.marquee);
        marquee.setSelected(true);

        deb=(TextView)findViewById(R.id.debacc);
        cred=(TextView)findViewById(R.id.credacc);
        Amount=(TextView)findViewById(R.id.amount);

        String acc1 =getIntent().getExtras().getString("Deb");
        String acc2 =getIntent().getExtras().getString("Cred");
        String amount =getIntent().getExtras().getString("Amount");

        deb.setText(acc1);
        cred.setText(acc2);
        Amount.setText(amount);

    }
}
