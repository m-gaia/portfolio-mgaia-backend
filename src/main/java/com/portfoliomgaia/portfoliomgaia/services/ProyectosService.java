
package com.portfoliomgaia.portfoliomgaia.services;

import com.portfoliomgaia.portfoliomgaia.models.Proyectos;
import com.portfoliomgaia.portfoliomgaia.repository.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService {
    
    private final IProyectosRepository iProyectosRepository;
    
    @Autowired 

    public ProyectosService(IProyectosRepository iProyectosRepository) {
        this.iProyectosRepository = iProyectosRepository;
    }
    
    //crud
    
    public Proyectos agregarProyecto(Proyectos proyecto) {
        return iProyectosRepository.save(proyecto);
    }
    
    public List<Proyectos> buscarProyecto(){
        return iProyectosRepository.findAll();
    }
    
    public Proyectos editarProyecto (Proyectos proyecto) {
        return iProyectosRepository.save(proyecto);
    }
    
    public void borrarProyecto (Long idProy){
        iProyectosRepository.deleteById(idProy);
    }
    
    
}
