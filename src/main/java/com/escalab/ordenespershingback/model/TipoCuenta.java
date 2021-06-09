package com.escalab.ordenespershingback.model;

import javax.persistence.*;

@Entity
@Table(name = "tipocuenta")
public class TipoCuenta {

    @Id
    @Column(name = "Id_TipoCuenta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idTipoCuenta;

    @Column(name = "TipoCuenta")
    private String tipoCuenta;

    public Integer getIdTipoCuenta() {
        return idTipoCuenta;
    }

    public void setIdTipoCuenta(Integer idTipoCuenta) {
        this.idTipoCuenta = idTipoCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
