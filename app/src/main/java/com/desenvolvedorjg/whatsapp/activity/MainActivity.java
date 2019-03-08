package com.desenvolvedorjg.whatsapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.desenvolvedorjg.whatsapp.R;
import com.desenvolvedorjg.whatsapp.config.ConfiguracaoFirebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
