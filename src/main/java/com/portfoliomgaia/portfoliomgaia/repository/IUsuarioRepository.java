
package com.portfoliomgaia.portfoliomgaia.repository;

import com.portfoliomgaia.portfoliomgaia.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository <Usuario,Long>{
    
}
