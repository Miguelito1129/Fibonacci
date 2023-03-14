package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;



public class MainActivity extends AppCompatActivity
{
    private EditText editTextA;

    private TextView textViewResultado;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextA = findViewById(R.id.TextA);

        textViewResultado = findViewById(R.id.Resultado);




    }
    public void Fibonacci(View view)
    {
        Fibonacci fibonacci = new Fibonacci();
        int numero;
        String resultado;
        numero= Integer.parseInt(editTextA.getText().toString());
        resultado = String.valueOf(fibonacci.calcularFibonacci(numero));
        textViewResultado.setText(resultado+"");
    }
}