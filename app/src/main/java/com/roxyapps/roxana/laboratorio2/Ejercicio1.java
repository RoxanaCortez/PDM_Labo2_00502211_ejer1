package com.roxyapps.roxana.laboratorio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {

    private EditText name;
    private EditText pass;
    private Button click;
    private TextView caja;
    private  String contenido;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            click();
        }
    };

    private View.OnLongClickListener clickListeneeeer = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            if(v.getId()==R.id.bt_click){
                longclick();
            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        name = findViewById(R.id.et_name);


        pass = findViewById(R.id.et_pass);

        click = findViewById(R.id.bt_click);
        click.setOnClickListener(clickListener);
        click.setOnLongClickListener(clickListeneeeer);

        caja = findViewById(R.id.tv_caja);

        click();

    }

    private void  click(){
        contenido = name.getText().toString(); // Se obtiene el contenido en del EditText
        if(contenido!=""){
            caja.setText(contenido); // se pone el contenido del EditText en el TextView
        }
        else{
            caja.setText("");
        }

    }

    private void longclick(){
        contenido = pass.getText().toString();
        if(contenido!=""){
            caja.setText(contenido);
        }

    }
}
