package com.devifsc.estagiario.appeventos.entidades;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by estagiario on 29/08/2017.
 */

public class Palestrante {

    private String pale_nome;
    private String pale_descricao_curta;
    private String pale_descricao_longa;

    private ArrayList<Evento> pale_eventos_participa;

    //construtor
    public Palestrante(String pale_nome, String pale_descricao_curta,
                       String pale_descricao_longa) {
        this.pale_nome = pale_nome;
        this.pale_descricao_curta = pale_descricao_curta;
        this.pale_descricao_longa = pale_descricao_longa;

    }

    //gets e sets
    public String getPale_nome() {
        return pale_nome;
    }

    public void setPale_nome(String pale_nome) {
        this.pale_nome = pale_nome;
    }

    public String getPale_descricao_curta() {
        return pale_descricao_curta;
    }

    public void setPale_descricao_curta(String pale_descricao_curta) {
        this.pale_descricao_curta = pale_descricao_curta;
    }

    public String getPale_descricao_longa() {
        return pale_descricao_longa;
    }

    public void setPale_descricao_longa(String pale_descricao_longa) {
        this.pale_descricao_longa = pale_descricao_longa;
    }

    public AbstractList<Evento> getPale_eventos_participa() {
        return pale_eventos_participa;
    }

    public void setPale_eventos_participa(ArrayList<Evento> pale_eventos_participa) {
        this.pale_eventos_participa = pale_eventos_participa;
    }
}
