package com.redbee.academy.clase1;

public class Potencia {

    /**
     * Generar un algoritmo para elevar un número (base) a una potencia dada
     *
     * @param base
     * @param potencia
     * @return
     */
    public static Integer resolver(Integer base, Integer potencia) {
        int  resultado = 1;
        for(int i = 0; i < potencia; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
