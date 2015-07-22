package com.mycompany.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "hpm_empresas")
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome, cnpj, razao_social, nome_fantasia, inscricao_estadual;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }
    

}
