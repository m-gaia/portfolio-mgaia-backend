
package com.portfoliomgaia.portfoliomgaia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Experiencia {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idEx;
    private String empresaEx;
    private String puestoEx;
    private int fechaInicioEx;
    private int fechaFinEx;
    private String descripcionEx;
    private String imgEx;

    public Experiencia() {
    }

    public Experiencia(Long idEx, String empresaEx, String puestoEx, int fechaInicioEx, int fechaFinEx, String descripcionEx, String imgEx) {
        this.idEx = idEx;
        this.empresaEx = empresaEx;
        this.puestoEx = puestoEx;
        this.fechaInicioEx = fechaInicioEx;
        this.fechaFinEx = fechaFinEx;
        this.descripcionEx = descripcionEx;
        this.imgEx = imgEx;
    }

    public Long getIdEx() {
        return idEx;
    }

    public void setIdEx(Long idEx) {
        this.idEx = idEx;
    }
    
    public String getEmpresaEx() {
        return empresaEx;
    }

    public void setEmpresaEx(String empresaEx) {
        this.empresaEx = empresaEx;
    }

    public String getPuestoEx() {
        return puestoEx;
    }

    public void setPuestoEx(String puestoEx) {
        this.puestoEx = puestoEx;
    }

    public int getFechaInicioEx() {
        return fechaInicioEx;
    }

    public void setFechaInicioEx(int fechaInicioEx) {
        this.fechaInicioEx = fechaInicioEx;
    }
    
    public int getFechaFinEx() {
        return fechaFinEx;
    }

    public void setFechaFinEx(int fechaFinEx) {
        this.fechaFinEx = fechaFinEx;
    }

    public String getDescripcionEx() {
        return descripcionEx;
    }

    public void setDescripcionEx(String descripcionEx) {
        this.descripcionEx = descripcionEx;
    }

    public String getImgEx() {
        return imgEx;
    }

    public void setImgEx(String imgEx) {
        this.imgEx = imgEx;
    }
    
    
    
}
