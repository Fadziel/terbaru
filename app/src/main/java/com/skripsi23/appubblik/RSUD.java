package com.skripsi23.appubblik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RSUD extends AppCompatActivity {

    ImageButton androidImageButton,ibCS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsud);

        androidImageButton = (ImageButton) findViewById(R.id.BPJS);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View m) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), BPJS.class);

                startActivity(intent);

            }
        });

        androidImageButton = (ImageButton) findViewById(R.id.Gmap);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View n) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), RSUDMAP.class);

                startActivity(intent);

            }
        });

        ibCS = (ImageButton) findViewById(R.id.csrs);
        ibCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),ChatKeCS.class);
                String namaLayanan = "RSUD";
                String to_id = "rsud";
                i.putExtra("namaLayanan",namaLayanan);
                i.putExtra("to_id",to_id);
                startActivity(i);
            }
        });

    }
}
