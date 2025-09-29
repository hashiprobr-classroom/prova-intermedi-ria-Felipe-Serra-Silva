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
        if(tarefas.isEmpty()){
            tarefas.add(tarefa);
        }else {
            for (Tarefa tar_contida : tarefas) {
                if (tarefa.getId() != tar_contida.getId()) {
                    tarefas.add(tarefa);
                }
            }
        }
    }
}
