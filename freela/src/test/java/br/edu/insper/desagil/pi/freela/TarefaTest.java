package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TarefaTest {
    private Momento momento;
    private Tarefa tarefa;

    @BeforeEach
    void setUp() {
        tarefa = new Tarefa(1);
    }

    @Test
    void constroi() {
        assertEquals(1,tarefa.getId());
        assertEquals("",tarefa.getDescricao());
        assertNull(tarefa.getInicio());
        assertNull(tarefa.getFim());
    }

    @Test
    void mudaDescricao() {
        tarefa.setDescricao("desagil");
        assertEquals("desagil",tarefa.getDescricao());
    }

    @Test
    void momentosValidos() {
    }

    @Test
    void momentosInvalidos() {
    }

    private Momento momentoFalso(int valor, int minimo, int maximo){
        Momento momentofalso = mock(Momento.class);
        when(momentofalso.ajusta(valor,minimo,maximo)).thenReturn(valor);
        return momentofalso;
    }
}
