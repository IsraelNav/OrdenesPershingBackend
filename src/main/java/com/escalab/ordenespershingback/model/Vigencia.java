package com.escalab.ordenespershingback.model;

import javax.persistence.*;

@Entity
@Table(name = "vigencia")
public class Vigencia {

    @Id
    @Column(name = "Id_Vigencia")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idVigencia;

    @Column(name = "Vigencia")
    private String vigencia;

    public Integer getIdVigencia() {
        return idVigencia;
    }

    public void setIdVigencia(Integer idVigencia) {
        this.idVigencia = idVigencia;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }
}
