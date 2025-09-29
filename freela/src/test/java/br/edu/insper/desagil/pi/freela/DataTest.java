package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private Data data;

    @Test
    void constroi() {
        data = new Data();
        assertEquals(1, data.getDia());
        assertEquals(1, data.getMes());
        assertEquals(1970, data.getAno());
        assertEquals(0, data.minutos());
    }

    @Test
    void dataBaixa() {
        data = new Data();
        data.ajusta(0,0,1969);
        assertEquals(1, data.getDia());
        assertEquals(1, data.getMes());
        assertEquals(1970, data.getAno());
        assertEquals(0, data.minutos());
    }

    @Test
    void dataAlta() {
        data = new Data();
        data.atualiza(2071,13,2071);
        assertEquals(31, data.getDia());
        assertEquals(12, data.getMes());
        assertEquals(2070, data.getAno());
        assertEquals(53084160, data.minutos());
    }
}
