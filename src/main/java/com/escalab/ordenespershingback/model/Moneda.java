package com.escalab.ordenespershingback.model;

import javax.persistence.*;

@Entity
@Table(name = "moneda")
public class Moneda {

    @Id
    @Column(name = "Id_Moneda")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idMoneda;

    @Column(name = "Moneda")
    private String moneda;

    public Integer getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(Integer idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}
