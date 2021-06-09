package com.escalab.ordenespershingback.dto;

import com.escalab.ordenespershingback.model.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

public class ConsultarOrdenes implements Serializable {

    private Integer idOrden;

    private Estado estado;

    private Vigencia vigencia;

    private Operacion operacion;

    private Mercado mercado;

    private LocalDateTime fechaIngreso;

    private String rut;

    private String nombre;

    private String llr;

    private String montoEstimado;

    private Float comision;

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Vigencia getVigencia() {
        return vigencia;
    }

    public void setVigencia(Vigencia vigencia) {
        this.vigencia = vigencia;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }


    public Mercado getMercado() {
        return mercado;
    }

    public void setMercado(Mercado mercado) {
        this.mercado = mercado;
    }


    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLlr() {
        return llr;
    }

    public void setLlr(String llr) {
        this.llr = llr;
    }


    public String getMontoEstimado() {
        return montoEstimado;
    }

    public void setMontoEstimado(String montoEstimado) {
        this.montoEstimado = montoEstimado;
    }

    public Float getComision() {
        return comision;
    }

    public void setComision(Float comision) {
        this.comision = comision;
    }
}
