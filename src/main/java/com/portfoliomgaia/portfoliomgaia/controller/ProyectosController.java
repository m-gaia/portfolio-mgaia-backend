
package com.portfoliomgaia.portfoliomgaia.controller;

import com.portfoliomgaia.portfoliomgaia.models.Proyectos;
import com.portfoliomgaia.portfoliomgaia.services.ProyectosService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    
    private final ProyectosService proyectosService;

    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }
    
    @GetMapping ("/obtener")
    public ResponseEntity<List<Proyectos>> obtenerProyecto() {
        List <Proyectos> proyecto = proyectosService.buscarProyecto();
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }
    
    @PutMapping ("/actualizar")
    public ResponseEntity<Proyectos> editarProyecto(@RequestBody Proyectos proyectos) {
        Proyectos actualizarProyecto = proyectosService.editarProyecto (proyectos);
        return new ResponseEntity<> (actualizarProyecto, HttpStatus.OK);
    }
    
    @PostMapping ("/agregar")
    public ResponseEntity<Proyectos> agregarProyecto(@RequestBody Proyectos proyectos) {
        Proyectos nuevoProyecto = proyectosService.agregarProyecto(proyectos);
        return new ResponseEntity <> (nuevoProyecto, HttpStatus.CREATED);
    }
    
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable ("id")Long id) {
        proyectosService.borrarProyecto(id);
        return new ResponseEntity <> (HttpStatus.OK);
    }
    
    
}
