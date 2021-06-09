package com.escalab.ordenespershingback.model;

import org.springframework.objenesis.SpringObjenesis;

import javax.persistence.*;

@Entity
@Table(name = "tipoorden")
public class TipoOrden {

    @Id
    @Column(name = "Id_TipoOrden")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idTipoOrden;

    @Column(name = "TipoOrden")
    private String tipoOrden;

    public Integer getIdTipoOrden() {
        return idTipoOrden;
    }

    public void setIdTipoOrden(Integer idTipoOrden) {
        this.idTipoOrden = idTipoOrden;
    }

    public String getTipoOrden() {
        return tipoOrden;
    }

    public void setTipoOrden(String tipoOrden) {
        this.tipoOrden = tipoOrden;
    }
}
