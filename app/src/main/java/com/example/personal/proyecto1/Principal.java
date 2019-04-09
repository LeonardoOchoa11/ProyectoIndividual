package com.example.personal.proyecto1;

import android.content.Intent;
import android.print.PrintManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Principal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Button btingresar= (Button) findViewById(R.id.btingresar);
        btingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario=((EditText) findViewById(R.id.txtUsuario)).getText().toString();
                String pass=((EditText) findViewById(R.id.txtPass)).getText().toString();
                if (usuario.equals("admin")&& pass.equals("admin"))
                {
                    startActivity(new Intent(Principal.this, Secundario.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
