
package com.portfoliomgaia.portfoliomgaia.services;

import com.portfoliomgaia.portfoliomgaia.models.Educacion;
import com.portfoliomgaia.portfoliomgaia.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//p/ implementacion de metodos y union con el controlador 
@Transactional
public class EducacionService {
    private final IEducacionRepository iEducacionRepository;

//inyeccion
    @Autowired
    public EducacionService(IEducacionRepository iEducacionRepository) {
        this.iEducacionRepository = iEducacionRepository;
    }
    
//crud
//retorna implementacion del metodo guardar educacion, controlador envia educacion de angular 
//e implementa save JpaRepository y este con bbdd
    public Educacion agregarEducacion(Educacion educacion) {
        return iEducacionRepository.save(educacion);
    }
    
    public List<Educacion> buscarEducacion(){
        return iEducacionRepository.findAll();
    }
    
    public Educacion editarEducacion (Educacion educacion) {
        return iEducacionRepository.save(educacion);
    }
    
    public void borrarEducacion (Long id){
        iEducacionRepository.deleteById(id);
    }
    
}
