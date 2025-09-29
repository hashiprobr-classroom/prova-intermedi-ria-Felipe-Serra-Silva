package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TarefaTest {
    private Momento fim;
    private Momento inicio;
    private Tarefa tarefa;

    @BeforeEach
    void setUp() {
        tarefa = new Tarefa(1);
    }

    @Test
    void constroi() {
        assertEquals(1,tarefa.getId());

    }
}
