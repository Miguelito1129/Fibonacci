package com.example.myapplication;

public class Fibonacci extends MainActivity
{

    public int calcularFibonacci(int n, int b)
    {
        int Resultado=0;
        for(int i=0;i<n+b;i++)
        {
            Resultado=Resultado*i;
        }
        return Resultado;
    }

}