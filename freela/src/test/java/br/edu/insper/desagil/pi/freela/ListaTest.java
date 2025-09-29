package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListaTest {
    private Lista lista;

    @BeforeEach
    void setUp() {

        lista = new Lista();
    }

    @Test
    void constroi() {
        assertEquals(0,lista.getTarefas().size());
    }

    @Test
    void adicionaIguais() {
        lista.adiciona(tarefaFalsa(1));
        lista.adiciona(tarefaFalsa(1));
        assertEquals(1,lista.getTarefas().size());

    }

    @Test
    void adicionaDiferentes() {
        /*lista.adiciona(tarefaFalsa(1));
        lista.adiciona(tarefaFalsa(2));
        assertEquals(2,lista.getTarefas().size());*/
    }

    private Tarefa tarefaFalsa(int id){
        Tarefa tarefa_falsa = mock(Tarefa.class);
        when(tarefa_falsa.getId()).thenReturn(id);
        return tarefa_falsa;
    }

}
