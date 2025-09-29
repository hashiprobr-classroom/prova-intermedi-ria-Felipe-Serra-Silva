package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer,Integer> limite;

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        Map<Integer, Integer> limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(int dia, int mes, int ano){
        this.ano = ajusta(ano,1970,2070);
        this.mes = ajusta(mes,1,12);
        this.dia = ajusta(dia,1,limite.get(this.mes));
    }

    @Override
    public int minutos() {
        int somadias = 365*(ano - 1970)+ dia - 1;
        for(int mesi : limite.keySet()){
            if(mesi < mes){
                somadias += limite.get(mesi);
            }
        }
        return somadias*24*60;
    }
}
