package com.redbee.academy.clase3;

import java.util.List;
import java.lang.Float;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dolar {

    /**
     * Un analista financiero lleva un registro del precio del dólar día a día,
     * y desea saber cuál fue la mayor de las alzas en el precio diario a lo largo de ese período.
     *
     * Escriba un programa que analice el histórico del dólar recibido en una lista.
     *
     * El programa debe entregar como salida cuál fue la mayor de las alzas de un día para el otro.
     *
     * Si en ningún día el precio subió, la salida debe ser: 0.
     * Dia 1: 496.96
     * Dia 2: 499.03
     * Dia 3: 496.03
     * Dia 4: 493.27
     * Dia 5: 488.82
     * Dia 6: 492.16
     * Dia 7: 490.32
     * Dia 8: 490.67
     * Dia 9: 490.89
     * Dia 10: 494.10
     * La mayor alza fue de 3.34 pesos
     *
     * @param historicoDolar
     * @return
     */
    public static Float resolver(List<Float> historicoDolar) {
        Float up = 0f;
        Float max = 0f;
        for(int i = 0; i < historicoDolar.size()-1;i++){
            if(historicoDolar.get(i+1) > historicoDolar.get(i)){
                if(max < (historicoDolar.get(i+1) - historicoDolar.get(i))){
                    max = historicoDolar.get(i+1) - historicoDolar.get(i);
                }
            }
        }
        float result = (float) (Math.round(max * 100.0) / 100.0);
        return result;
    }
}
