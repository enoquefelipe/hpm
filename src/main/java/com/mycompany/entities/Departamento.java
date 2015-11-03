package com.mycompany.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "hpm_departamentos")
public class Departamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome, descricao, status;
    
    @OneToOne(cascade = CascadeType.REFRESH)
    private Setor setor;

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Setor getSetor() {
        return setor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
