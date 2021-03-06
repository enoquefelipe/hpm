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
@Table(name = "hpm_contatos")
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email, site, residencial, movel, comercial, fax, obs;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
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
        final Contato other = (Contato) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSite() {
        return site;
    }

    public String getResidencial() {
        return residencial;
    }

    public String getMovel() {
        return movel;
    }

    public String getComercial() {
        return comercial;
    }

    public String getFax() {
        return fax;
    }

    public String getObs() {
        return obs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }

    public void setMovel(String movel) {
        this.movel = movel;
    }

    public void setComercial(String comercial) {
        this.comercial = comercial;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
