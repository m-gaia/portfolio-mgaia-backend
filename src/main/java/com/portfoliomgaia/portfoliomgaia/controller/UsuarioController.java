
package com.portfoliomgaia.portfoliomgaia.controller;

import com.portfoliomgaia.portfoliomgaia.models.Usuario;
import com.portfoliomgaia.portfoliomgaia.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    @GetMapping ("/id/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id) {
        Usuario usuario = usuarioService.buscarIdUsuario(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
    @PutMapping ("/actualizar")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario) {
        Usuario actualizarUsuario = usuarioService.editarUsuario(usuario);
        return new ResponseEntity<> (actualizarUsuario, HttpStatus.OK);
    }
    
}
