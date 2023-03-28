package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class Multiplicar extends AppCompatActivity
{
    private EditText editTextA;
    private EditText editTextB;
    private EditText Resultado;
    int numero1,numero2,Solucion;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);
        editTextA = this.findViewById(R.id.Multiplicar1);
        editTextB = this.findViewById(R.id.Multiplicar2);
        Resultado = this.findViewById(R.id.Resultado);
        numero1= Integer.parseInt(editTextA.getText().toString());
        numero2= Integer.parseInt(editTextB.getText().toString());
        Solucion= Integer.parseInt(Resultado.getText().toString());
    }
    public void Multiplicar(View view)
    {
        Solucion=numero1*numero2;
    }
    public void Volver(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}