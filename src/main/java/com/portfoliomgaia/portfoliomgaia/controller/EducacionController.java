
package com.portfoliomgaia.portfoliomgaia.controller;

import com.portfoliomgaia.portfoliomgaia.models.Educacion;
import com.portfoliomgaia.portfoliomgaia.services.EducacionService;
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
@RequestMapping("/educacion")
public class EducacionController {
    
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }
    
    @GetMapping ("/obtener")
    public ResponseEntity<List<Educacion>> obtenerEducacion() {
        List <Educacion> educacion = educacionService.buscarEducacion();
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    
    @PutMapping ("/actualizar")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion) {
        Educacion actualizarEducacion = educacionService.editarEducacion (educacion);
        return new ResponseEntity<> (actualizarEducacion, HttpStatus.OK);
    }
    
    @PostMapping ("/agregar")
    public ResponseEntity<Educacion> agregarEducacion(@RequestBody Educacion educacion) {
        Educacion nuevaEducacion = educacionService.agregarEducacion(educacion);
        return new ResponseEntity <> (nuevaEducacion, HttpStatus.CREATED);
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable ("id")Long id) {
        educacionService.borrarEducacion(id);
        return new ResponseEntity <> (HttpStatus.OK);
    }
    
    
}
