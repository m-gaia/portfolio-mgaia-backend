
package com.portfoliomgaia.portfoliomgaia.services;

import com.portfoliomgaia.portfoliomgaia.models.Habilidades;
import com.portfoliomgaia.portfoliomgaia.repository.IHabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HabilidadesService {
    
    private final IHabilidadesRepository iHabilidadesRepository;
    
    @Autowired

    public HabilidadesService(IHabilidadesRepository iHabilidadesRepository) {
        this.iHabilidadesRepository = iHabilidadesRepository;
    }
    
    //crud
    
    public Habilidades agregarHabilidad(Habilidades habilidad) {
        return iHabilidadesRepository.save(habilidad);
    }
    
    public List<Habilidades> buscarHabilidad(){
        return iHabilidadesRepository.findAll();
    }
    
    public Habilidades editarHabilidad (Habilidades habilidad) {
        return iHabilidadesRepository.save(habilidad);
    }
    
    public void borrarHabilidad (Long idHab){
        iHabilidadesRepository.deleteById(idHab);
    }
    
    
}
