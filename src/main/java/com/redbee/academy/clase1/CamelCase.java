package com.redbee.academy.clase1;

public class CamelCase {


    /**
     * Generar un algoritmo que cuente la cantidad de palabras que hay en un texto teniendo en cuenta que está escrito
     * en notación camelCase.
     * <p>
     * Por ejemplo:
     * hoyVoyAlCine tiene 4 palabras:
     * - hoy
     * - Voy
     * - Al
     * - Cine
     *
     * @parampalabra
     * @return
     */
    public static Integer resolver(String texto) {

        int palabra = 1;
        int indice = 0;
        while(indice < texto.length()) {
            if(Character.isUpperCase(texto.charAt(indice))) {
                palabra++;
            }
            indice++;
        }
        return palabra;

    }
}
