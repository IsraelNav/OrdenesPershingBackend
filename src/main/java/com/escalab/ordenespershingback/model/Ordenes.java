package com.escalab.ordenespershingback.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ordenes")
public class Ordenes {

    @Id
    @Column(name = "Id_Orden")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idOrden;

    @OneToOne
    @JoinColumn(name = "idEstado", nullable = false, foreignKey = @ForeignKey(name = "FK_ordenes_estado"))
    private Estado estado;

    @OneToOne
    @JoinColumn(name = "idVigencia", nullable = false, foreignKey = @ForeignKey(name = "FK_ordenes_vigencia"))
    private Vigencia vigencia;

    @OneToOne
    @JoinColumn(name = "idTipoCuenta", nullable = false, foreignKey = @ForeignKey(name = "FK_ordenes_tipoCuenta"))
    private TipoCuenta tipoCuenta;

    @OneToOne
    @JoinColumn(name = "idTipoProducto", nullable = false, foreignKey = @ForeignKey(name = "FK_ordenes_tipoProducto"))
    private TipoProducto tipoProducto;

    @OneToOne
    @JoinColumn(name = "idOperacion", nullable = false, foreignKey = @ForeignKey(name = "FK_ordenes_operacion"))
    private Operacion operacion;

    @OneToOne
    @JoinColumn(name = "idTipoOrden", nullable = false, foreignKey = @ForeignKey(name = "FK_ordenes_tipoOrden"))
    private TipoOrden tipoOrden;

    @OneToOne
    @JoinColumn(name = "idMercado", nullable = false, foreignKey = @ForeignKey(name = "FK_ordenes_mercado"))
    private Mercado mercado;

    @OneToOne
    @JoinColumn(name = "idMoneda", nullable = false, foreignKey = @ForeignKey(name = "FK_ordenes_estado"))
    private Moneda moneda;

    @Column(name = "FechaIngreso")
    private LocalDateTime fechaIngreso;

    @Column(name = "FechaIngresadaAgente")
    private String fechaIngresadaAgente;

    @Column(name = "Rut")
    private String rut;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "LLR")
    private String llr;

    @Column(name = "CuentaPershing")
    private String cuentaPershing;

    @Column(name = "AgenteIngresaOrden")
    private String agenteIngresaOrden;

    @Column(name = "Unidades")
    private String unidades;

    @Column(name = "PrecioLimitado")
    private String precioLimitado;

    @Column(name = "MontoEstimado")
    private String montoEstimado;

    @Column(name = "Comision")
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

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public TipoOrden getTipoOrden() {
        return tipoOrden;
    }

    public void setTipoOrden(TipoOrden tipoOrden) {
        this.tipoOrden = tipoOrden;
    }

    public Mercado getMercado() {
        return mercado;
    }

    public void setMercado(Mercado mercado) {
        this.mercado = mercado;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaIngresadaAgente() {
        return fechaIngresadaAgente;
    }

    public void setFechaIngresadaAgente(String fechaIngresadaAgente) {
        this.fechaIngresadaAgente = fechaIngresadaAgente;
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

    public String getCuentaPershing() {
        return cuentaPershing;
    }

    public void setCuentaPershing(String cuentaPershing) {
        this.cuentaPershing = cuentaPershing;
    }

    public String getAgenteIngresaOrden() {
        return agenteIngresaOrden;
    }

    public void setAgenteIngresaOrden(String agenteIngresaOrden) {
        this.agenteIngresaOrden = agenteIngresaOrden;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getPrecioLimitado() {
        return precioLimitado;
    }

    public void setPrecioLimitado(String precioLimitado) {
        this.precioLimitado = precioLimitado;
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
