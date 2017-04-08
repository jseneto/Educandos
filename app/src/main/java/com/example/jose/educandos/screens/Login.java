package com.example.jose.educandos.screens;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.jose.educandos.R;

public class Login extends AppCompatActivity {

    CheckBox checkManterConectado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        checkManterConectado = (CheckBox) findViewById(R.id.check_manter_conectado);
    }


    public void clickLogin(View view) {
        //TODO: validar login do usuario, verificar checkbox de manter-se contectado
        if (checkManterConectado.isChecked()) {
            criarPreferencia();
        }
    }

    public void ClickRegistro(View view) {
        //TODO: abrir activity de registro de novos usuários
    }

    //preferencia carregada no splash pra exibir ou nao o login
    private void criarPreferencia() {
        SharedPreferences preferences = getSharedPreferences("com.example.jose.educandos.preferencias", MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = preferences.edit();
        prefsEditor.putBoolean("logado", true);
        prefsEditor.apply();
    }
}
