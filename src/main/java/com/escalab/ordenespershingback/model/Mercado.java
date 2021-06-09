package com.escalab.ordenespershingback.model;

import javax.persistence.*;

@Entity
@Table(name = "mercado")
public class Mercado {

    @Id
    @Column(name = "Id_Mercado")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idMercado;

    @Column(name = "Mercado")
    private String mercado;

    public Integer getIdMercado() {
        return idMercado;
    }

    public void setIdMercado(Integer idMercado) {
        this.idMercado = idMercado;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }
}
