
package com.portfoliomgaia.portfoliomgaia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidades {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idHab;
    private String nombreHab;
    private String imgHab;
    private int nivelPorc;

    public Habilidades() {
    }

    public Habilidades(Long idHab, String nombreHab, String imgHab, int nivelPorc) {
        this.idHab = idHab;
        this.nombreHab = nombreHab;
        this.imgHab = imgHab;
        this.nivelPorc = nivelPorc;
    }

    public Long getIdHab() {
        return idHab;
    }

    public void setIdHab(Long idHab) {
        this.idHab = idHab;
    }

    public String getNombreHab() {
        return nombreHab;
    }

    public void setNombreHab(String nombreHab) {
        this.nombreHab = nombreHab;
    }

    public String getImgHab() {
        return imgHab;
    }

    public void setImgHab(String imghab) {
        this.imgHab = imghab;
    }

    public int getNivelPorc() {
        return nivelPorc;
    }

    public void setNivelPorc(int nivelPorc) {
        this.nivelPorc = nivelPorc;
    }
    
    
    
}
