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
    private EditText editTextB;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.TextA);
        editTextB = findViewById(R.id.TextB);

        textViewResultado = findViewById(R.id.Resultado);


        Fibonacci fibonacci = new Fibonacci();
        Button btnCalcular = findViewById(R.id.Factorial);

        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int resultado;
                int numero,numero2;
                numero= Integer.parseInt(editTextA.getText().toString());
                numero2= Integer.parseInt(editTextB.getText().toString());
                resultado = fibonacci.calcularFibonacci(numero,numero2);

                String mensaje = "La secuencia de Fibonacci es: ";


                    mensaje += resultado;


                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void sumar(View view)
    {
        int operacion= Integer.parseInt(editTextA.getText().toString())+ Integer.parseInt(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");
    }
    public void Restar(View view)
    {
        int operacion= Integer.parseInt(editTextA.getText().toString())- Integer.parseInt(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");
    }
    public void Dividir(View view)
    {
        int operacion= Integer.parseInt(editTextA.getText().toString())/ Integer.parseInt(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");
    }
    public void Multiplicar(View view)
    {
        int operacion= Integer.parseInt(editTextA.getText().toString())* Integer.parseInt(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");
    }
}