package com.devifsc.estagiario.appeventos.interfaces;

import com.devifsc.estagiario.appeventos.entidades.Palestrante;

/**
 * Created by estagiario on 29/08/2017.
 */

public interface InterfacePalestrante {
    void cadastrarPalestrante(Palestrante palestrante);
    void modificarPalestrante(Palestrante palestrante);
    void excluirPalestrante(Palestrante palestrante);
    void retornarPalestrante();
}
