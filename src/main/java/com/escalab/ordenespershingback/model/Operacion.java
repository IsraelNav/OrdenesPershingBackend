package com.escalab.ordenespershingback.model;

import javax.persistence.*;

@Entity
@Table(name = "operacion")
public class Operacion {

    @Id
    @Column(name = "Id_Operacion")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idOperacion;

    public Integer getIdOperacion() {
        return idOperacion;
    }


    @Column(name = "Operacion")
    private String operacion;

    public void setIdOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
