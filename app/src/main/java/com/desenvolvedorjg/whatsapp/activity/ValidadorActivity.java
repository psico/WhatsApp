package com.desenvolvedorjg.whatsapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.desenvolvedorjg.whatsapp.R;
import com.desenvolvedorjg.whatsapp.helper.Preferencias;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

import java.util.HashMap;

public class ValidadorActivity extends AppCompatActivity {

    private EditText codigoValidcacao;
    private Button validar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validador);

        codigoValidcacao = (EditText) findViewById(R.id.edit_cod_validacao);
        validar = (Button) findViewById(R.id.bt_validar);

        SimpleMaskFormatter simpleMaskValidacao = new SimpleMaskFormatter("NNNN");
        MaskTextWatcher mascaraCodigoValidcao = new MaskTextWatcher(codigoValidcacao, simpleMaskValidacao);
        codigoValidcacao.addTextChangedListener(mascaraCodigoValidcao);

        validar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Preferencias preferencias = new Preferencias(ValidadorActivity.this);
                HashMap<String, String> usuario = preferencias.getDadosUsuario();

                String tokenGerado = usuario.get("token");
                String tokenDigitado = codigoValidcacao.getText().toString();


                if ( tokenDigitado.equals(tokenGerado) ) {
                    Toast.makeText(ValidadorActivity.this, "Código digitado VALIDO!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(ValidadorActivity.this, "Código digitado  INVALIDO!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
