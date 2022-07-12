
package com.portfoliomgaia.portfoliomgaia.controller;

import com.portfoliomgaia.portfoliomgaia.models.Experiencia;
import com.portfoliomgaia.portfoliomgaia.services.ExperienciaService;
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
@RequestMapping("/experiencia")
public class ExperienciaController {
    
    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }
    
    @GetMapping ("/obtener")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia() {
        List <Experiencia> experiencia = experienciaService.buscarExperiencia();
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }
    
    @PutMapping ("/actualizar")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia actualizarExperiencia = experienciaService.editarExperiencia (experiencia);
        return new ResponseEntity<> (actualizarExperiencia, HttpStatus.OK);
    }
    
    @PostMapping ("/agregar")
    public ResponseEntity<Experiencia> agregarExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia nuevaExperiencia = experienciaService.agregarExperiencia(experiencia);
        return new ResponseEntity <> (nuevaExperiencia, HttpStatus.CREATED);
    }
    
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable ("id")Long id) {
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity <> (HttpStatus.OK);
    }
    
    
}
