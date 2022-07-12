
package com.portfoliomgaia.portfoliomgaia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idProy;
    private String nombreProy;
    private String imgProy;
    private String urlProy;
    private String descripcionProy;
    private int anioProy;

    public Proyectos() {
    }

    public Proyectos(Long idProy, String nombreProy, String imgProy, String urlProy, String descripcionProy, int anioProy) {
        this.idProy = idProy;
        this.nombreProy = nombreProy;
        this.imgProy = imgProy;
        this.urlProy = urlProy;
        this.descripcionProy = descripcionProy;
        this.anioProy = anioProy;
    }

    public Long getIdProy() {
        return idProy;
    }

    public void setIdProy(Long idProy) {
        this.idProy = idProy;
    }

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public String getImgProy() {
        return imgProy;
    }

    public void setImgProy(String imgProy) {
        this.imgProy = imgProy;
    }

    public String getUrlProy() {
        return urlProy;
    }

    public void setUrlProy(String urlProy) {
        this.urlProy = urlProy;
    }

    public String getDescripcionProy() {
        return descripcionProy;
    }

    public void setDescripcionProy(String descripcionProy) {
        this.descripcionProy = descripcionProy;
    }

    public int getAnioProy() {
        return anioProy;
    }

    public void setAnioProy(int anioProy) {
        this.anioProy = anioProy;
    }
    
    
    
}
