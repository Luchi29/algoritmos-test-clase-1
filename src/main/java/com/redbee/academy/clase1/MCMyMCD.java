package com.redbee.academy.clase1;

public class MCMyMCD {


    /**
     * Generar un algoritmo que resuelva el mínimo común múltiplo entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcm(int num1, int num2) {
        Integer numOne = Math.max(num1, num2);
        Integer numTwo = Math.min(num1, num2);
        Integer result = (numOne / mcd(num1, num2))*numTwo;
        return result;

    }

    /**
     * Generar un algoritmo que resuelva el máximo común divisor entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcd(int num1, int num2) {
        Integer numOne = Math.max(num1, num2);
        Integer numTwo = Math.min(num1, num2);
        Integer result = 0;
        do {
           result = numTwo;
           numTwo = numOne%numTwo;
           numOne = result;
        } while(numTwo != 0);
        return result;
    }
}
