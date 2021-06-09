package com.escalab.ordenespershingback.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "tipoproducto")
public class TipoProducto {

    @Id
    @Column(name = "Id_TipoProducto")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idTipoProducto;

    @Column(name = "TipoProducto")
    private String tipoProducto;

    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
