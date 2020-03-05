package com.aulaetecbarueri.atividadebimestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent trocar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Logar (View v){
        EditText login = findViewById(R.id.edtUser);
        EditText pass = findViewById(R.id.edtPass);
        String loginStr = login.getText().toString();
        String passStr = pass.getText().toString();

        if (loginStr.equals("admin") && passStr.equals("admin")){
            this.trocar = new Intent(MainActivity.this,activity_logado.class);
            startActivity(this.trocar);
        }
    }
}
