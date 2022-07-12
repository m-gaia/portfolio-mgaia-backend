
package com.portfoliomgaia.portfoliomgaia.services;

import com.portfoliomgaia.portfoliomgaia.models.Experiencia;
import com.portfoliomgaia.portfoliomgaia.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    private final IExperienciaRepository iExperienciaRepository;
    
    @Autowired
    public ExperienciaService(IExperienciaRepository iExperienciaRepository) {
        this.iExperienciaRepository = iExperienciaRepository;
    }
    
// crud
    
    public Experiencia agregarExperiencia(Experiencia experiencia) {
        return iExperienciaRepository.save(experiencia);
    }
    
    public List<Experiencia> buscarExperiencia(){
        return iExperienciaRepository.findAll();
    }
    
    public Experiencia editarExperiencia (Experiencia experiencia) {
        return iExperienciaRepository.save(experiencia);
    }
    
    public void borrarExperiencia (Long id){
        iExperienciaRepository.deleteById(id);
    }
}
