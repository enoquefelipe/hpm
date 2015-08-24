package com.mycompany.dao;

import java.util.List;

/**
 *
 * @author Administrador
 */
public interface Dao {

    void salvar();

    List listar();

    Object selecionar();
    
    void remover();
    
    void atualizar();

}
