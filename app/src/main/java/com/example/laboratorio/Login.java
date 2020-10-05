package com.example.laboratorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button btn_ingresar;
    private EditText et_usuario, et_contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_usuario = findViewById(R.id.et_usuario);
        et_contraseña = findViewById(R.id.et_contraseña);
        btn_ingresar = findViewById(R.id.btn_ingresar);
    }

    public void ingresar (View view){
        String usu = et_usuario.getText().toString();
        String con = et_contraseña.getText().toString();
        if (usu.equals("admin") && con.equals("123")){
            Intent intent = new Intent(Login.this, Sistemas_Inicio.class);
            startActivity(intent);
            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }
    }

}