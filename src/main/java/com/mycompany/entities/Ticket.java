package com.mycompany.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "hpm_chamados")
public class Ticket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titulo, descricao, estado, tipo, ramal, departamento, arquivo;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date data_abertura, data_modificacao, data_encerramento;

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getData_abertura() {
        return data_abertura;
    }

    public Date getData_modificacao() {
        return data_modificacao;
    }

    public Date getData_encerramento() {
        return data_encerramento;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRamal() {
        return ramal;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getArquivo() {
        return arquivo;
    }
   
    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData_abertura(Date data_abertura) {
        this.data_abertura = data_abertura;
    }

    public void setData_modificacao(Date data_modificacao) {
        this.data_modificacao = data_modificacao;
    }

    public void setData_encerramento(Date data_encerramento) {
        this.data_encerramento = data_encerramento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}
