
package com.portfoliomgaia.portfoliomgaia.services;

import com.portfoliomgaia.portfoliomgaia.exceptions.UserNotFoundException;
import com.portfoliomgaia.portfoliomgaia.models.Usuario;
import com.portfoliomgaia.portfoliomgaia.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {
    private final IUsuarioRepository iUsuarioRepository;

    @Autowired
    public UsuarioService(IUsuarioRepository iUsuarioRepository) {
        this.iUsuarioRepository = iUsuarioRepository;
    }
    
    //crud
    
    public Usuario agregarUsuario(Usuario usuario) {
        return iUsuarioRepository.save(usuario);
    }

    public List<Usuario> buscarUsuario(){
        return iUsuarioRepository.findAll();
    }
    
    public Usuario buscarIdUsuario (Long id) {
        return iUsuarioRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Usuario no encontrado"));
        
    }
    
    public Usuario editarUsuario (Usuario usuario) {
        return iUsuarioRepository.save(usuario);
    }
    
    public void borrarUsuario (Long id){
        iUsuarioRepository.deleteById(id);
    }

    
    
}
