package com.aulaetecbarueri.atividadebimestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_logado extends AppCompatActivity {

    Intent trocar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logado);
    }

    public void Voltar (View v){
        this.trocar = new Intent(activity_logado.this,MainActivity.class);
        startActivity(this.trocar);
    }
}
