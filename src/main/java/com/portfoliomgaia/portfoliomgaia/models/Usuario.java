
package com.portfoliomgaia.portfoliomgaia.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
            
    private Long Id;
    private String nombre;
    private String apellido;
    private String titulo;
    private int fechaNac;
    private String telefono;
    private String img;
    private String descripcion;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEx")
    private List<Experiencia> experienciaList;
        
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idHab")
    private List<Habilidades> habilidadesList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProy")
    private List<Proyectos> proyectosList;

    public Usuario() {
    }

    public Usuario(Long Id, String nombre, String apellido, String titulo, int fechaNac, String telefono, String img, String descripcion) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.img = img;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(int fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
