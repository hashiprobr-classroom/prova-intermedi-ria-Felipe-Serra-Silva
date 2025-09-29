package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> tarefas;

    public Lista() {
        this.tarefas = new ArrayList<>();
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void adiciona(Tarefa tarefa) {
        for(Tarefa tar_contida : tarefas){
            int id_contido = tar_contida.getId();
            if(tarefa.getId() != id_contido){
                tarefas.add(tarefa);
            }
        }
    }
}
