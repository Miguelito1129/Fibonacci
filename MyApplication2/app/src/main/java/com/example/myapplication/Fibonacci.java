package com.example.myapplication;
import java.util.*;

public class Fibonacci extends MainActivity
{
    public List<Integer> calcularFibonacci(int n)
    {
        List<Integer> lista = new ArrayList<>();
        if (n <= 0) {
            return lista;
        } else {
            if (n == 1) {
                lista.add(0);
                return lista;
            } else {

                if (n == 2) {
                    lista.add(0);
                    lista.add(1);
                    return lista;
                } else {
                    lista = calcularFibonacci(n - 1);
                    lista.add(lista.get(n - 2) + lista.get(n - 3));
                    return lista;
                }
            }

        }
    }
}