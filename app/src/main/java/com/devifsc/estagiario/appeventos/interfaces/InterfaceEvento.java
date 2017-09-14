package com.devifsc.estagiario.appeventos.interfaces;

import com.devifsc.estagiario.appeventos.entidades.Evento;

/**
 * Created by estagiario on 29/08/2017.
 */

public interface InterfaceEvento {
    void cadastrarEvento(Evento evento);
    void modificarEvento(Evento evento);
    void excluirEvento(Evento evento);
    void retornarEvento();
}
