package com.escalab.ordenespershingback.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Size;

@ApiModel(description = "Información o propiedades de los Estados")
@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @Column(name = "Id_Estado")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idEstado;

    @ApiModelProperty(notes = "Nombre dene tener como minimo 3 caracteres")
    @Size(min = 3, max = 20, message = "El nombre de contener entre 3 y 20 caracteres")
    @Column(name = "nombre")
    private String nombre;

    @Size(min = 5, max = 50, message = "El nombre de contener entre 5 y 50 caracteres")
    @Column(name = "descripcion")
    private String descripcion;

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
