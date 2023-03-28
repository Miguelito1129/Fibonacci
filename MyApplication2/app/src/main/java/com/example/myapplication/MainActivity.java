package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity
{
    private EditText editTextA;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextA = findViewById(R.id.TextA);
    }


    public void Boton(View view)
    {
        int numero;
        numero= Integer.parseInt(editTextA.getText().toString());
        if (numero == 3)
        {
            Intent intent = new Intent(this, Ejemplo.class);
            startActivity(intent);
        }
        if (numero==1)
        {
            Intent intent = new Intent(this, Sumar.class);
            startActivity(intent);
        }
        if (numero==2)
        {
            Intent intent = new Intent(this, Restar.class);
            startActivity(intent);
        }
        if (numero==4)
        {
            Intent intent = new Intent(this, Multiplicar.class);
            startActivity(intent);
        }
    }
}