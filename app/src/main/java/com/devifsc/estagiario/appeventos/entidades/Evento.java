package com.devifsc.estagiario.appeventos.entidades;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by estagiario on 29/08/2017.
 */

public class Evento {

    private String even_titulo;
    private String even_tema;
    private String even_descricao;
    private Date even_data;
    private Time even_hora_inicio;
    private Time even_hora_final;

    private ArrayList<Palestrante> even_palestrantes;

    //construtor
    public Evento(String even_titulo, String even_tema,
                  String even_descricao, Date even_data,
                  Time even_hora_inicio, Time even_hora_final,
                  ArrayList<Palestrante> even_palestrantes) {

        this.even_titulo = even_titulo;
        this.even_tema = even_tema;
        this.even_descricao = even_descricao;
        this.even_data = even_data;
        this.even_hora_inicio = even_hora_inicio;
        this.even_hora_final = even_hora_final;
        this.even_palestrantes = even_palestrantes;
    }

    //gets e sets
    public String getEven_titulo() {
        return even_titulo;
    }

    public void setEven_titulo(String even_titulo) {
        this.even_titulo = even_titulo;
    }

    public String getEven_tema() {
        return even_tema;
    }

    public void setEven_tema(String even_tema) {
        this.even_tema = even_tema;
    }

    public String getEven_descricao() {
        return even_descricao;
    }

    public void setEven_descricao(String even_descricao) {
        this.even_descricao = even_descricao;
    }

    public Date getEven_data() {
        return even_data;
    }

    public void setEven_data(Date even_data) {
        this.even_data = even_data;
    }

    public Time getEven_hora_inicio() {
        return even_hora_inicio;
    }

    public void setEven_hora_inicio(Time even_hora_inicio) {
        this.even_hora_inicio = even_hora_inicio;
    }

    public Time getEven_hora_final() {
        return even_hora_final;
    }

    public void setEven_hora_final(Time even_hora_final) {
        this.even_hora_final = even_hora_final;
    }

    public ArrayList<Palestrante> getEven_palestrantes() {
        return even_palestrantes;
    }

    public void setEven_palestrantes(ArrayList<Palestrante> even_palestrantes) {
        this.even_palestrantes = even_palestrantes;
    }
}
