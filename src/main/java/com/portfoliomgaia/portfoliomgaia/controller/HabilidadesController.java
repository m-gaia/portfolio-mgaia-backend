
package com.portfoliomgaia.portfoliomgaia.controller;

import com.portfoliomgaia.portfoliomgaia.models.Habilidades;
import com.portfoliomgaia.portfoliomgaia.services.HabilidadesService;
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
@RequestMapping("/habilidades")
public class HabilidadesController {
    
    private final HabilidadesService habilidadesService;

    public HabilidadesController(HabilidadesService habilidadesService) {
        this.habilidadesService = habilidadesService;
    }
    
    @GetMapping ("/obtener")
    public ResponseEntity<List<Habilidades>> obtenerHabilidad() {
        List <Habilidades> habilidades = habilidadesService.buscarHabilidad();
        return new ResponseEntity<>(habilidades, HttpStatus.OK);
    }
    
    @PutMapping ("/actualizar")
    public ResponseEntity<Habilidades> editarHabilidad(@RequestBody Habilidades habilidades) {
        Habilidades actualizarHabilidad = habilidadesService.editarHabilidad (habilidades);
        return new ResponseEntity<> (actualizarHabilidad, HttpStatus.OK);
    }
    
    @PostMapping ("/agregar")
    public ResponseEntity<Habilidades> agregarHabilidad(@RequestBody Habilidades habilidades) {
        Habilidades nuevaHabilidad = habilidadesService.agregarHabilidad(habilidades);
        return new ResponseEntity <> (nuevaHabilidad, HttpStatus.CREATED);
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public ResponseEntity<?> borrarHabilidad (@PathVariable ("id")Long id) {
        habilidadesService.borrarHabilidad(id);
        return new ResponseEntity <> (HttpStatus.OK);
    }
    
    
}
