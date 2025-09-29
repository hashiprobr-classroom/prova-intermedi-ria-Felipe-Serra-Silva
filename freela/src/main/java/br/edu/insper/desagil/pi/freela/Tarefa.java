package br.edu.insper.desagil.pi.freela;

public class Tarefa {
    private int id;
    private String descricao;
    private Momento inicio;
    private Momento fim;

    public Tarefa(int id) {
        this.id = id;
        this.descricao = "";
        this.inicio = null;
        this.fim = null;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Momento getInicio() {
        return inicio;
    }

    public Momento getFim() {
        return fim;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void atualiza(Momento inicio, Momento fim){
        if( inicio.minutos() > fim.minutos()){
            throw new IllegalArgumentException("Inicio antes do fim");
        }
        this.inicio = inicio;
        this.fim = fim;
    }
}
