package com.desenvolvedorjg.whatsapp.activity;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.desenvolvedorjg.whatsapp.R;
import com.desenvolvedorjg.whatsapp.config.ConfiguracaoFirebase;
import com.google.firebase.database.DatabaseReference;


public class LoginActivity extends AppCompatActivity {

    private DatabaseReference referenceFirebase;

    private String[] permissoesNecessarias = new String[]{
            Manifest.permission.SEND_SMS,
            Manifest.permission.INTERNET
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        referenceFirebase = ConfiguracaoFirebase.getFirebase();
        referenceFirebase.child("pontos").setValue("800");
    }

    public void abrirCadastroUsuario(View view) {
        Intent intent = new Intent(LoginActivity.this, CadastroUsuarioActivity.class);
        startActivity(intent);
        finish();
    }

}
