package com.redbee.academy.clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Palindromo {

    /**
     * Generar un algoritmo que resuelva si una palabra es palindramo.
     *
     * Una palabra es palindromo cuando se lee de izquierda a derecha y de derecha a izquierda.
     * Por ej: neuquen
     *
     * @param palabra
     * @return
     */
    public static Boolean esPalindromo(String palabra) {
        List<String> p = new ArrayList<>();
        int n = p.size();
        int i = 0;
        int j = n;
        boolean es_palindromo = true;
        while(i != j && es_palindromo){
            if(p.get(i) != p.get(j)){
                es_palindromo = false;
                i++;
                j--;
            }
        }
        return es_palindromo;
    }
}
