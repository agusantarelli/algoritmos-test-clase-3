package com.redbee.academy.clase3;

import javax.crypto.AEADBadTagException;
import java.lang.Integer;
import java.lang.String;
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cuil {

    /**
     * Un CUIL es un número que consta de 11 dígitos y está conformado de la siguiente manera:
     *
     * XX-12345678-Y
     *
     * Donde XX es el tipo de persona física o jurídica y pueden ser los siguientes:
     * 27 es para mujeres
     * 20 es para hombres
     * 23 puede ser ambos (se usa cuando hay otro número igual)
     * 30 empresas
     *
     * Generar un algoritmo para poder calcular el valor de Y que se hace de la siguiente forma:
     * A cada uno de los 10 dígitos que conocemos, se multiplica por: 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 respectivamente
     *
     *
     * Se suman los valores obtenidos, el resultado se divide por 11, y del resultado  se toma el primer decimal.
     * Ese primer decimal se resta a 11 y el resultado es el numero verificador.
     *
     *
     * EJEMPLO
     * DNI 12.345.678 Masculino
     *
     * 2 0 1 2 3 4 5 6 7 8
     * x
     * 5 4 3 2 7 6 5 4 3 2
     * ————————————————————
     * 10+0+3+4+21+24+25+24+21+16= 148
     *
     *
     * 148 dividido 11 = 5 ( porque 148/11= 13,454 –; .454 se redondea a 5).
     * 11-5 = 6
     *
     * Entonces, el CUIL es 20-12345678-6
     *
     * @param tipoPersona
     * @param dni
     * @return
     */
    public static Integer calcular(Integer tipoPersona, Integer dni) {
        String type = String.valueOf(tipoPersona);
        String doc = String.valueOf(dni);
        double sum = Cuil.sumaYMultiplicacion(type,doc);
        int lastDecimal = Cuil.firstDecimal(sum);
        return (11-lastDecimal);
    }

    private static Double sumaYMultiplicacion(String type, String doc){
        double sum = 0.0;
        sum += Character.getNumericValue(type.charAt(0)) * 5;
        sum += Character.getNumericValue(type.charAt(1)) * 4;
        sum += Character.getNumericValue(doc.charAt(0)) * 3;
        sum += Character.getNumericValue(doc.charAt(1)) * 2;
        sum += Character.getNumericValue(doc.charAt(2)) * 7;
        sum += Character.getNumericValue(doc.charAt(3)) * 6;
        sum += Character.getNumericValue(doc.charAt(4)) * 5;
        sum += Character.getNumericValue(doc.charAt(5)) * 4;
        sum += Character.getNumericValue(doc.charAt(6)) * 3;
        sum += Character.getNumericValue(doc.charAt(7)) * 2;
        return sum;
    }
    private static Integer firstDecimal (Double number){
        double round = (number/11);
        int first_dec = (int) Math.round(round * 100.0) % 10;
        return first_dec;
    }
}
