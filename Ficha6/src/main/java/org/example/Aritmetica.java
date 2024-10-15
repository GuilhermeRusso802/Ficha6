package org.example;

public class Aritmetica {
    public int area(int base, int altura) {
        return base * altura;
    }

    public int perimetro(int base, int altura) {
        return (base * 2) + (altura * 2);
    }

    public int isTriangle(int a, int b, int c) {
        if (a > b + c) {
            return 1;
        }

        return 0;
    }
}
