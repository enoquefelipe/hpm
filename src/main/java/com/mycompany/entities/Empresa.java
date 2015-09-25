package com.mycompany.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

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
    private String razao_social, nome_fantasia, inscricao_estadual, cnpj;

//    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, optional = true)
//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToOne(cascade = CascadeType.ALL, optional = true)
    private Contato contato;

//    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, optional = true)
    @OneToOne(cascade = CascadeType.ALL, optional = true)
//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private Endereco endereco;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Contato getContato() {
        return contato;
    }

    public Endereco getEndereco() {
        return endereco;
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

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
