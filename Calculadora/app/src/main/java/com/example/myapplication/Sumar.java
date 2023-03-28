package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Sumar extends AppCompatActivity
{

    private EditText editTextA;
    private EditText editTextB;
    private EditText Resultado;
    int numero1,numero2,Solucion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);
        editTextA = this.findViewById(R.id.Sumar1);
        editTextB = this.findViewById(R.id.Sumar2);
        Resultado = this.findViewById(R.id.Resultado);
        numero1= Integer.parseInt(editTextA.getText().toString());
        numero2= Integer.parseInt(editTextB.getText().toString());
        Solucion= Integer.parseInt(Resultado.getText().toString());
    }

    public void Sumar(View view)
    {
        Solucion=numero1+numero2;
    }
    public void Volver(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}