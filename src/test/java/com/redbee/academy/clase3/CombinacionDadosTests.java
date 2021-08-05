package com.redbee.academy.clase3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinacionDadosTests {

    @Test
    void test2dados() {
        Assertions.assertEquals(1, CombinacionDados.resolverCombinacionesPosiblesCon2Dados(2));
    }

    @Test
    void test2dados2() {
        Assertions.assertEquals(3, CombinacionDados.resolverCombinacionesPosiblesCon2Dados(4));
    }

    @Test
    void test3dados() {
        Assertions.assertEquals(1, CombinacionDados.resolverCombinacionesPosiblesCon3Dados(3));
    }

    @Test
    void test3dados2() {
        Assertions.assertEquals(3, CombinacionDados.resolverCombinacionesPosiblesCon3Dados(4));
    }
}
