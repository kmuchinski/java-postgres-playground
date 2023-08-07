package com.example;

public class MathUtil {
    static int mdc(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        if (b > 0 && a % b == 0)
                return b;
        if (b == 0)
            return Math.abs(a);

        return mdc(a-b, b);
    }

    static int mdc(int ...valores){
        if (valores == null)
            throw new NullPointerException("É necessário passar um valor diferente de Nulo.");
        if (valores.length == 0)
            throw new IllegalArgumentException("É necessário ao menos um valor para calcular o MDC.");
        int a = valores[0];
        for (int b : valores) {
            a = mdc(a, b);
        }
        
        return a;
    }
}
